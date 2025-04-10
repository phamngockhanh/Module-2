package ss4_class_object.bai_tap.fan;

public class Main {
    public static void main(String[] args) {
        Fan f = new Fan();
        Fan f2 = new Fan();
        f.setSpeed(f.getFAST());
        f2.setSpeed(f.getMEDIUM());
        f.setRadius(10);
        f2.setRadius(5);
        f.setColor("yellow");
        f2.setColor("blue");
        f.setOn(true);
        f2.setOn(false);
        String fan1 = f.toString();
        String fan2 = f2.toString();
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
