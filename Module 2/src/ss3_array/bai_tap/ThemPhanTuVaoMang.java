package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        int[] array2 = new int[6];
        for (int i = 0; i < array.length; i++) {
            System.out.print("At position " + i + " have value: ");
            array[i] = sc.nextInt();
            array2[i] = array[i];
        }
        System.out.print("Enter position you want to insert: ");
        int position = sc.nextInt();

        if (position <= -1 || position >= array.length) {
            System.out.println("Can't insert into array!!");
        } else {
            System.out.print("Element is: ");
            int number1 = sc.nextInt();
            for (int i = 0; i < array2.length; i++) {
                if(i<position){
                    array2[i]  = array[i];
                }else if(i==position){
                    array2[i] = number1;
                }else{
                    array2[i] = array[i-1];
                }
            }
//            for (int i = 0; i < array2.length; i++) {
//                System.out.print(array2[i] + "\t");
//            }
            System.out.println(Arrays.toString(array2));
        }

    }
}
