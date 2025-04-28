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
        int result = binarySearch(arr, 0, arr.length , 8);
        if (result == -1) {
            System.out.println("Can not find this value");
        } else {
            System.out.printf("Position in array is %d", result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if(left<=right){
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                 left = middle + 1;
            } else {
                right = middle -1 ;
            }
            return binarySearch(array,left,right,value);
        }
        return - 1;
    }
}
