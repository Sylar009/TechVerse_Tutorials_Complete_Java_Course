import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20); 
        int number = list.get(0); // Unboxing
        System.out.println("Primitive Value: " + number);
    }
}