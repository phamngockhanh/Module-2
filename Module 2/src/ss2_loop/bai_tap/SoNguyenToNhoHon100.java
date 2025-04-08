package ss2_loop.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    //public static List<Integer> getPrimeList(int range) {
        //List<Integer> primeList = new ArrayList<>();
    public static void getPrimeList(int range) {
        int count = 0;
        int value = 2;
        System.out.print("List Prime:");
        do {
            for (int i = 1; i <= value; i++) {
                if (value % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                //primeList.add(value);
                System.out.print(value + "\t");
            }
            count = 0;
            value++;
            if (value == range) {
                return;
            }
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of prime:");
        int range = sc.nextInt();
        //System.out.println(getPrimeList(range));
        getPrimeList(range);
    }
}
