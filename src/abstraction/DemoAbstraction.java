package abstraction;

public abstract class DemoAbstraction {

    // Syntax : access_specifier return_type  method_name (parameter) {CODE / BODY}

    //  abstract method : a method without method body

    // any class which is having at least on abstract abstract method will be declared as abstract class
    public abstract void m1();

    // can we object of abstract class ? NO :  because there is no method implementation so if we try to call abstract
     //  method then JVM will not be able to find the code

    // we can have normal method as well in abstract class

    public void m2(){

        System.out.println("This is Normal method M2 of Abstract Class ....");
    }

    public static void main(String[] args) {

        /*DemoAbstraction obj= new DemoAbstraction();
        obj.m1();*/
    }
}
