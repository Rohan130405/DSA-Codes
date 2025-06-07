package sorting;

import java.util.Arrays;

public class InsertionSort {
    public String sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int k = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > k) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = k;
        }
        return Arrays.toString(arr);
    }
}
