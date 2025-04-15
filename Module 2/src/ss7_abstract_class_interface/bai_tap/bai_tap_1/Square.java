package ss7_abstract_class_interface.bai_tap.bai_tap_1;

import ss7_abstract_class_interface.bai_tap.bai_tap_2.IColorable;

import java.util.Random;

public class Square extends Shape implements IResizeable {
    private double side = 1.0f;
    public Square(){

    }

    public Square(double side){
        this.side = side;
    }

    public Square(String color,boolean filled, double side){
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
    public void resize(double percent) {
        setSide((this.side*percent)/100);
    }
}
