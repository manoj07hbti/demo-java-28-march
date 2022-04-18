package method;

import java.util.Scanner;

public class Calculator {


    /*TODO  Syntax : access_specifier return_type  method_name (parameter) {CODE}
        //access_specifier -> public , private , protected, default   THEORY PART
         //return_type   -> output of function or method :  void : no return type
         //method_name -> can be anything: it should be meaningful
           // parameter ->  input parameter : optional */

    // add sub mult divide
    //Syntax : access_specifier return_type  method_name (parameter) {CODE}

   public void addition(){
       int a=13;
       int b=7;
       int sum=a+b;

       System.out.println("Addition is :"+sum);

   }

   public void subtraction(){

       int a=10;
       int b=7;
       int sub=a-b;

       System.out.println("Subtraction is :"+sub);
   }

   // multi  a*b
   // divide a/b

    public static void main(String[] args) {
        //1 create Object

        Calculator obj= new Calculator();

        // 2 Obj.mehtodName();


        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your choice : 1 for add, 2 sub, 3 for multiply and 4 for divide");
        int choice= scanner.nextInt();
        if(choice==1){
            obj.addition();
        }
        else  if (choice==2){
            obj.subtraction();
        }


    }

}
