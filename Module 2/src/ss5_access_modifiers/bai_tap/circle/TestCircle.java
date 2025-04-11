package ss5_access_modifiers.bai_tap.circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(15);
        c1.changeSize();
        c1.setColor("green");
        System.out.println(c1);

    }
}
