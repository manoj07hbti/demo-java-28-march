package exception_handling;

public class CustomExceptionMain {


    public String openAccount(double balance) throws MinBalanceException{

        if(balance<5000){
           // throw exception

           throw new MinBalanceException("Min amount should be 5000 to Open an account");

        }
        else {
            return "Account opened successfully ..";
        }
    }

    public static void main(String[] args) {

        CustomExceptionMain obj= new CustomExceptionMain();
        try {
           System.out.println(obj.openAccount(4000));
        } catch (MinBalanceException e) {
            e.printStackTrace();
        }

    }
}
