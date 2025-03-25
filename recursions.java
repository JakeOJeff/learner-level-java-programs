import java.util.*;
public class recursions{

    public static int prime( int c, int n){

        if (c < n ){

            if ( n % c == 0 ){
                return 1;
            }
            else{
                return prime(++c, n);
            }
        }
        else{
            return 0;
        }
    }

    public static int rev(int n, int r){
        if ( n == 0){
            return r;
        }
        else{
            r = r * 10 + n % 10;
            n /= 10;;
            return rev(n, r);
        }
    }

    public static double armstrong(int n){
        if ( n == 0 ){
            return 0;
        }
        else {
            return ( armstrong(n/10) + Math.pow((n%10), 3));
        }
    }

    public static int greatestCommonDivisor(int n1, int n2){
        if ( n1 == n2 ){
            return n1;
        }
        else if (n1 > n2){
            return (int) greatestCommonDivisor(n1 - n2, n2);
        }
        else {
            return (int) greatestCommonDivisor(n1, n2 - n1);
        }
    }

    public static int BinSearch(int a[], int l, int h, int ele) {
        if (l > h) {
            return -1;  // Return -1 when element is not found
        }
        
        int mid = (l + h) / 2;  // Calculate the middle index
        
        if (ele == a[mid]) { 
            return 1;  // Element found
        } 
        else if (ele < a[mid]) {  
            return BinSearch(a, l, mid - 1, ele);  // Search in the left half
        } 
        else {  
            return BinSearch(a, mid + 1, h, ele);  // Search in the right half
        }
    }
    

    // binary recursion ( calls itself from type points )
    public static int fib(int n){
        if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else{
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String args[]){
        if (prime(1,15) == 1){
            System.out.println("Number 15 is prime");
        }

        System.out.println("Reverse of 123 is " + rev(123, 0));

        if ( 153 == armstrong(153)){
            System.out.println("153 is an armstrong number!");
        }


        int a[] = {1, 3, 4, 6, 7, 12, 24, 41, 122};
        System.out.println("Position of 3 is "+ BinSearch(a, 0, a.length - 1, 3));
    }
}