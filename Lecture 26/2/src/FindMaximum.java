public class FindMaximum {
    public static void main(String[] args) {
        int[] values = {12, 45, 67, 89, 23};
        int max = getMax(values);
        System.out.println("Maximum value: " + max);
    }

    public static int getMax(int[] array) {
        int maxValue = array[0];
        for (int val : array) {
            if (val > maxValue) {
                maxValue = val;
            }
        }
        return maxValue;
    }
}
