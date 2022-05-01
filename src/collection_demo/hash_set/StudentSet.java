package collection_demo.hash_set;

import model.Student;

import java.util.HashSet;

public class StudentSet {

    public HashSet <Student> createStuidentSet(){

        //  Collection <DatType> VarName= New Collection<>();

        HashSet <Student> studentHashSet= new HashSet<>();

        Student student1= new Student(1,"Raj","CS");
        Student student4= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Rahul","IT");
        Student student3= new Student(3,"Mukesh","CS");

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        return studentHashSet;

    }

    public static void main(String[] args) {

        StudentSet obj= new StudentSet();
        HashSet <Student> studentHashSet=obj.createStuidentSet();

        System.out.println("Printing Size : "+studentHashSet.size());
        for(Student var: studentHashSet){

            System.out.println("Printing name :" +var.getName() + " Rollno: "+var.getRollno()+" Section:"+var.getSection());
        }

    }
}
