import java.util.*;
public class Prime_Palin{

    private static int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }
    

    private static boolean prime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) return false; // If divisible, not prime
        }
        return true;
    }
    

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m, n, num;

        System.out.println("Enter two limits");
        m = scan.nextInt();
        n = scan.nextInt();
        for ( int i = m; i < n; ++i){
            num = i;
            if (num == reverse(num) && prime(num)){
                System.out.println(num);
            }
        }
    }

}