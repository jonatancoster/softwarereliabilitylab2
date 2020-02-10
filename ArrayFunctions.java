import java.util.Arrays;

public class ArrayFunctions {
    // Program (iii). Returns 1 if the key is in the input array.
    // Returns 0 otherwise.
    static boolean isMemberOfUnsortedArray(int[] array, int key) {
        // Call program (i).
        int[] sorted = sort(array);
        // Call program (ii).
        boolean result = isMemberOfSortedArray(sorted, key);
        return result;
    }
    
    
    
    // Program (i).
    static int[] sort(int[] array) {
      int n = array.length; 
      for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
          if (array[j] > array[j+1]) { 
                  // swap arr[j+1] and arr[i] 
                  int temp = array[j]; 
                  array[j] = array[j+1]; 
                  array[j+1] = temp; 
          } 
        }     
      }
      return array;
    }



    // Program (ii)
    static boolean isMemberOfSortedArray(int[] array, int key) {
        int result = binarySearch(array, key);
        if(result >= 0) {
            return true;
        } else {
            return false;
        }
    }




    static int binarySearch(int[] array, int key) {
      int l = 0;
      int r = array.length - 1; 
        while (l <= r) { 
            int m = l + (r - l) / 2; 
  
            // Check if x is present at mid 
            if (array[m] == key) 
                return m; 
  
            // If x greater, ignore left half 
            if (array[m] < key) 
                l = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                r = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1;
    }
}