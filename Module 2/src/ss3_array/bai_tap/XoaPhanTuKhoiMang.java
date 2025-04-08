package ss3_array.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("At index " + i + " have value: ");
            array[i] = sc.nextInt();
        }
        System.out.println("Before delete: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        System.out.print("Enter number you want to delete: ");
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                int temp = array[i];
                array[i] = array[array.length - 1 - flag];
                array[array.length - 1 - flag] = temp;
                flag++;
            }
            if (i == array.length - 1) {
                System.out.println("Not found this value in array");
            }
        }
        System.out.println("After: ");
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - flag) {
                System.out.print(array[i] + "\t");
            }
        }

    }
}
