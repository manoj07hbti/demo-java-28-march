package method;

public class MethodInputParam {


  //  access_specifier return_type  method_name (Datatype var1,Datatype var2) {CODE}

    public String checkAge(int age){

        if(age>18){

            return "Person is eligible for voting ...";
        }
        else {
            return "Person is NOT eligible for voting ...";
        }
    }

    public String hello(String name){

        return "Welcome to Input Parameter "+name;
    }

    public int makeSquare(int number){

        return number*number;
    }

    public String test(String name, int age ){

        return "Welcome to double input param "+name + " age : "+age;
    }

    public static void main(String[] args) {

        MethodInputParam obj = new MethodInputParam();
        String result= obj.checkAge(21);

        System.out.println(result);

        result= obj.checkAge(17);
        System.out.println("Second data "+result);
        result= obj.checkAge(20);
        System.out.println("Second data "+result);

        result= obj.hello("Shubham");
        System.out.println("Calling hello method  "+result);
         System.out.println( obj.hello("RAHUL"));

        int square= obj.makeSquare(3);
        System.out.println("Square of number is "+square);

        String var= obj.test("Raj", 23);
        System.out.println(var);

    }
}
