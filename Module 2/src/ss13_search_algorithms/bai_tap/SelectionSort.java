package ss13_search_algorithms.bai_tap;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrs = {3, 2, 4, 5, 1, 8, 9, 7, 19};
        int position;
        for (int i = 0; i < arrs.length - 1; i++) {
            position = i;
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[position] > arrs[j]) {
                    position = j;
                }
            }
            if (position!=i) {
                int temp = arrs[i];
                arrs[i] = arrs[position];
                arrs[position] = temp;
            }
        }
        System.out.println(Arrays.toString(arrs));
    }
}
