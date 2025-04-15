package ss7_abstract_class_interface.bai_tap.bai_tap_2;

public class TestInterface {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(4);
        shape[1] = new Rectangle(4,5);
        shape[2] = new Square2(6);
        System.out.println("Area is: ");
        for (Shape shape1 : shape){
            if(shape1 instanceof Circle){
                System.out.println("Circle");
                System.out.println(( (Circle) shape1).getArea());
            }else if(shape1 instanceof Rectangle){
                System.out.println("Rectangle");
                System.out.println(( (Rectangle) shape1).getArea());
            }else{
                System.out.println("Square");
                IColorable colorable =(Square2) shape1;
                System.out.println(((Square2)shape1).getArea());
                colorable.howToColor();
            }
        }
    }
}
