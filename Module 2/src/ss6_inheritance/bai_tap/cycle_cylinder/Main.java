package ss6_inheritance.bai_tap.cycle_cylinder;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(15,25);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.volume());
    }
}
