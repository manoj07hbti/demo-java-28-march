package exception_handling;

public class Calculator {

    public int divide(int a, int b){
        int result=0;
       try {
            result = a / b;
       }
       catch (Exception e){

           System.out.println(" CATCH BLOCK : Exception occurred "+e);
           System.exit(1);// finally will not get execute only when System.exit(1) is used
       }


       finally {
           System.out.println("FINALLY BLOCK : This will always execute ....");
       }

        return result;
    }

    public static void main(String[] args) {

        Calculator obj= new Calculator();
        System.out.println("Before method call...");
        int result =obj.divide(4,0);
        System.out.println("After  method call...");

        System.out.println("output is ..."+result);

    }
}
