package ss11_stack_queue.bai_tap.bai_tap_1_reverse_by_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StringStackReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string randomly: ");
        String str = sc.nextLine();
        String[] strArray = str.split("");
        Stack<String> strStack = new Stack<>();
        for (String s : strArray) {
            strStack.push(s);
        }

        for(int i =0;i<strArray.length;i++){
            strArray[i] = strStack.pop();
        }
        String joined = String.join("", strArray);
        System.out.println(Arrays.toString(strArray));
        System.out.println(joined);
    }
}
