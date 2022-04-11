package arrays;

public class DemoArrays {

    public static void main(String[] args) {

        // Datatype [] var_name = {element1,2,3,4....};

        int [] marks= {45,47,78,33,12,88,5};

        // index based data structure 0,1,2,3    var[index]

        System.out.println("Printing array with index: "+marks[0]);
        System.out.println("Printing array with index: "+marks[4]);
        System.out.println("Printing array with index: "+marks[3]);
        System.out.println("Printing array with index: "+marks[2]);
        System.out.println("Printing array with index: "+marks[1]);


        for (int i=0; i< marks.length; i++){
            System.out.println("LOOP: Printing array with index: "+marks[i]);

        }
        // Advanced for loop :  for (Datatype var_name : array){
        //                     }

        for (int var : marks){

            System.out.println("Advanced for loop : "+var);
        }

        String [] cities= {"Agra","Pune", "Delhi", "Noida","Kolkata"};

        for (String var:cities){
            System.out.println("Printing cities "+var);
        }

        // create double array

    }
}
