import java.util.Scanner;

public class PrimeRange {

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending range: ");
        int end = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        boolean foundPrime = false;
        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.println("No prime numbers found in the given range.");
        }

        scanner.close();
    }
}
