package collection_demo.arraylist_demo;

import model.Student;

import java.util.ArrayList;

public class StudentArrayList {

    public ArrayList <Student> createStudentList(){

        //  Collection <DatType> VarName= New Collection<>();

        ArrayList <Student> studentArrayList= new ArrayList<>();

        // need data of student : student1 ,2, 3

        Student student1= new Student(1,"Raj","CS");
        Student student2= new Student(2,"Rahul","IT");
        Student student3= new Student(3,"Mukesh","CS");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        return studentArrayList;
    }

    public static void main(String[] args) {
        StudentArrayList obj= new StudentArrayList();
        ArrayList <Student> studentArrayList=  obj.createStudentList();

        for(Student var: studentArrayList){

            System.out.println("Printing name "+var.getName());

            System.out.println("Printing Rollno "+var.getRollno());
            System.out.println("Printing Section "+var.getSection());

            System.out.println("Printing name :" +var.getName() + " Rollno: "+var.getRollno()+" Section:"+var.getSection());


        }
// Setter method usage :
        for (Student var: studentArrayList){

            if(var.getName().equals("Rahul")){

                var.setName("Rahul Kumar");
            }
            var.setSection("IT");// changing section

            System.out.println("AFTER SETTER METHOD Printing name :" +var.getName() + " Rollno: "+var.getRollno()+" Section:"+var.getSection());
        }


    }

}
