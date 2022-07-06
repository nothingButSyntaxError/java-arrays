public class thirdLargest {
    private static int[] sorter(int arr[]) {
        boolean sorted = false;
        for (int i = 0; i < arr.length; i++) {
            sorted = true;
            for (int j = 1; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 8, 4, 9, 5 };
        System.out.println(sorter(arr)[2]);
    }
}
