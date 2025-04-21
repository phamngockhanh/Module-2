package ss11_stack_queue.bai_tap.bai_tap_3_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        String[] str = str1.toLowerCase().split("");
        Stack<String> stringStack = new Stack<>();
        Queue<String> stringQueue = new ArrayDeque<>();
        for (String string : str) {
            stringStack.push(string);
            stringQueue.add(string);
        }

        for (int i = 0; i < str.length; i++) {
            if (!(stringStack.pop().equals(stringQueue.poll()))) {
                System.out.println("This is not a palindrome");
                break;
            }
            if(stringStack.isEmpty()){
                System.out.println("This is a palindrome");
            }
        }
    }
}
