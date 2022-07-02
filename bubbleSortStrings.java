public class bubbleSortStrings {
    private static String[] sort(String arr[]) {
        boolean sorted;
        for (int i = 0; i < arr.length; i++) {
            sorted = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    String temp = arr[j];
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
        String arr[] = { "Samsung", "Apple", "Microsoft", "Google" };
        String sorted[] = sort(arr);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
    }
}
