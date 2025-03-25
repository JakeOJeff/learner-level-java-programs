import java.util.*;
public class MatMerge{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Sizes of both arrays");
        int m = scan.nextInt();
        int n = scan.nextInt();
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m + n];

        for ( int i = 0; i < 2; ++i){
            System.out.println("Enter elements of array "+ i);
            for ( int j = 0; j < m; ++j){
                if (i == 0){
                    a[j] = scan.nextInt();
                }
                else{
                    b[j] = scan.nextInt();
                }
            }
        }

        int i = 0, j = 0, k = 0;
        while ( i < m && j < n){
            if (a[i] < b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }

        while ( i < m ){
            c[k++] = a[i++];
        }
        while ( j < n){
            c[k++] = b[j++];
        }

        for ( int t = 0; t < k; ++t){
            System.out.println(c[t]);
        }

    }
}