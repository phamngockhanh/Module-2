package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1;

import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal.Chicken;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal.Tiger;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.fruit.Apple;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        Chicken chicken1 = new Chicken();
        System.out.println(tiger1.makeSound());
        System.out.println(chicken1.makeSound());
        Apple apple1 = new Apple();
        Orange orange1 = new Orange();
        System.out.println(apple1.howToEat());
        System.out.println(orange1.howToEat());

    }
}
