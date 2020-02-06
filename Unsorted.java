import java.util.Arrays;

public class Unsorted {
    static int isMember(int[] array, int key) {
        // Call program (i).
        int[] sorted = Sort.sort(array);
        // Call program (ii).
        int result = Sorted.isMember(sorted, key);
        return result;
    }
}