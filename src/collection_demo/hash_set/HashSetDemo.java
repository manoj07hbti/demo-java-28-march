package collection_demo.hash_set;

import java.util.HashSet;

public class HashSetDemo {

    public  HashSet <String> createHashSet(){

        // HashSet <Datatype > objName= new HashSet<>();

        HashSet <String> course= new HashSet<>();
        course.add("Java");
        course.add("Java");
        course.add("Java8");
        course.add("Spring");
        course.add("Spring boot");
        course.add("Java8");
        course.add("Spring");
        course.add("Spring boot");

        System.out.println("Printing size of course set: "+course.size());

        return course;
    }

    public HashSet<Integer> createIntSet(){

        HashSet<Integer> marks=new HashSet<>();

        marks.add(33);
        marks.add(45);
        marks.add(77);
        marks.add(33);
        marks.add(45);
        marks.add(77);

        return marks;
    }

    // Double

    public static void main(String[] args) {

        HashSetDemo obj= new HashSetDemo();
        HashSet <String> course=  obj.createHashSet();
        for (String var: course){

            System.out.println("Printing course..."+var);
        }

        HashSet<Integer> output= obj.createIntSet();

        for (Integer var: output){
            System.out.println("Printing marks..."+var);

        }
    }

}
