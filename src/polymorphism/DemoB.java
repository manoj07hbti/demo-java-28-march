package polymorphism;

public class DemoB extends DemoA{


    public void m1(){

        System.out.println("Method m1 of Demo B");
    }

    public static void main(String[] args) {

        DemoA obj= new DemoA();
        obj.m1();

        DemoA obj1= new DemoB();
        obj.m1();

      /*  // child can not hold object of Parent
        DemoB obj3= new DemoA();// compile time error because child can not hold parent object
        obj.m1();*/


    }
}
