import java.util.*;
public class Sort{

    String Str;
    int Len;

    Sort(){
        Str = "";
        Len = 0;
    }

    void readword(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A WORD");
        Str = scan.next();
        Len = Str.length();
    }

    void arrange(){
        char[] charArray = Str.toCharArray();
        for ( int i = 0; i < Len - 1; ++i ){
            for (int j = 0; j < Len - i - 1; ++j){
                if (charArray[j] > charArray[j + 1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        }
        Str = new String(charArray);
    }

    void display(){
        System.out.println("ORIGINAL : "+ Str);
        this.arrange();
        System.out.println("SORTED : " + Str);
    }

    public static void main(String args[]){
        Sort obj = new Sort();
        obj.readword();
        obj.display();
    }
}