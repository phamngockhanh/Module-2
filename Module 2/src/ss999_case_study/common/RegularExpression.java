package ss999_case_study.common;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class RegularExpression {
    public static int readInt(Scanner sc, String message) {
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.println(message);
            try {
                number = sc.nextInt();
                isValid = true;
                sc.nextLine();
            } catch (Exception ex) {
                System.out.println("Invalid input. Please enter an integer number.");
                sc.nextLine();
            }
        }
        return number;
    }


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

    public static String checkServiceCode(Scanner sc, String message, String type) {
        boolean check;
        String regexId;
        String id;
        do {
            System.out.println(message);
            id = sc.nextLine();
            if (type.equals("Villa")) {
                regexId = "^S+V+V+L+-+\\d{4}$";
            } else if (type.equals("House")) {
                regexId = "^S+V+H+O+-+\\d{4}$";
            } else {
                regexId = "^S+V+R+O+-+\\d{4}$";
            }
            check = id.matches(regexId);
        } while (!check);
        return id;
    }

    public static String checkNameService(Scanner sc, String message) {
        boolean check;
        String regexId;
        String name;
        do {
            System.out.println(message);
            name = sc.nextLine();
            regexId = "^([A-Z][a-z]*)(\\s[a-z]*)*$";
            check = name.matches(regexId);
        } while (!check);
        return name;
    }

    public static double validateArea(Scanner sc, String type, String message) {
        double area = 0;
        do {
            try {
                System.out.println(message);
                area = Double.parseDouble(sc.nextLine());
                if (type.equals("UseableArea")) {
                    if (area <= 30) {
                        System.out.println("Use able area must be greater than 30!!");
                    }

                } else {
                    if (area <= 30) {
                        System.out.println("Use able pool area must be greater than 30!!");
                    }
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a number.");
            }
        } while (area <= 30);
        return area;
    }

    public static double validateCost(Scanner sc, String message) {
        double rentalCost = 0;
        do {
            try {
                System.out.println(message);
                rentalCost = Double.parseDouble(sc.nextLine());
                if (rentalCost <= 0) {
                    System.out.println("Must be positive number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a number");
            }

        } while (rentalCost <= 0);
        return rentalCost;
    }

    public static int maxOccupancy(Scanner sc, String message) {
        int maxOccupancy = 0;
        do {
            try {
                System.out.println(message);
                maxOccupancy = Integer.parseInt(sc.nextLine());
                if (maxOccupancy <= 0 || maxOccupancy >= 20) {
                    System.out.println("Value must be between 0 and 20");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a number");
            }
        } while (maxOccupancy <= 0 || maxOccupancy >= 20);
        return maxOccupancy;

    }

    public static int checkNumberOfFloors(Scanner sc, String message) {
        int numberOfFloors = 0;
        do {
            try {
                System.out.println(message);
                numberOfFloors = Integer.parseInt(sc.nextLine());
                if (numberOfFloors <= 0) {
                    System.out.println("Must be positive number");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input! Please enter a number");
            }
        } while (numberOfFloors <= 0);
        return numberOfFloors;

    }


}
