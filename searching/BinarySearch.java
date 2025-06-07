package searching;
import java.util.Arrays;

public class BinarySearch {
    public boolean search(int[] arr, int x) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return true;
            } else if (arr[mid] < x) {
                start = mid + 1;
                mid = (start + end) / 2;
            } else {
                end = mid - 1;
                mid = (start + end) / 2;
            }
        }

        return false;
    }
}
