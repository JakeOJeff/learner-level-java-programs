import java.util.*;

public class Combination {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to print the combination of consecutive numbers:");
        int n = scan.nextInt();
        scan.close(); // Closing the scanner

        for (int i = 1; i <= n / 2; i++) {
            int sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    printSequence(i, j);
                    break; // Stop when we find a valid sequence
                } else if (sum > n) {
                    break; // No need to continue if sum exceeds n
                }
            }
        }
    }

    private static void printSequence(int start, int end) {
        for (int k = start; k <= end; k++) {
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
