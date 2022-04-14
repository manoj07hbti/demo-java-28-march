package scanner_demo;

import java.util.Scanner;

public class UserEligiblity {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Voting App, please enter your age: " );

        int age = scanner.nextInt();

        if(age>18){
            System.out.println("User is Eligible for Voting ...");
        }
        else {
            System.out.println("User is Not Eligible for Voting ...");
        }

    }
}
