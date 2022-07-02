public class bubbleSort {
    private static int[] sort(int arr[]) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = true;
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
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
        int arr[] = { 5, 9, 10, 1, 0, 1, 2 };
        int sorted[] = sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(sorted[i]);
        }
    }
}