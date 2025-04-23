package ss13_search_algorithms.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class MaximumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string:");
        String str = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }

            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
        }

        for(Character max1: max){
            System.out.print(max1);
        }

    }
}
