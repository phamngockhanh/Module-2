package ss6_inheritance.bai_tap.cycle_cylinder;

public class Circle {
    private double r;
    private final double PI = 3.14;

    Circle(double r){
        this.r = r;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getPI() {
        return PI;
    }
    public double getArea( ){
        return this.r*this.r*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", PI=" + PI +
                '}';
    }
}
