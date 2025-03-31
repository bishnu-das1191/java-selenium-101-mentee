package java_advanced;

public class Box2<T> {

    private T content;

    public Box2(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void displayContent(){
        System.out.println("Content: "+content);
    }

    public static void main(String[] args) {

        // create a Box of Integer
        Box2<Integer> integerBox = new Box2<>(123);
        integerBox.displayContent();
        integerBox.setContent(500);
        integerBox.displayContent();

        Box2<String> stringBox = new Box2<>("Hello, Generics");
        stringBox.displayContent();
        stringBox.setContent("Good");
        stringBox.displayContent();

        String str = "xyz";
        Box2<?> randomBox = new Box2<>(str);

    }

}
