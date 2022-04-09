package loops_working;

public class DemoBreak {

    public static void main(String[] args) {

        for (int i=0; i<10; i++){

            System.out.println("Printing value of i : "+i);

            if(i==3){
                System.out.println("Before Breaking the Loop value of i : "+i);
             break;
            }
        }

        int j=10;
        while (j>0){

            System.out.println("Printing value of J : "+j);
            j--;
            if(j==5){
                break;
            }
        }

    }
}
