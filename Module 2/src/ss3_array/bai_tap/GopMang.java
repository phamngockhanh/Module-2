package ss3_array.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1 length: ");
        int length1 = sc.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("At position " + i + " have value:");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter array2 length: ");
        int length2 = sc.nextInt();
        int[] array2 = new int[length2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("At position " + i + " have value:");
            array2[i] = sc.nextInt();
        }

        int[] array3 = new int[length1 + length2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }
        System.out.println("After combine: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }

    }
}
