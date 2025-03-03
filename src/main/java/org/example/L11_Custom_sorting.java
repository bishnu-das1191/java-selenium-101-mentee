package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class L11_Custom_sorting {
    public static void main(String[] args) {

        // You have objects and sort them based on their properties

        List<Student> students = new ArrayList<>();
        students.add(new Student("Bishop",2,90));
        students.add(new Student("Chaitali",3,78));
        students.add(new Student("Aman",1,85));
        students.add(new Student("Deven",4,92));
        students.add(new Student("Deven",5,81));

        System.out.println(students);

        // Sort by Student Names (ASC)
        students.sort(Comparator.comparing(Student::getName));
        System.out.println(students);

        // Sort by Student Names (DESC)
        students.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(students);

        // Sort Students by their Percentage (DESC)
        students.sort(Comparator.comparingInt(Student::getPercentage).reversed());
        System.out.println(students);

        // Sort Students by their roll number (ASC)
        students.sort(Comparator.comparingInt(Student::getRoll));
        System.out.println(students);

        // Sort by name (ASC), then by roll number (if names are same)
        students.sort(Comparator.comparing(Student::getName).thenComparingInt(Student::getRoll));
        System.out.println(students);








    }
}

class Student {

    // private < default < protected < public
    private String name;
    private int roll;
    private int percentage;

    public Student(String name, int roll, int percentage) {
        this.name = name;
        this.roll = roll;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", percentage=" + percentage +
                '}';
    }
}


