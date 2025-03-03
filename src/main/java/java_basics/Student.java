package java_basics;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {

    private String name;
    private int rollNum;
    private String collegeName;

    public Student(String name, int rollNum, String collegeName) {
        this.name = name;
        this.rollNum = rollNum;
        this.collegeName = collegeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}

class Driver {

    public static void main(String[] args) {

        Student s1 = new Student("Bishnu",1,"XYZ College");
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNum());
        System.out.println(s1.getCollegeName());
        s1.setCollegeName("ABC College");

        System.out.println(s1);
        System.out.println(s1.getCollegeName());

        Student s2 = new Student("chetana",2,"AAA College");
        System.out.println(s2);

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,20,2,6,1,3,0,1,2));
        System.out.println(nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

    }
}
