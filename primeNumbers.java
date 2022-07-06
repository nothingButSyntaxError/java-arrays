public class primeNumbers {
    private static boolean prime(int num) {
        if (num == 1 || num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int primes = 0;
        int arr[] = { 4, 3, 7, 8, 11, 13 };
        for (int i = 0; i < arr.length; i++) {
            if (prime(arr[i])) {
                primes++;
            }
        }
        System.out.println(primes);
    }
}
