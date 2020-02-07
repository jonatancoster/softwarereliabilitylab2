import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
      int[] unsorted = new int[]{5,9,3,7,5,1,0,9,8};
      System.out.println(Arrays.toString(unsorted));
      
      int key = 5;
      
      int member = ArrayFunctions.isMemberOfUnsortedArray(unsorted, key);
      
      System.out.println(member);
      
      System.out.println(Arrays.toString(unsorted));
    }
}