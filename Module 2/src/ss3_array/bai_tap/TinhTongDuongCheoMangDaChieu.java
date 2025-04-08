package ss3_array.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoMangDaChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
        do {
            System.out.print("Enter rows: ");
            rows = sc.nextInt();
            System.out.print("Enter cols: ");
            cols = sc.nextInt();
        } while (rows != cols);


        int[][] arr = new int[rows][cols];
        System.out.println("Enter element: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("At position [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("After input: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
