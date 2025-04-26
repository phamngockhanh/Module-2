package ss19_string_regex;

public class CheckPhoneNumber {
    public static void main(String[] args) {
        String phone = "asd";
        String regexPhone = "^[(]+\\d{2}+[)]+-+[(]+0+\\d{9}+[)]$";
        boolean check = phone.matches(regexPhone);
        System.out.println(check);
    }
}
