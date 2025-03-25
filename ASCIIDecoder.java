import java.util.Scanner;

public class ASCIIDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter encoded message: ");
        String encoded = scanner.nextLine();
        scanner.close();
        
        // Reverse the string back to original order
        String reversed = new StringBuilder(encoded).reverse().toString();
        
        // Decode ASCII values
        StringBuilder decodedMessage = new StringBuilder();
        int i = 0;
        while (i < reversed.length()) {
            // Try extracting a three-digit ASCII value first
            if (i + 2 < reversed.length()) {
                int value = Integer.parseInt(reversed.substring(i, i + 3));
                if (value >= 100 && value <= 126) {
                    decodedMessage.append((char) value);
                    i += 3;
                    continue;
                }
            }
            
            // Try extracting a two-digit ASCII value
            if (i + 1 < reversed.length()) {
                int value = Integer.parseInt(reversed.substring(i, i + 2));
                if (value >= 32 && value <= 99) {
                    decodedMessage.append((char) value);
                    i += 2;
                    continue;
                }
            }
            
            System.out.println("Invalid encoded message");
            return;
        }
        
        System.out.println("Decoded message: " + decodedMessage.toString());
    }
}
