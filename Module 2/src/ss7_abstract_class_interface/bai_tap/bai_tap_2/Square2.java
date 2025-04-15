package ss7_abstract_class_interface.bai_tap.bai_tap_2;


public class Square2 extends Shape implements IColorable{
    private double side = 1.0f;
    public Square2(){

    }

    public Square2(double side){
        this.side = side;
    }

    public Square2(String color, boolean filled, double side){
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea(){
        return  this.side*this.side;
    }

    public double getPerimeter() {
        return this.side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }


    @Override
    public void howToColor() {
        System.out.println("Color all four side");
    }
}
