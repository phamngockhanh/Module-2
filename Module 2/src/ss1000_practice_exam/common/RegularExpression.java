package ss1000_practice_exam.common;

import java.util.Scanner;

public class RegularExpression {
    public static String checkCustomerCode(Scanner sc, String message, String type) {
        boolean check;
        String regexId;
        String id;
        do {
            System.out.println(message);
            id = sc.nextLine();
            if (type.equals("Vietnam")) {
                regexId = "^K+H+V+N+-+\\d{4}$";
            } else {
                regexId = "^K+H+N+N+-+\\d{4}$";
            }
            check = id.matches(regexId);
        } while (!check);
        return id;
    }

    public static String checkName(Scanner sc, String message) {
        boolean check;
        String name;
        do {
            System.out.println(message);
            name = sc.nextLine();
            String regexName = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
            check = name.matches(regexName);
        } while (!check);
        return name;
    }
}
