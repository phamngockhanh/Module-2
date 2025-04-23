package ss13_search_algorithms.bai_tap;

import java.util.Arrays;

public class SearchAlgorithm {
    public static void main(String[] args) {
        int[] arr = {6, 5, 9, 8, 4, 7, 10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[i] > arr[j + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int result = binarySearch(arr, 0, arr.length, 5);
        if (result == -1){
            System.out.println("Can not find this value");
        }else{
            System.out.printf("Position in array is %d",result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle;
        int count = 0;
        boolean flag = false;
        middle = (left + right) / 2;


        while (count < array.length) {
            if (array[middle] == value) {
                flag = true;
                break;
            }
            if (value > array[middle]) {
                middle += 1;
            }
            if (value < array[middle]) {
                middle -= 1;
            }
            count++;
        }
        if (!flag) {
            return -1;
        }
        return middle;
    }
}
