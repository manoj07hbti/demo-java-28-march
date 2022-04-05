package conditional_statements;

public class NestedOrOperator {

    public static void main(String[] args) {

        int age=21;
        String city="AGRA";
        //TRUE||TRUE= TRUE

        if(age>18 || city=="AGRA" ){

            System.out.println("TRUE||TRUE= TRUE : You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("You are NOT eligible for voting in Agra..");
        }

        // TRUE||FALSE=TRUE
        city="DELHI";
        if(age>18 || city=="AGRA" ){

            System.out.println("TRUE||FALSE=TRUE  : You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("You are NOT eligible for voting in Agra..");
        }

        //FALSE||TRUE=TRUE
        age=17;
        city="AGRA";
        if(age>18 || city=="AGRA" ){

            System.out.println("FALSE||TRUE=TRUE  : You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("You are NOT eligible for voting in Agra..");
        }

       //FALSE|| FALSE= FALSE
        age=16;
        city="PUNE";
        if(age>18 || city=="AGRA" ){

            System.out.println("You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("FALSE|| FALSE= FALSE : You are NOT eligible for voting in Agra..");
        }

    }

}
