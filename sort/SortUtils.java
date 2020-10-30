package sort;

import java.util.Arrays;

public class SortUtils {

    static void swap(int[] array, int idx, int idy) {
        int swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
    }

    static void print(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
