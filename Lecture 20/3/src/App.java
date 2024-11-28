class DemoIncrementDecrement {
    public static void main(String[] args) {
        int count = 5;
        System.out.println("Initial Value: " + count);
        System.out.println("After Pre-Increment: " + (++count));
        System.out.println("After Post-Increment: " + (count++));
        System.out.println("After Pre-Decrement: " + (--count));
        System.out.println("After Post-Decrement: " + (count--));
    }
}