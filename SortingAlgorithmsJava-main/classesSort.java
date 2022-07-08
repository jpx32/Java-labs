public class sweetSortingAlgorithmForClasses{
   public static void main (String args[]){
   }
     public void sort(){
    int n = slices.size();  
    for (int k = 1; k < n; k++) {  
      Slice key = slices.get(k);  
      int j = k-1;  
      while ( (j > -1) && ( slices.get(j).getPrizeAmount() > key.getPrizeAmount() ) ) {  
          slices.set(j+1,slices.get(j));
          j--;  
      }  
      slices.set(j+1,key);  
    }
  }

}