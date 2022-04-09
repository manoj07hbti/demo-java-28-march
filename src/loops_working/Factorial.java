package loops_working;

public class Factorial {

    public static void main(String args[]){
       //5*4*3*2*1 or 1*2*3*4*5

        int fact=1;

        int number=5;//It is the number to calculate factorial

        for(int i=1;i<=number;i++){
            fact=fact*i;//1*1=1 ,1*2=2 ,2*3=6 , 6*4=24 ,24*5=120
        }

        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
