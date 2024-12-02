public class RangeChecker {
    public static void main(String[] args) {
        int value = 18;

        if (value < 10) {
            System.out.println("Value is less than 10.");
        } else if (value < 15) {
            System.out.println("Value is less than 15.");
        } else if (value < 20) {
            System.out.println("Value is less than 20.");
        } else {
            System.out.println("Value is 20 or greater.");
        }

        System.out.println("Outside the if-else-if ladder.");
    }
}
