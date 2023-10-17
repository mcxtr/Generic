public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <U> Box<U> createBox(U value) {
        return new Box<>(value);
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = Box.createBox(42);
        Box<String> stringBox = Box.createBox("Salam Aleikym!");

        System.out.println("Integer Box Value: " + integerBox.getValue());
        System.out.println("String Box Value: " + stringBox.getValue());
    }
}
