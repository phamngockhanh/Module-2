package ss1_introduction_to_java.bai_tap.bai3_doc_so_thanh_chu;
import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want convert to string: ");
        int number = scanner.nextInt();
        int count = 0;
        int temp;
        int temp1;
        temp1 = number % 10;
        String readUnit = "";
        String readTens = "";
        String readHundred = "";
        do {
            temp = number % 10;
            count++;

            switch (temp) {
                case 0:
                    if (count == 1) {
                        readUnit = "Zero";
                    } else {
                        readUnit = "";
                        readTens = "";
                        readHundred = "";
                    }
                    break;
                case 1:
                    switch (count) {
                        case 1:
                            readUnit = "One";
                            break;
                        case 2:
                            switch (temp1) {
                                case 0:
                                    readTens = "Ten";
                                    readUnit = "";
                                    break;
                                case 1:
                                    readTens = "Eleven";
                                    readUnit = "";
                                    break;
                                case 2:
                                    readTens = "Twelve";
                                    readUnit = "";
                                    break;
                                case 3:
                                    readTens = "Thirteen";
                                    readUnit = "";
                                    break;
                                case 4:
                                    readTens = "Fourteen";
                                    readUnit = "";
                                    break;
                                case 5:
                                    readTens = "Fifteen";
                                    readUnit = "";
                                    break;
                                case 6:
                                    readTens = "Sixteen";
                                    readUnit = "";
                                    break;
                                case 7:
                                    readTens = "Seventeen";
                                    readUnit = "";
                                    break;
                                case 8:
                                    readTens = "Eighteen";
                                    readUnit = "";
                                    break;
                                case 9:
                                    readTens = "Nineteen";
                                    readUnit = "";
                                    break;
                            }
                            break;
                        case 3:
                            readHundred = "One hundred and";
                            break;
                    }
                    break;
                case 2:
                    switch (count) {
                        case 1:
                            readUnit = "Two";
                            break;
                        case 2:
                            readTens = "Twenty";
                            break;
                        case 3:
                            readHundred = "Two hundred and";
                            break;
                    }
                    break;
                case 3:
                    switch (count) {
                        case 1:
                            readUnit = "Three";
                            break;
                        case 2:
                            readTens = "Thirty";
                            break;
                        case 3:
                            readHundred = "Three hundred and";
                            break;
                    }
                    break;
                case 4:
                    switch (count) {
                        case 1:
                            readUnit = "Four";
                            break;
                        case 2:
                            readTens = "Forty";
                            break;
                        case 3:
                            readHundred = "Four hundred and";
                            break;
                    }
                    break;
                case 5:
                    switch (count) {
                        case 1:
                            readUnit = "Five";
                            break;
                        case 2:
                            readTens = "Fifty";
                            break;
                        case 3:
                            readHundred = "Five hundred and";
                            break;
                    }
                    break;
                case 6:
                    switch (count) {
                        case 1:
                            readUnit = "Six";
                            break;
                        case 2:
                            readTens = "Sixty";
                            break;
                        case 3:
                            readHundred = "Six hundred and";
                            break;
                    }
                    break;
                case 7:
                    switch (count) {
                        case 1:
                            readUnit = "Seven";
                            break;
                        case 2:
                            readTens = "Seventy";
                            break;
                        case 3:
                            readHundred = "Seven hundred and";
                            break;
                    }
                    break;
                case 8:
                    switch (count) {
                        case 1:
                            readUnit = "Eight";
                            break;
                        case 2:
                            readTens = "Eighty";
                            break;
                        case 3:
                            readHundred = "Eight hundred and";
                            break;
                    }
                    break;
                case 9:
                    switch (count) {
                        case 1:
                            readUnit = "Nine";
                            break;
                        case 2:
                            readTens = "Ninety";
                            break;
                        case 3:
                            readHundred = "Nine hundred and";
                            break;
                    }
                    break;
            }
            number = number / 10;
            if (number < 1) {
                System.out.println("Convert to text: " +readHundred + " " +  readTens + " "+ readUnit);
                break;
            }

        } while (true);


    }
}
