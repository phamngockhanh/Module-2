package ss7_abstract_class_interface.bai_tap.bai_tap_1;

import java.util.Random;

public class TestShapeInterface {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(15);
        shape[1] = new Rectangle(15,20);
        shape[2] = new Square(16);
        Random random = new Random();
        double percent = 100*random.nextDouble();
        System.out.println("After resize:");
        for(Shape shape1 : shape){
            if(shape1 instanceof Circle){
                IResizeable resizeable = (Circle) shape1;
                resizeable.resize(percent);
                System.out.println("Circle");
                System.out.println(((Circle) shape1).getArea());
            } else if (shape1 instanceof  Rectangle) {
                IResizeable resizeable =(Rectangle) shape1;
                resizeable.resize(percent);
                System.out.println("Rectangle");
                System.out.println(((Rectangle) shape1).getArea());
            }else{
                IResizeable resizeable =(Square) shape1;
                resizeable.resize(percent);
                System.out.println("Square");
                System.out.println(((Square) shape1).getArea());
            }
        }

    }
}
