package loops_working;

public class DemoWhileLoop {
    public static void main(String[] args) {

       int i=0;
// WHILE LOOP
       while (i<5){

           System.out.println("Inside while Loop:"+i);

           i++;
       }

//do while Loop

        do {
            System.out.println("Inside Do while Loop:"+i);
            i--;
        }
        while (i>0);


    }
}
