package class_and_object;

public class Dog {

    //data members
    String breedName;
    int age;

    //run , bark, eat
//Syntax : access_specifier return_type  method_name (parameter) {CODE}

     public void runMethod(){

         System.out.println("This is Run method of Dog Class");
     }

     public void barkMethod(){
         System.out.println("This is  barkMethod of Dog Class");
     }

     public void eatMethod(){
         System.out.println("This is  eatMethod of Dog Class");

     }

/*TODO  Syntax : access_specifier return_type  method_name (parameter) {CODE}
        //access_specifier -> public , private , protected, default   THEORY PART
         //return_type   -> output of function or method :  void : no return type
         //method_name -> can be anything: it should be meaningful
           // parameter ->  input parameter : optional */

    public static void main(String[] args) {
         Dog obj= new Dog();// 1 created Object
         obj.runMethod();// 2- objectName.MethodName();
         obj.barkMethod();// calling bark method
         obj.eatMethod();// calling eat method


    }


}
