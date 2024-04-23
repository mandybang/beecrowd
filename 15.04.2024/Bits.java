import java.io.IOException;
import java.util.Scanner;

public class Bits {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
                
            int bit;
            int qtsBits1, qtsBits5, qtsBits10, qtsBits50;
            int qtsTestes = 0;
        
            while (true) {
                bit = scanner.nextInt();
                if (bit == 0)
                    break;
        
            qtsBits1 = qtsBits5 = qtsBits10 = qtsBits50 = 0;

            qtsBits50 = bit / 50;
            bit %= 50;
        
            qtsBits10 = bit / 10;
            bit %= 10;
        
            qtsBits5 = bit / 5;
            bit %= 5;
        
            qtsBits1 = bit;
        
            System.out.println("Teste " + ++qtsTestes);
            System.out.println(qtsBits50 + " " + qtsBits10 + " " + qtsBits5 + " " + qtsBits1 + "\n");
            }
        
    scanner.close();
   }
}
