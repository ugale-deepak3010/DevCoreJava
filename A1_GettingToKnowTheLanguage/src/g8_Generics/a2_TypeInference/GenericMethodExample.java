package g8_Generics.a2_TypeInference;

public class GenericMethodExample {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"Hello", "World"};

        // Type inferred for T as Integer and String
        printArray(intArray);
        printArray(strArray);
    }
}
