package loops_working;

public class DemoNestedLoop {

    public static void main(String[] args) {


        for (int i=0; i<5; i++){


            for(int j=i; j<=i; j++){

                System.out.println("Inside nested Loop I and J is: "+i +": "+j);
            }
        }
    }
}
