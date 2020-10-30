package sort;

import static sort.SortUtils.print;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {3, 6, 0, 7, 4, 8, 2, 1, 5, 9};
        insertionSort.sort(array);
        print(array);
    }

    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int k = array[i];
            while (i - 1 >= 0 && array[i - 1] > k) {
                array[i] = array[i - 1];
                i--;
            }
            array[i] = k;
        }
    }
}
