package ss3_array.bai_tap;

import java.util.Scanner;

public class TongCacSoCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows length: ");
        int rows = sc.nextInt();
        System.out.print("Enter cols length: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter element for array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("At position [%d][%d] have value: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("After input array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.printf("Enter col you want to calculate from 0 to %d: ", cols - 1);
        int colDel = sc.nextInt();
        int sum = 0;
        if (colDel < 0 || colDel >= arr.length) {
            System.out.println("Cann't find this col");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (colDel == j) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.printf("Sum of %d is %d", colDel, sum);
        }

    }
}
