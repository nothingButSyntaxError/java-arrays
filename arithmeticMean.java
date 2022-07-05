public class arithmeticMean {
    private static int mean(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total / arr.length;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 5, 10, 15 };
        System.out.println(mean(arr));
    }
}