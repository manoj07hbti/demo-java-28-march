package collection_demo.hash_set;

import model.Student;
import model.StudentModel;

import java.util.HashSet;

public class StudentSet {

    public HashSet <StudentModel> createStuidentSet(){

        //  Collection <DatType> VarName= New Collection<>();

        HashSet <StudentModel> studentHashSet= new HashSet<>();

        StudentModel student1= new StudentModel(1,"Rakesh","IT");
        StudentModel student4= new StudentModel(1,"Raj","CS");
        StudentModel student2= new StudentModel(2,"Rahul","IT");
        StudentModel student3= new StudentModel(3,"Mukesh","CS");

        System.out.println("Hash code of student1 "+student1.hashCode());
        System.out.println("Hash code of student4 "+student4.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        return studentHashSet;

    }

    public static void main(String[] args) {

        StudentSet obj= new StudentSet();
        HashSet <StudentModel> studentHashSet=obj.createStuidentSet();

        System.out.println("Printing Size : "+studentHashSet.size());
        for(StudentModel var: studentHashSet){

            System.out.println("Printing name :" +var.getName() + " Rollno: "+var.getRollno()+" Section:"+var.getSection());
        }

    }
}
