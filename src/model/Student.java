package model;

public class Student {

    int rollno;
    String name;
    String section;

    // parameterized constructor


    public Student(int rollno, String name, String section) {
        this.rollno = rollno;
        this.name = name;
        this.section = section;
    }

    // getter and setter


    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
