package ss5_access_modifiers.thuc_hanh.thuc_hanh_1;

public class Main {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student (111, "Hoang");
        Student s2 = new Student (112, "Khanh");

        s1.display();
        s2.display();
    }
}
