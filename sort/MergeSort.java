package sort;

import static sort.SortUtils.print;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {3, 6, 0, 7, 4, 8, 2, 1, 5, 9};
        mergeSort.sort(array);
        print(array);
    }

    public void sort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    private void doSort(int[] array, int left, int right) {
        if (left >= right) return;

        int mid = left + right >> 1;
        doSort(array, left, mid);
        doSort(array, mid + 1, right);

        int i = left, j = mid + 1, k = 0;
        int[] tmp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            if (array[i] < array[j]) tmp[k++] = array[i++];
            else tmp[k++] = array[j++];
        }

        while (i <= mid) tmp[k++] = array[i++];
        while (j <= right) tmp[k++] = array[j++];

        for (i = left, j = 0; i <= right; i++, j++) array[i] = tmp[j];
        // System.arraycopy(tmp, 0, array, left, right - left + 1);
    }
}
