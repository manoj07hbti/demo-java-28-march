package hashmap_demo;

import java.util.HashMap;

public class HashMapDemo {


    public static void main(String[] args) {

        //SYNTAX : HashMap <Datatype_Key, Datatype_value>= new HashMap<>();

        HashMap<Integer, String> map= new HashMap<>();

        // add
        map.put(1,"Java");
        map.put(2,"Java8");
        map.put(3,"Spring");

        // get

        System.out.println("Get 1 key:  "+ map.get(1));
        System.out.println("Get 3 key:  "+ map.get(3));
        System.out.println("Get 2 key:  "+ map.get(2));

        HashMap<String , String> mapString= new HashMap<>();

        mapString.put("A","Agra");
        mapString.put("B","Pune");

        System.out.println("Printing city "+mapString.get("A"));


    }
}
