package java_advanced;

import java.util.ArrayList;
import java.util.List;

public class Generic_Demo {
    public static void main(String[] args) {

        /*List<String> lst = new ArrayList();
        lst.add("XYZ");
        lst.add(true);
        lst.add(20);
        System.out.println(lst);*/

        /*Box b = new Box();
        b.setT("XYZ");
        b.setT(10);*/

       /* Box<String> box = new Box<>();
        box.setT("xyz");
        //box.setT(10);

        Box<Integer> b = new Box<>();
        b.setT(20);
        b.setT(10);*/

        Integer[] arr = {3,2,1,9,4,5};
        Generic_Method.printArray(arr);

        String[] strArr = {"xyz", "abc", "test"};
        Generic_Method.printArray(strArr);

    }
}

class Box<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}


class Generic_Method {

    public static <T> void printArray(T[] array){
        for(T value : array){
            System.out.print(value+" ");
        }
    }
}
