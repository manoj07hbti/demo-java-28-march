package singelton;

public class Singleton {

// step 1
     private Singleton(){}

// step 2
    private static Singleton instnace= new Singleton();// eager initialization

// step 3

    public synchronized Singleton getInstnace(){

        if(instnace==null){

            return new Singleton();
        }
        else {
            return  instnace;
        }
    }

}
