public class duplicate {
    private static void finder(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 17, 11, 23, 14, 23, 12, 19 };
        finder(arr);
    }
}