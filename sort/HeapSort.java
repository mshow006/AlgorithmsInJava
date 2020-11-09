package sort;

import static sort.SortUtils.print;
import static sort.SortUtils.swap;

public class HeapSort {

    public static void main(String[] args) {
        HeapSort heapSort = new HeapSort();
        int[] arr = {0, 6, 3, 7, 4, 8, 2, 1, 9, 5};
        heapSort.sort(arr, arr.length - 1);
        print(arr);
    }

    public void sort(int[] arr, int n) {
        int size = n;
        for (int i = 1; i <= size; i++) {
            push_up(arr, i);
        }
        for (int i = 1; i <= n; i++) {
            swap(arr, 1, size);
            size--;
            push_down(arr, size, 1);
        }
    }

    private void push_down(int[] arr, int size, int u) {
        int t = u, left = u * 2, right = u * 2 + 1;
        if (left <= size && arr[left] > arr[t]) t = left;
        if (right <= size && arr[right] > arr[t]) t = right;
        if (u != t) {
            swap(arr, u, t);
            push_down(arr, size, t);
        }
    }

    private void push_up(int[] arr, int u) {
        while (u / 2 > 0 && arr[u / 2] < arr[u]) {
            swap(arr, u / 2, u);
            u /= 2;
        }
    }
}
