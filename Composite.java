import java.util.*;
public class Composite{
    int arr[][];
    int M, N;

    Composite(int mm, int nn){
        M = mm;
        N = nn;
        arr = new int[M][N];
    }

    int isComposite(int p){
        int multiples = 0;
        for (int i = 1; i < p; ++i){
            if (p%i == 0){
                ++multiples;
            }
        }
        if (multiples > 2){
            return 1;
        }

        return 0;
    }

    void fill(){
        int nums = 4, count = 0;
        for ( int i = 0; i < M; ++i){
            for ( int j = 0; j < N; ++j){
                while( isComposite(nums) != 1){
                    nums++;
                }
                arr[i][j] = nums; // Store the composite number
                nums++; // Move to the next number
                count++;
                if (count == M * N) {
                    return; // Stop when the array is filled
                }
            }
        }
    }

    void display(){
        for ( int i = 0; i < M; ++i){
            for ( int j = 0; j < N; ++j){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }      
    }

    public static void main(String args[]){
        Composite obj = new Composite(5, 5);
        obj.fill();
        obj.display();
    }
}