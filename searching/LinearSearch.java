package searching;

public class LinearSearch {
    public boolean search(int[] arr, int x) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == x) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }
}
