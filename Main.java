import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

      try{
        File testCases = new File("pairwise.txt");
        Scanner scanner = new Scanner(testCases);
        scanner.nextLine();
        while (scanner.hasNextLine()) {

          // Read a test case.
          String[] row = scanner.nextLine().split("\t");

          // The key is the lase element on the line.
          int key = Integer.parseInt(row[row.length - 1]);

          // The array is made of all elements on the line except the last one.
          String[] modifiedRow = Arrays.copyOf(row, row.length - 1);
          int[] array = stringArrayToIntArray(modifiedRow);

          // Ask the oracle if the key is in the array.
          boolean oracleResult = oracle(array, key);
          
          // Use algorithm to check if the key is in the array.
          int result = ArrayFunctions.isMemberOfUnsortedArray(array, key);
          

          System.out.println(Arrays.toString(array) + "\t" + key + "\t" + result + "\t" + oracleResult);
        }
        scanner.close();
      } catch(FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      
    }





    private static int[] stringArrayToIntArray(String[] stringArray) {
      int[] intArray = new int[stringArray.length];   
      for(int i = 0; i < stringArray.length; i++) {
        intArray[i] = Integer.parseInt(stringArray[i]);
      }
      return intArray;
    }





    private static boolean oracle(int[] array, int key) {
      for(int element: array) {
        if(element == key) {
          return true;
        }
      }
      return false;
    }
}