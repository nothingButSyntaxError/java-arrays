public class divisibleBy5 {
    private static void calc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 5, 10, 11, 20 };
        calc(arr);
    }
}
