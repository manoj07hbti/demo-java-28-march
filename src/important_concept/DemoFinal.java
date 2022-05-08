package important_concept;

public final class DemoFinal {


    public final void m1(){

        System.out.println("This is m1");
    }

    public static void main(String[] args) {


        final String name ="Raj";

        System.out.println("Before change "+name);

       // name="Java";  we can not change final variable

        System.out.println("After change "+name);
    }
}
