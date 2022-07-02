public class rotateArray {
    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length / 2; i++) {
            int last = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = last;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}