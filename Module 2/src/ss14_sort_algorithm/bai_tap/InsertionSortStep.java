package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;

public class InsertionSortStep {
    public static void main(String[] args) {
        int[] arr = {8,9,12,14,7,6,5,4};
        insertionSort(arr);
    }

    public static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > x) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = x;
            System.out.printf("Mảng sau khi đổi lần thứ %d ",i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
