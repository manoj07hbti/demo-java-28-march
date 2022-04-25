package collection_demo;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
       // normal way
        String city1="Agra";
        String city2="Delhi";
        String city3="Pune";
        String city4="Jaipur";

        //Collection way: CollectionName VarName=new CollectionName();

        ArrayList cityList= new ArrayList();

        cityList.add("Agra");  //0 index
        cityList.add("Delhi"); //1 index
        cityList.add("Pune");  //2 index
        cityList.add("Jaipur");//3 index
        cityList.add("Mumbai");//4 index

        System.out.println("Printing 2 index element "+cityList.get(2));
        System.out.println("Printing 4 index element "+cityList.get(4));
        System.out.println("Printing 0 index element "+cityList.get(0));
        //System.out.println("Printing 5 index element "+cityList.get(5));

        for (int i=0; i <cityList.size(); i++){

            System.out.println("Printing list using loop at index  "+i +" Value: "+cityList.get(i));
        }

        // Advanced for loop :  for (Datatype var_name : array/Collection){
        //                             }

        for (Object var: cityList){

            System.out.println("Printing using Advance Loop: "+var);
        }

        // removing data from ArrayList

        System.out.println("Printing Before  remove "+cityList.get(1));
        cityList.remove(1);
        System.out.println("Printing after remove "+cityList.get(1));

        for (int i=0; i <cityList.size(); i++){

            System.out.println("Printing list using loop at index  "+i +" Value: "+cityList.get(i));
        }
    }
}
