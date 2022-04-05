package conditional_statements;

public class NOTOperator {

    public static void main(String[] args) {

        int age=21;

        if( !(age>18) ){
            System.out.println("You are eligible for voting ");
        }
        else {
            System.out.println("You are NOT eligible for voting ");
        }

    }
}
