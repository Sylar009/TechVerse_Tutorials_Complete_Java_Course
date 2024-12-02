import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your roll number:");
        int rollNo = sc.nextInt();
        System.out.println("Enter your marks:");
        float marks = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}
