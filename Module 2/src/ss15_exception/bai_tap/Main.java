package ss15_exception.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while(flag) {
            try {
                System.out.print("Enter a:");
                double a = sc.nextDouble();
                System.out.print("Enter b:");
                double b = sc.nextDouble();
                System.out.print("Enter c:");
                double c = sc.nextDouble();
                isTriangle(a,b,c);
                System.out.printf("Side of triangle are: %f %f %f",a,b,c);

                flag=false;
            } catch (NumberFormatException e) {
                System.out.println("Wrong type!!");
                System.out.println("Enter again!!!");
            } catch (IllegalTriangleException e) {
                System.out.println("Is not a triangle!");
                System.out.println("Enter again!!!");
            }
        }
    }

    public static boolean isTriangle(double a, double b, double c) throws IllegalTriangleException {
        if(a+b<=c||a+c<=b||b+c<=a){
            throw new IllegalTriangleException("Is not a triangle!");
        }else if(a<=0||b<=0||c<=0){
            throw  new IllegalTriangleException("Must be positive number");
        }
        return true;
    }

}
