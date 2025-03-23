import java.util.*;
public class DeciHex{

    int num;
    String hexa;

    char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    DeciHex(){
        num = 0;
        hexa = "";
    }

    void getNum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Decimal number");
        num = scan.nextInt();
    }

    void convert(int n){
        
        if (n != 0){
            int t = n%16;
            hexa = hexChar[t] + hexa;
            n = n/16;
            convert(n);
        }
        else{
             return;
        }
    }

    void display(){
        this.convert(num);
        System.out.println("Hexadecimal Equivalent : "+ hexa);
    }

    public static void main(String args[]){
        DeciHex obj = new DeciHex();
        obj.getNum();
        obj.display();
    }
}