package variables;

public class DemoManipulation {

    public static void main(String[] args) {
        // Datatype var_name=value;
        int a=5;
        int b=7;

        int sum =a+b;

        System.out.println("SUM of a and b is "+sum);
        System.out.println("ADVANCE SUM of a and b is "+(a+b));

        int sub= a-b;
        System.out.println("Subtraction of a and b is "+sub);
        System.out.println("ADVANCE Subtraction of a and b is "+(a-b));

        a=50;
        b=5;
        int divide=a/b;
        System.out.println("Division of a and b is "+divide);
        System.out.println("ADVANCE Division of a and b is "+a/b);

        int multi= a*b;
        System.out.println("multi of a and b is "+multi);
        System.out.println("ADVANCE multi of a and b is "+a*b);

        double c= 10.5;
        double d= 1.5;

        double e= c+d;
        System.out.println("SUM of decimal is "+e);

        a=7;
        b=3;

        System.out.println("Divide of a and b: "+a/b);

    }
}
