public class linearSearch {
    private static String search(int arr[], int num) {
        boolean found = false;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                pos = i;
                found = true;
                break;
            }
        }
        if (found) {
            return "Found at position " + pos;
        } else {
            return "Not in array";
        }
    }

    public static void main(String args[]) {
        int num = 5;
        int arr[] = { 0, 2, 3, 5, 10 };
        System.out.println(search(arr, num));
    }
}
