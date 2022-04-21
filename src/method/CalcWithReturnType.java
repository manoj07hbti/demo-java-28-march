package method;

public class CalcWithReturnType {


    public int addition(){

        int a=4;
        int b=7;

        int sum=a+b;

       return sum;
    }

    public int subtraction(){

        int a=4;
        int b=7;

        int sub=a-b;

        return sub;
    }
// sub, mult, divide

    public static void main(String[] args) {
        CalcWithReturnType obj = new CalcWithReturnType();

       int result= obj.addition();
       System.out.println("Addition is : "+result);
       result=obj.subtraction();

    }
}
