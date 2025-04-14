package ss6_inheritance.bai_tap.triangle;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    Triangle() {
    }

    Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double p1 = this.getPerimeter() / 2;
        return Math.sqrt(p1 * (p1 - this.getSide1()) * (p1 - this.getSide2()) * (p1 - this.getSide3()));
    }

    public double getPerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    public boolean isTriangle() {
        return !(this.side1 < 0) && !(this.side2 < 0) && !(this.side3 < 0) && !(this.side1 + this.side2 < this.side3) && !(this.side1 + this.side3 < this.side2) && !(this.side3 + this.side2 < this.side1);

    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString() +
                ", Area = " + this.getArea() +
                ", Perimeter = " + this.getPerimeter() +
                '}';
    }
}
