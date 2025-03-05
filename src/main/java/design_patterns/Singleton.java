package design_patterns;

public class Singleton {

    // static variable to hold the instance
    private static Singleton instance;

    // private constructor
    private Singleton(){
        // prevent instantiation
    }

    // object creation logic : through 1 single instance
    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

class Driver {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1 == singleton3);

    }
}
