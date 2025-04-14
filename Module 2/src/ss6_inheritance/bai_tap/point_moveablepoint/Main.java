package ss6_inheritance.bai_tap.point_moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(5,10);
        MoveablePoint mp = new MoveablePoint(5,10,15,20);
        System.out.println(p);
        System.out.println(mp);
        System.out.println(mp.move());
    }
}
