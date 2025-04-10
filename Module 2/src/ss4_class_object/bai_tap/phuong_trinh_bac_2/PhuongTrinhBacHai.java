package ss4_class_object.bai_tap.phuong_trinh_bac_2;

import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static class QuadraticEquation {
        private double a;
        private double b;
        private double c;

        public QuadraticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }

        public double getDiscriminant() {
            return getB() * getB() - 4 * getA() * getC();
        }

        public double getRoot1() {
            return (-getB() + Math.sqrt(getB() * getB() - 4 * getA() * getC())) / 2 * getA();
        }

        public double getRoot2() {
            return (-getB() - Math.sqrt(getB() * getB() - 4 * getA() * getC())) / 2 * getA();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        if (qe.getDiscriminant() >0) {
            System.out.printf("Root1 is %f \nRoot2 is %f", qe.getRoot1(), qe.getRoot2());
        }else if(qe.getDiscriminant() ==0){
            System.out.printf("Root is %f", qe.getRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
