package ss3_array.bai_tap;

import java.util.Scanner;

public class PhanTuLonNhatMangDaChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows length: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols length: ");
        int cols = sc.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Input element in array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("At position [%d][%d]: ", i, j);
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("After input element: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("Max value in matrix is: " + maxValue);
    }
}
