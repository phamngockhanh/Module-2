package ss5_access_modifiers.bai_tap.circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public static final double PI = 3.144444444;
    public static String size = "Big";
    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    static void changeSize(){
        size = "Small";
    }

    public double getArea(){
        return Math.pow(getRadius(),2)*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                ", area='" + getArea() +
                ", size='" + size +'\'' +
                '}';
    }
}
