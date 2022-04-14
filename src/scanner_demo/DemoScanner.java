package scanner_demo;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);// Object of Scanner Class

        // String data
        System.out.println("Please enter your name");

       String name= scanner.nextLine();// reads String value

       System.out.println("We have entered "+name);
       //int data

        System.out.println("Please enter your Age: ");
        int age = scanner.nextInt();// reads int input

        System.out.println("You have entered age as :"+age);

        // reading decimal
        System.out.println("Please enter your Salary: ");

       double salary= scanner.nextDouble();// reads decimal values

        System.out.println("You have entered salary as :"+salary);



    }
}
