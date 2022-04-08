package conditional_statements;

public class ANDOperator {

    public static void main(String[] args) {

        int age =21;
        String city="AGRA";

        //& operator : TRUE & TRUE= TRUE

        if(age>18 & city=="AGRA" ){

           System.out.println("You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("You are NOT eligible for voting in Agra..");
        }

        //TRUE & FALSE=FALSE
        city="DELHI";
        if(age>18 & city=="AGRA" ){

            System.out.println("You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("TRUE & FALSE=FALSE : You are NOT eligible for voting in Agra..");
        }
        //FALSE& TRUE =FALSE
        age=17;
        city="AGRA";
        if(age>18 & city=="AGRA" ){

            System.out.println("You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("FALSE& TRUE =FALSE : You are NOT eligible for voting in Agra..");
        }
      // FALSE&FALSE= FALSE
        age=16;
        city="PUNE";
        if(!(age>18) & city=="AGRA" ){

            System.out.println("You are eligible for voting in Agra..");
        }
        else
        {
            System.out.println("FALSE&FALSE= FALSE : You are NOT eligible for voting in Agra..");
        }

    }
}
