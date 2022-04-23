package method;

import java.util.Scanner;

public class CalCwithInput {

    public int add(int a, int b){

        return a+b;
    }


    public static void main(String[] args) {

        CalCwithInput obj= new CalCwithInput();


        Scanner scanner= new Scanner(System.in);
        int flag=0;
        int result=0;
       while (flag==0) {

           System.out.println("Please enter 1: addition, 2: for subtraction , 3: multiply and 4 for divide..");

           int choie=scanner.nextInt();

           System.out.println("Please enter value of a:");
           int a = scanner.nextInt();
           System.out.println("Please enter value of b:");
           int b = scanner.nextInt();

           if(choie==1){
            result = obj.add(a, b);
            System.out.println("Addition of a and b is :"+result);
           }
           else if(choie==2){
               // subtraction call
           }

           System.out.println("Press 1 to exit from App or press 0 to continue...");
           Scanner scanner1= new Scanner(System.in);
           flag=scanner1.nextInt();
       }
    }
}
