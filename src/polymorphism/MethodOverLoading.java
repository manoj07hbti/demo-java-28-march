package polymorphism;

public class MethodOverLoading {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    //  Method OverLoading : same method with different input params
    //  Compile time Polymorphism: because in compile time it is already decided which  method will get called

     public void helloStudent(){

         System.out.println("Hello Student , Welcome To Method overloading");
     }

     // method overloading
    public void helloStudent(String name){
        System.out.println("Hello Student , Welcome To Method overloading: "+name);
    }
    // method overloading
    public void helloStudent(String name, int age){
        System.out.println("Hello Student , Welcome To Method overloading: "+name +"Age: "+age);
    }


    public static void main(String[] args) {

        MethodOverLoading obj = new MethodOverLoading();
        obj.helloStudent();
        obj.helloStudent("Mohit");
        obj.helloStudent("Raj",23);
    }


}
