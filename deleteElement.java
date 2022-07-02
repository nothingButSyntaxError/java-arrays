public class deleteElement {
    private static int[] delete(int arr[], int num) {
        int pos = 0;
        int main[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                pos = i;
            }
        }
        for (int i = 0; i < pos; i++) {
            main[i] = arr[i];
        }
        for (int i = pos + 1; i < arr.length; i++) {
            main[i - 1] = arr[i];
        }
        return main;
    }

    public static void main(String args[]) {
        int arr[] = { 0, 1, 2, 3, 4 };
        int num = 3;
        int returned[] = delete(arr, num);
        for (int i = 0; i < returned.length; i++) {
            System.out.print(returned[i] + ", ");
        }
    }
}
