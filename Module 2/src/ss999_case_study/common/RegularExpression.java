package ss999_case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegularExpression {
    public static String checkId(Scanner sc, String message, String type) {
        boolean check;
        String regexId;
        String id;
        do {
            System.out.println(message);
            id = sc.nextLine();
            if (type.equals("Employee")) {
                regexId = "^N+V+-+\\d{4}$";
            } else {
                regexId = "^K+H+-+\\d{4}$";
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

    public static String checkIdentityCard(Scanner sc, String message) {
        boolean check;
        String identityCard;
        do {
            System.out.println(message);
            identityCard = sc.nextLine();
            String regexIdCard = "^\\d{9,12}$";
            check = identityCard.matches(regexIdCard);
        } while (!check);
        return identityCard;
    }

    public static String checkPhoneNumber(Scanner sc, String message) {
        boolean check;
        String phoneNumber;
        do {
            System.out.println(message);
            phoneNumber = sc.nextLine();
            String regexPhoneNumber = "^0+\\d{9}$";
            check = phoneNumber.matches(regexPhoneNumber);
        } while (!check);
        return phoneNumber;
    }

    public static double checkSalary(Scanner sc, String message) {
        boolean check = true;
        double salary = 0;
        do {
            System.out.println(message);
            try {
                salary = Double.parseDouble(sc.nextLine());
                if (salary > 0) {
                    check = false;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Wrong input! Input again!!");
            }
        } while (check);
        return salary;
    }

    public static String checkDate(Scanner sc, String message) {
        boolean is18Olders;
        String date;
        do {
            System.out.println(message);
            date = sc.nextLine();
            is18Olders = is18OrOlder(date);
        } while (!is18Olders);
        return date;
    }

    public static boolean is18OrOlder(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate birthDate = LocalDate.parse(dateStr, formatter);
            LocalDate today = LocalDate.now();
            Period age = Period.between(birthDate, today);
            if (age.getYears() > 18) return true;
            return age.getYears() == 18 && (age.getMonths() > 0 || (age.getMonths() == 0 && age.getDays() >= 0));
        } catch (DateTimeParseException e) {
            return false;
        }
    }

}
