package ss3_array.bai_tap;

import java.util.Scanner;

public class SoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        char c = 'c';
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
