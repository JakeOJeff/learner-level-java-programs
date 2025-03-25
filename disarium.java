import java.util.*;
public class disarium{

    int num, size;

    disarium(int n){
        num = n;
        size = 0;
    }

    void countDigits(){
        int n = num;
        while(n != 0){
            ++size;
            n /= 10;
        }
    }

    int sumofdigits(int n, int p){
        if (n == 0){
            return 0;
        }
        else{
            return sumofdigits(n/10, p-1) + (int) Math.pow(n%10, p);
        }
    }

    void check(){
        if (sumofdigits(num, size) == num){
            System.out.println("DISARIUM NUMBER");
        }
        else{
            System.out.println("NOT DISARIUM");
        }
    }
    

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check");
        
        int n = scan.nextInt();

        disarium obj = new disarium(n);
        obj.countDigits();
        obj.check();


    }
}