package ss6_inheritance.bai_tap.point2d_point3d;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(3,4,5);
        Point2D point2D = new Point2D(7,8);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
