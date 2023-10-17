public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = Box.createBox(42);
        Box<String> stringBox = Box.createBox("Salam Aleikym!");

        System.out.println("Integer Box Value: " + intBox.getValue());
        System.out.println("String Box Value: " + stringBox.getValue());

    }
}