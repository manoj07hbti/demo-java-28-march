package class_and_object;

public class Employee {

    String name;
    String id;
    String dept;

    public Employee(String name, String id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    public static void main(String[] args) {
        Employee employee= new Employee("Raj","04434ABC","IT");

        System.out.println(employee.id);
    }
}
