package ss5_access_modifiers.bai_tap.student;

public class Student {
    private String name ="John";
    private String classes ="C02";
     protected void setName(String name){
        this.name = name;
    }

     protected void setClasses(String classes){
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
