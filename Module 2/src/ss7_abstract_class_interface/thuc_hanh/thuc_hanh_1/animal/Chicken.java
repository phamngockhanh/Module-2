package ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.animal;

import ss7_abstract_class_interface.thuc_hanh.thuc_hanh_1.edible.IEdible;

public class Chicken extends  Animal implements IEdible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }


}
