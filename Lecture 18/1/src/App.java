import java.util.ArrayList;

class App {
    public static void main(String[] args) {
        int number = 10; 
        ArrayList<Integer> list = new ArrayList<>();
        list.add(number); // Autoboxing
        System.out.println("List Element: " + list.get(0));
    }
}