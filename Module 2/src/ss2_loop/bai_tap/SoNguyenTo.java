package ss2_loop.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoNguyenTo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prime's number you want to print:");
        int primeNumber = sc.nextInt();
       // List<Integer> listPrime = new ArrayList<>();
        int count = 0;
        int countPrime = 0;
        int prime = 2;

        do {
            for (int i = 1; i <= prime; i++) {
                if (prime % i == 0) {
                    countPrime++;
                }
            }
            if (countPrime == 2) {
               // listPrime.add(prime);
                System.out.print(prime + "\t");
                count++;
            }
            countPrime = 0;
            prime++;
            if (count == primeNumber) {
               // System.out.println(listPrime);
                break;
            }
        } while (true);

    }
}
