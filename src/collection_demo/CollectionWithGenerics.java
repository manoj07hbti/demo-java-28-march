package collection_demo;

import java.util.ArrayList;

public class CollectionWithGenerics {

    // method : create a ArrayList of City

    public void createCityList(){
   //Collection <DatType> VarName= New Collection<>();

        ArrayList <String> cityList= new ArrayList<>();
        cityList.add("AGRA");
        cityList.add("Pune");
        cityList.add("Delhi");

        // Advanced for loop :  for (Datatype var_name : array/Collection){
        //

        for(String var: cityList){

            System.out.println("Printing cityList: "+var);
        }


    }

    public void createMarksList(){
        //Collection <DatType> VarName= New Collection<>();

        ArrayList<Integer> marksList= new ArrayList<>();
        marksList.add(45);
        marksList.add(67);
        marksList.add(78);
        marksList.add(20);

        for (Integer var: marksList){
            System.out.println("Printing Marks List: "+var);
        }


    }

    public ArrayList<Double> createPriceList(){
        //Collection <DatType> VarName= New Collection<>();

        ArrayList <Double> priceList= new ArrayList<>();
        priceList.add(2343.6);
        priceList.add(343.7);
        priceList.add(2343.6);
        priceList.add(343.7);

        return priceList;
    }

    public static void main(String[] args) {
        // step 1 create object

        CollectionWithGenerics obj= new CollectionWithGenerics();

        //step 2 obj.methodName();

        obj.createCityList();
        obj.createMarksList();

        ArrayList <Double> resultList= obj.createPriceList();
        for(Double var : resultList ){
            System.out.println("MAIN METHOD : Printing Result List "+var);
        }
    }


}
