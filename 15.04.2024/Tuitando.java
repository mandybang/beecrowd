import java.io.IOException;
import java.util.Scanner;
public class Tuitando {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String TWEET = scanner.nextLine();

        if (TWEET.length() <= 140) {
            System.out.println("TWEET");
        } else {
            System.out.println("MUTE");
        }
 
   scanner.close(); }
 
}