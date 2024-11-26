class MaxTracker {
    private int max = Integer.MIN_VALUE;

    public void add(int value) {
        if (value > max) max = value;
    }

    public int getMax() {
        return max;
    }
}

class App {
    public static void main(String[] args) {
        MaxTracker tracker = new MaxTracker();
        tracker.add(10);
        tracker.add(20);
        tracker.add(5);
        System.out.println("Maximum Value: " + tracker.getMax());
    }
}