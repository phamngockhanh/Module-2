package ss1_introduction_to_java.bai_tap.bai2_chuyen_doi_tien_te;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int tiGia  =23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền ($): ");
        double soTien = scanner.nextDouble();
        System.out.println("Số tiền sau khi đổi là: " + soTien * tiGia);
    }
}
