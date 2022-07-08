int n = arr.length;  
    for (int k = 1; k < n; k++) {  
      String key = arr[k];  
      int j = k-1;  
      while ( (j > -1) && (arr[j].compareTo(key) > 0) ) {  
          arr[j+1]=arr[j];
          j--;  
      }  
      arr[j+1]=key; 
      for(int i = 0; i < n; i++){
        System.out.print(arr[i]+" ");
      }
      System.out.print("\n");
    }