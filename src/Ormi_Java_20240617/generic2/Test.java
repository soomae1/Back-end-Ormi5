package Ormi_Java_20240617.generic2;

public class Test {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        integerBox.set(6);
        int i = integerBox.get();

        Box <Integer> boxing = Util.boxing(100) ;

    }
}
