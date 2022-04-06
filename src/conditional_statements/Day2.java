package conditional_statements;

public class Day2 {

    public static void main(String[] args) {

        int age=18;

        if(age>=18){
            System.out.println("You are eligible for voting ");
        }
        else {
            System.out.println("You are NOT eligible for voting ");
        }

        age=21;
        String city="AGRA";
        double price =100022.5;

        if (age<= 21 & city== "AGRA" || price>10000){
            System.out.println("Age is less than 21 or equal to 21 ");
        }
        else {
            System.out.println("age is less than 21 ");
        }
    }
}
