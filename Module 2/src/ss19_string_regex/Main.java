package ss19_string_regex;

public class Main {
    public static void main(String[] args) {
//        String name = "Pham Ngoc Khanh";
//        String regexName = "^([A-Z][a-z]*)(\\s[A-Z][a-z]*)?(\\s[A-Z][a-z]*)+$";
//        boolean check = name.matches(regexName);
//        System.out.println(check);
        String name = "C0223G";
        String regexName = "^[CAP]+\\\\d{4}+[GHIK]$";
        boolean check = name.matches(regexName);
        System.out.println(check);
    }
}
