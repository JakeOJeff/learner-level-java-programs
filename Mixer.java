import java.util.*;
public class Mixer{
    int arr[];
    int n;

    Mixer(int nn){
        n = nn;
        arr = new int[n];
    }

    void accept() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }
        
    }

    Mixer mix(Mixer A){
        Mixer B = new Mixer(this.n + A.n);
        for (int i = 0; i < this.n; ++i){
            B.arr[i] = this.arr[i];
        }

        for ( int i = this.n; i < this.n + A.n; ++i){
            B.arr[i] = A.arr[i - this.n];
        }
        return B;
    }

    void display(){
        System.out.println("ARRAY :");
        for ( int i = 0; i < n; ++i){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){
        Mixer A = new Mixer(5);
        Mixer B = new Mixer(6);
        A.accept();
        B.accept();

        Mixer C = A.mix(B);
        C.display();
        
    }
}