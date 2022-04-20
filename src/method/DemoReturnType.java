package method;

public class DemoReturnType {

    public String message(){

        String msg="Welcome to return type example ";

        return msg;
    }

    public int getAge(){

        int age =24;
        return age;
    }

    public double getSalary(){

        double salary=345677.5;

        return salary;
    }


    public static void main(String[] args) {

        DemoReturnType obj= new DemoReturnType();
        String output= obj.message();// store the output
        System.out.println(output +" Rahul");

       int age= obj.getAge();
       System.out.println("Age is : "+age);

      double salary= obj.getSalary();

      System.out.println("Salary is : "+salary);

    }
}
