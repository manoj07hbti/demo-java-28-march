package abstraction;

public class Child extends DemoAbstraction {

    @Override
    public void m1() {
        System.out.println("This is overridden method ");
    }

    public static void main(String[] args) {

        Child obj= new Child();
        obj.m1();
        obj.m2();
    }
}
