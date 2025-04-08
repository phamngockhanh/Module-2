package ss3_array.bai_tap;

import java.util.Scanner;

public class GiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i =0;i<arr.length;i++){
            System.out.printf("At position %d have value: ",i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Array is: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        int minValue = arr[0];
        for (int i  = 1; i < arr.length; i++) {
            if(arr[i]<minValue){
                minValue = arr[i];
            }
        }
        System.out.printf("Min value is %d",minValue);
    }
}
