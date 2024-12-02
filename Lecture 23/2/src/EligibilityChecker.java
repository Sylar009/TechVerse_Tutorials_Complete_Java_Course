public class EligibilityChecker {
    public static void main(String[] args) {
        int age = 22;
        double weight = 55.0;

        if (age >= 18) {
            if (weight >= 50.0) {
                System.out.println("Eligible for donation.");
            } else {
                System.out.println("Weight must be at least 50 kg.");
            }
        } else {
            System.out.println("You must be at least 18 years old.");
        }
    }
}
