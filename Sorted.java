import java.util.Arrays;

public class Sorted {
    static int isMember(int[] array, int key) {
        int result = Arrays.binarySearch(array, key);
        if(result >= 0) {
            return 1;
        } else {
            return 0;
        }
    }
}