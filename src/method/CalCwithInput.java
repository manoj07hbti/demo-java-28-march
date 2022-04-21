package method;

public class CalCwithInput {

    public int add(int a, int b){

        return a+b;
    }


    public static void main(String[] args) {

        CalCwithInput obj= new CalCwithInput();

       int result= obj.add(3,9);
       System.out.println("Addition is : "+result);
        result= obj.add(23,12);
        System.out.println("Addition is : "+result);

    }
}
