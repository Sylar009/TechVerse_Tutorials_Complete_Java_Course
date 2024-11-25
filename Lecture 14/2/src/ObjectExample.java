import java.util.Arrays;

public class ObjectExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int[] copiedNumbers = numbers;

        System.out.println("Before modification:");
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Copied: " + Arrays.toString(copiedNumbers));

        copiedNumbers[1] = 50;

        System.out.println("\nAfter modification:");
        System.out.println("Original: " + Arrays.toString(numbers));
        System.out.println("Copied: " + Arrays.toString(copiedNumbers));
    }
}