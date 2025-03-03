package java_basics;

public class Parent {

    public static void printRollNum(){
        System.out.println("From Parent");
    }
}

class Child extends Parent {

    public static void printRollNum(){
        System.out.println("From Child");
    }

}

class TestCls {
    public static void main(String[] args) {

        Parent obj = new Child();
        obj.printRollNum();
    }
}

