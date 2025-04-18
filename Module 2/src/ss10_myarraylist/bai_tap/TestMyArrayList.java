package ss10_myarraylist.bai_tap;

public class TestMyArrayList {

    public static void main(String[] args) {
        Student a = new Student(1,"Khanh");
        Student b = new Student(2,"Hoang");
        Student c = new Student(3,"Sang");
        Student d = new Student(4,"Dong");
        Student e = new Student(5,"Tien");
        Student f = new Student(6,"thang");

        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        studentMyArrayList.add(f);

        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student =(Student) studentMyArrayList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
    }
}
