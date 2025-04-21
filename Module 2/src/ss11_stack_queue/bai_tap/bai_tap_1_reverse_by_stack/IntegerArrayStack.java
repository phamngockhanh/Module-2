package ss11_stack_queue.bai_tap.bai_tap_1_reverse_by_stack;

import java.util.Scanner;
import java.util.Stack;

public class IntegerArrayStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> intArrayNum = new Stack<>();
        System.out.print("Enter array length: ");
        int length = Integer.parseInt(sc.nextLine());
        int[] array = new int[length];
        System.out.println("Element in array: ");
        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random()*10);
            System.out.print(array[i]+" ");
            intArrayNum.push(array[i]);
        }
        System.out.println();
        System.out.println("Element in array after reverse");
        for (int i = 0; i < length; i++) {
            array[i] = intArrayNum.pop();
            System.out.print(array[i] +" ");
        }
    }
}
