package sort;

import static sort.SortUtils.print;
import static sort.SortUtils.swap;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {3, 6, 0, 7, 4, 8, 2, 1, 5, 9};
        quickSort.sort(array);
        print(array);
    }

    public void sort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    private void doSort(int[] array, int left, int right) {
        if (left >= right) return;

        int i = left - 1, j = right + 1, mid = array[left + right >> 1];

        while (i < j) {
            do i ++; while (array[i] < mid);
            do j --; while (array[j] > mid);
            if(i < j) swap(array, i, j);
        }

        doSort(array, left, j);
        doSort(array, j + 1, right);
    }
}
