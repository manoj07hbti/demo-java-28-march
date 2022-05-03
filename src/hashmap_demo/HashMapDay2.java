package hashmap_demo;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDay2 {

    public static void main(String[] args) {


        //SYNTAX : HashMap <Datatype_Key, Datatype_value>= new HashMap<>();

        HashMap <Integer, ArrayList<String>> hashMap= new HashMap<>();

        ArrayList <String> cityList= new ArrayList<>();
        cityList.add("AGRA");
        cityList.add("Pune");
        cityList.add("Delhi");

        hashMap.put(1,cityList);
        ArrayList <String> courseList= new ArrayList<>();
        courseList.add("Java");
        courseList.add("Spring");
        courseList.add("DSpring boot");

        hashMap.put(2,courseList);

        hashMap.get(1);// return list of city

        for (String var: hashMap.get(1)){

            System.out.println("Printing City List: "+var);
        }

        for (String var: hashMap.get(2)){

            System.out.println("Printing Course List: "+var);
        }


    }
}
