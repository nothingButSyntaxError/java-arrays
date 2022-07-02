public class replaceDigits {
    private static int[] replace(int arr[]) {
        for (int i = 0; i < arr.length; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        int replaced[] = replace(arr);
        for (int i = 0; i < replaced.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
