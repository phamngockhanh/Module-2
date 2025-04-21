package ss11_stack_queue.bai_tap.bai_tap_2_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number you want to convert: ");
        int num = Integer.parseInt(sc.nextLine());
        int count = 0;
        do {
            if (num % 2 == 1) {
                stack.push(1);
            } else {
                stack.push(0);
            }
            num = num / 2;
            count++;
        } while (num >= 1);
        for (int i = 0; i < count; i++) {
            System.out.print(stack.pop());
        }
    }
}
