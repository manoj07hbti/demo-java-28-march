package conditional_statements;

public class NestedIf {

    public static void main(String[] args) {

        int marks=75;
        String branch="CS";

        if(marks >=75 & branch=="CS"){

            System.out.println("First Division with CS branch");
        }

        if(marks>=75){

            if(branch=="CS"){
                System.out.println(" INSIDE NESTED IF First Division with CS branch");
            }

        }

    }
}
