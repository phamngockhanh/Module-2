package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape("Blue");
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();
        Triangle triangle = new Triangle(s.getColor(),a,b,c);
        if(triangle.isTriangle()){
            System.out.println(triangle);
        }else{
            System.out.println("Is not a triangle");
        }
    }

}
