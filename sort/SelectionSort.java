package sort;

import static sort.SortUtils.print;
import static sort.SortUtils.swap;

public class SelectionSort {

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {3, 6, 0, 7, 4, 8, 2, 1, 5, 9};
        selectionSort.sort(array);
        print(array);
    }

    public void sort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            // 初始化最小值索引
            int min = i;

            // 寻找最小值索引
            for (int j = i + 1; j < len; j++) {
                if (array[min] < array[j]) {
                    min = j;
                }
            }

            // 最小值索引已更改, 交换
            if (min != i) {
                swap(array, i, min);
            }
        }
    }
}
