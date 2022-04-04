package conditional_statements;

public class Demo {

    public static void main(String[] args) {

        int age =21;

        if (age>18) {

            System.out.println("You are eligible for Voting ...");
        }
        else
        {
            System.out.println("You are NOT eligible for Voting ...");
        }

        String city="AGRA";

        if(city=="AGRA"){
            System.out.println("You are in AGRA CITY");
        }
        else {
            System.out.println("You are NOT in AGRA CITY");
        }

        double price=10000.13;

        if(price>20000){
            System.out.println("Product is costly ...");
        }
        else {
            System.out.println("Product is NOT costly ...");
        }


        if (age>18 & city=="AGRA"){

            System.out.println("You are eligible for voting in Agra ...");
        }
        else {
            System.out.println("You are NOT eligible for voting in Agra ...");
        }


    }
}
