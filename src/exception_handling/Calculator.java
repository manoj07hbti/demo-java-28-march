package exception_handling;

public class Calculator {

    public int divide(int a, int b){
        int result=0;
       try {
            result = a / b;
       }
       catch (Exception e){

           System.out.println("Exception occurred "+e);
       }
       finally {
           System.out.println("FINALLY BLOCK : This will always execute ....");
       }
        return result;
    }

    public static void main(String[] args) {

        Calculator obj= new Calculator();
        System.out.println("Before method call...");
        int result =obj.divide(4,2);
        System.out.println("After  method call...");

        System.out.println("output is ..."+result);

    }
}
