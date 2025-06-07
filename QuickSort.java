import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10, 15, 32, 23, 4, 9, 11, 6 };
        System.out.println("before sorting : " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("After sorting : " + Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        // TODO Auto-generated method stub

        int pivot = 0;
        if (high > low) {
            pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // TODO Auto-generated method stub
        int left, right, pivot_item = arr[low];
        left = low;
        right = high;
        while (left < right) {
            while (arr[left] <= pivot_item) {
                left++;
            }
            while (arr[right] > pivot_item) {
                right--;
            }
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                arr[low] = arr[right];
                arr[right] = pivot_item;

            }
        }
        return right;
    }
}
