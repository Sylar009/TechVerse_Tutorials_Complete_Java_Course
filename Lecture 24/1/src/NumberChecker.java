public class NumberChecker {
    public static void main(String[] args) {
        int number = 25;

        if (number == 10) {
            System.out.println("The number is 10.");
        } else if (number == 15) {
            System.out.println("The number is 15.");
        } else if (number == 25) {
            System.out.println("The number is 25.");
        } else {
            System.out.println("The number is not in the list.");
        }

        System.out.println("Outside the if-else-if ladder.");
    }
}
