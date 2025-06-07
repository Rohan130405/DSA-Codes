import sorting.*;

public class sort {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 10, 15, 32, 23, 4, 9, 2, 11, 6 };
        BubbleSort obj1 = new BubbleSort();
        System.out.println("From BubbleSort : " + obj1.sort(arr));
        SelectionSort obj2 = new SelectionSort();
        System.out.println("From Selection Sort: " + obj2.sort(arr));
        InsertionSort obj3 = new InsertionSort();
        System.out.println("From Insertion Sort: " + obj3.sort(arr));
    }
}
