import java.util.Scanner;

public class CircularPrime {

    // Function to check if a number is prime
    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Function to count number of digits
    private static int countDigits(int n) {
        return (int) Math.log10(n) + 1;
    }

    // Function to generate and check circular permutations
    private static boolean isCircularPrime(int n) {
        int digits = countDigits(n);
        int num = n;

        for (int i = 0; i < digits; i++) {
            if (!isPrime(num)) return false; // If any rotation is not prime, return false
            num = rotateNumber(num, digits); // Get next circular permutation
        }
        return true;
    }

    // Function to rotate a number to the left
    private static int rotateNumber(int n, int digits) {
        int firstDigit = n / (int) Math.pow(10, digits - 1); // Extract leftmost digit
        int remaining = n % (int) Math.pow(10, digits - 1);  // Remove leftmost digit
        return remaining * 10 + firstDigit; // Append leftmost digit to the right
    }

    // Main function to test for circular primes
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scan.nextInt();
        scan.close();

        if (isCircularPrime(num)) {
            System.out.println(num + " is a Circular Prime.");
        } else {
            System.out.println(num + " is NOT a Circular Prime.");
        }
    }
}
