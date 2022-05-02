package model;

import java.util.Objects;

public class StudentModel {

    int rollno;
    String name;
    String section;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentModel that = (StudentModel) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
// parameterized constructor


    public StudentModel(int rollno, String name, String section) {
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
