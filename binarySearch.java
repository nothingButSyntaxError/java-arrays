public class binarySearch {
    private static String binary(int arr[], int element) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;
        boolean found = false;
        while (left <= right) {
            middle = (left + right) / 2;
            if (arr[middle] == element) {
                found = true;
                break;
            } else if (arr[middle] > element) {
                right = middle - 1;
            } else if (arr[middle] < element) {
                left = middle + 1;
            }
        }
        if (!found) {
            return "Not in array";
        } else {
            return "Found at " + middle;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4 };
        int toFind = 3;
        System.out.println(binary(arr, toFind));
    }
}
