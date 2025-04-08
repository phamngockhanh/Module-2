package ss1_introduction_to_java.bai_tap.bai2_chuyen_doi_tien_te;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        int exchangeRate  = 26000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount ($): ");
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.println("Exchange from: ");
        String from = scanner.nextLine();
        System.out.println("To: ");
        String to = scanner.nextLine();
        if(from.equals("VND")&& to.equals("USD")){
            System.out.println("After exchange from VND to USD is: "+ amount * exchangeRate);
        }else if(from.equals("USD")&& to.equals("VND")){
            System.out.println("After exchange from VND to USD is: "+ amount / exchangeRate);
        }else{
            System.out.println("We not supporting this type of money");
        }

    }
}
