package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1;

import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal.Animal;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal.Chicken;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal.Tiger;
import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.edible.IEdible;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal: animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                IEdible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
            }
        }
    }
}
