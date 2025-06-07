import java.util.*;
public class dummy {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int sum2 = 0;
            for (int j = i + 1; j < n; j++) {
                sum2 += arr[j];
            }
            arr[i] = Math.abs(sum - sum2);
        }
        System.out.println(Arrays.toString(arr));
    }
}
