import java.util.*;

import java.awt.*;

public class Percolation {

  public static void main(String args[]) {

    int xNum = 100;

    int yNum = 100;

    System.out.println("PercolationStats " + xNum + "  " + yNum);

    long startTime = System.currentTimeMillis();

    Stats newPercolation = new Stats(xNum, yNum);

    System.out.println("mean()                     = " +
      newPercolation.mean());

    System.out.println("stddev()                    = " +
      newPercolation.standardDeviation());

    System.out.println("confidenceLow()        = " +
      newPercolation.confidenceLow());

    System.out.println("confidenceHigh()       = " +
      newPercolation.confidenceHigh());

    long endTime = System.currentTimeMillis();

    System.out.println("elapsed time             = " +
      (endTime - startTime) / 1000.00);

  }
}

class Grid {

  private int size;

  private Map < Integer, ArrayList < Integer >> openTiles =
    new TreeMap < Integer, ArrayList < Integer >> ();

  public Grid(int num) {

    size = num;

  }

  public void open(int row, int col) {

    test();
    System.out.println("\n");

    ArrayList < Integer > temp = new ArrayList < Integer > ();

    if (openTiles.get(row) == (null)) {

      temp.add(col);

      openTiles.put(row, temp);

    } else {

      temp = openTiles.get(row);

      temp.add(col);

      openTiles.put(row, temp);

    }

  }

  public boolean isOpen(int row, int col) {

    if (openTiles.get(row) != (null)) {

      if (openTiles.get(row).contains(col)) {

        return true;

      }

    }

    return false;

  }

  public boolean isFull(Point start, ArrayList < Point > visitedPoints) {

    if (visitedPoints == null) {

      visitedPoints = new ArrayList < Point > ();

    }

    visitedPoints.add(start);

    if (start.getY() == size - 1) {

      return true;

    } else {

      ArrayList < Point > trail = new ArrayList < Point > ();

      ArrayList < Integer > sameRow = openTiles.get((int) start.getY());

      if (sameRow.contains(start.getX() + 1)) {

        trail.add(new Point((int) start.getX() + 1, (int) start.getY()));

      }
      if (sameRow.contains(start.getX() - 1)) {

        trail.add(new Point((int) start.getX() - 1, (int) start.getY()));

      }

      if (openTiles.get((int) start.getY() + 1) != null) {

        if (openTiles.get((int) start.getY() + 1).contains((int) start.getX())) {

          trail.add(new Point((int) start.getX(),
            (int) start.getY() + 1));

        }

      }

      for (int i = 0; i < trail.size(); i++) {

        if (visitedPoints.contains(trail.get(i)) == false) {

          if (isFull(trail.get(i), visitedPoints) == true) {

            return true;

          }

        }

      }

      return false;

    }

  }

  public int numberOfOpenSites() {

    int numOpenSites = 0;

    for (int i = 0; i < openTiles.size(); i++) {

      ArrayList < Integer > list = openTiles.get(i);

      if (list != null) {

        numOpenSites += list.size();

      }

    }

    return numOpenSites;

  }

  public boolean percolates() {

    if (openTiles.keySet().size() != size) {

      return false;

    }

    ArrayList < Integer > upperOpenTiles = openTiles.get(0);

    for (int i = 0; i < upperOpenTiles.size(); i++) {

      if (isFull(new Point(upperOpenTiles.get(i), 0), null)) {

        return true;

      }

    }

    return false;

  }

  public void test() {

    char[][] visual = new char[size][size];

    for (int row = 0; row < size; row++) {

      ArrayList < Integer > filledRow = openTiles.get(row);

      if (filledRow == null) {

        filledRow = new ArrayList < Integer > ();

      }

      for (int col = 0; col < size; col++) {

        if (filledRow.contains(col)) {

          System.out.print('X');

        } else {

          System.out.print('O');

        }

      }

      System.out.print("\n");

    }

  }

  // public static void main(String args[]){
  //          int gridSize = 100;
  //          Grid tester = new Grid(gridSize);
  //          while(tester.percolates()==false){
  //             tester.open((int)(Math.random() * gridSize), (int)(Math.random() * gridSize));
  //             System.out.println(tester.numberOfOpenSites());
  //             System.out.println("\n");
  //             tester.test();
  //             System.out.println("\n");
  //          }
  //       }
}

class Stats {

  int[] tilesUntilPercolation;

  int size;

  int numTrials;

  public Stats(int size, int trials) {

    this.size = size;

    numTrials = trials;

    tilesUntilPercolation = new int[trials];

    for (int i = 0; i < trials; i++) {

      System.out.println(((double) i / trials) * 100 + "% - " + i + "/" +
        trials);

      Grid perc = new Grid(size);

      while (!perc.percolates()) {

        boolean openedTile = false;

        while (!openedTile) {

          int rowPoke = (int)(Math.random() * size);

          int columnPoke = (int)(Math.random() * size);

          if (!perc.isOpen(rowPoke, columnPoke)) {

            perc.open(rowPoke, columnPoke);

            openedTile = true;

          }

        }

      }

      tilesUntilPercolation[i] = perc.numberOfOpenSites();

    }

  }

  public double mean() {

    double mean = 0;

    for (int i = 0; i < tilesUntilPercolation.length; i++) {

      mean += (tilesUntilPercolation[i] / (double)(size * size));

    }
    return (mean / numTrials);

  }

  public double standardDeviation() {

    double[] mean = new double[numTrials];

    for (int i = 0; i < tilesUntilPercolation.length; i++) {

      mean[i] = (tilesUntilPercolation[i] / (double)(size * size));

    }
    double meanTotal = 0;

    for (int i = 0; i < mean.length; i++) {

      meanTotal += mean[i];

    }
    meanTotal /= numTrials;

    double stdDev = 0;

    for (int i = 0; i < mean.length; i++) {

      stdDev += (mean[i] - meanTotal) * (mean[i] - meanTotal);

    }
    return Math.sqrt((stdDev) / (numTrials));

  }

  public double confidenceLow() {

    return (mean() - 1.96 * (standardDeviation() / Math.sqrt(numTrials)));

  }

  public double confidenceHigh() {

    return (mean() + 1.96 * (standardDeviation() / Math.sqrt(numTrials)));

  }

}
