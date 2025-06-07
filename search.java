import searching.*;

public class search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        BinarySearch bs = new BinarySearch();
        LinearSearch ls = new LinearSearch();
        System.out.println("from binary search: " + bs.search(arr, 6));
        System.out.println("from linear search: " + ls.search(arr, 3));
    }

}
