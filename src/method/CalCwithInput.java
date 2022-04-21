package method;

import java.util.Scanner;

public class CalCwithInput {

    public int add(int a, int b){

        return a+b;
    }


    public static void main(String[] args) {

        CalCwithInput obj= new CalCwithInput();


        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter value of a:");
        int a= scanner.nextInt();
        System.out.println("Please enter value of b:");
        int b= scanner.nextInt();
       int result= obj.add(a,b);
       System.out.println("Addition is : "+result);
        result= obj.add(23,12);
        System.out.println("Addition is : "+result);

    }
}
