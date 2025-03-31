package java_advanced;

import java.lang.reflect.Modifier;

public class Reflection_Demo {
    public static void main(String[] args) throws ClassNotFoundException {

        //Student s = new Student("xyz",1);
        //Student s = new Student();

        //Class obj = Class.forName("java_advanced.Student");

        //Class c = Student.class;

        Student s = new Student();
        Class obj = s.getClass();
        String name = obj.getName();

        System.out.println(name);

        int modifier = obj.getModifiers();

        String mod = Modifier.toString(modifier);
        System.out.println(modifier);
        System.out.println(mod);

    }
}

class Student {

    private String name;
    private int rollNum;

    public Student() {
        System.out.println("Called by Class.forName");
    }

    public Student(String name, int rollNum) {
        this.name = name;
        this.rollNum = rollNum;
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
}
