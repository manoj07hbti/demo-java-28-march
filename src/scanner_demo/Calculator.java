package scanner_demo;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter value of a:");
        int a= scanner.nextInt();
        System.out.println("Please Enter value of b:");
        int b=scanner.nextInt();
        System.out.println("Please Enter your choice:");
        Scanner scanner1= new Scanner(System.in);
        String choice= scanner1.nextLine();

        float result=a/b;
        System.out.println("DIVIDE IS "+result);

        if(choice=="ADD" || choice.equals("ADD")){
          System.out.println("ADDITION of a and b is "+a+b);
        }


    }
}
