package sort;

import java.util.Arrays;

import static sort.SortUtils.*;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {3, 6, 0, 9, 4, 8, 2, 1, 5, 7};
        bubbleSort.sort(array);
        print(array);
    }

    public void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            boolean swapped = false;
            for (int j = 0; j + 1 <= i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                // 本轮没有替换, 提前结束
                break;
            }
        }
    }
}
