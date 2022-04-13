package class_and_object;

public class Student {

    String name;
    int age;
    String section;

    public Student(String name, int age, String section) {
        this.name = name;
        this.age = age;
        this.section = section;
    }

    public static void main(String[] args) {

        Student obj1= new Student("Raj",21,"CS");
        Student obj2= new Student("Rahul",23,"IT");
        Student obj3= new Student("Ramesh",22,"IT");

        System.out.println("Printing name: "+obj1.name);
        System.out.println("Printing Age: "+obj1.age);
        System.out.println("Printing Section: "+obj1.section);

        System.out.println("Printing name: "+obj2.name);
        System.out.println("Printing Age: "+obj2.age);
        System.out.println("Printing Section: "+obj2.section);

        System.out.println("Printing name: "+obj3.name);
        System.out.println("Printing Age: "+obj3.age);
        System.out.println("Printing Section: "+obj3.section);

    }
}
