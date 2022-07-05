public class printVowels {
    private static void printer(char arr[]) {
        char vowels[] = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (arr[i] == vowels[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        char arr[] = { 'p', 'q', 'u' };
        printer(arr);
    }
}
