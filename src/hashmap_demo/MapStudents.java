package hashmap_demo;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class MapStudents {

    public static void main(String[] args) {

        //SYNTAX : HashMap <Datatype_Key, Datatype_value>= new HashMap<>();

        HashMap<Integer, Student> studentHashMap= new HashMap<>();

        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Rahul","IT");
        Student student3= new Student(3,"Mukesh","CS");

        studentHashMap.put(1,student1);
        studentHashMap.put(2,student2);
        studentHashMap.put(3,student3);


        for (Integer var: studentHashMap.keySet()){

          System.out.println("Printing Student map "+studentHashMap.get(var).getName());
        }

        HashMap <String, ArrayList<Student>> stringArrayListHashMap= new HashMap<>();


        ArrayList <Student> kpitStudents= new ArrayList<>();

        // need data of student : student1 ,2, 3

        Student stu1= new Student(1,"Raj","CS");
        Student stu2= new Student(2,"Rahul","IT");
        Student stu3= new Student(3,"Mukesh","CS");

        kpitStudents.add(stu1);
        kpitStudents.add(stu2);
        kpitStudents.add(stu3);

        ArrayList <Student> hinduStudents= new ArrayList<>();

         stu1= new Student(1,"John","CS");
         stu2= new Student(2,"Mohit","IT");
         stu3= new Student(3,"Rajesh","CS");

        stringArrayListHashMap.put("KPIT",kpitStudents);
        stringArrayListHashMap.put("HINDU",hinduStudents);

        for (Student var : stringArrayListHashMap.get("KPIT")){

            System.out.println("Printing KPIT STUDENTS "+ var.getName());
        }

    }
}
