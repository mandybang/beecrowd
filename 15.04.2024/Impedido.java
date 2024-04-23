import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Impedido {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            if (n == 0 && m == 0)
                break;

            int[] atacantes = new int[n]; //criei um array
            int[] defensores = new int[m];
            
            for (int i = 0; i < n; i++)
                atacantes[i] = scanner.nextInt();
            
            for (int i = 0; i < m; i++)
                defensores[i] = scanner.nextInt();
            
            Arrays.sort(atacantes); //usado para ordenar em crescente
            Arrays.sort(defensores);
            
            boolean podePassar = atacantes[0] < defensores[1];
            System.out.println(podePassar ? "Y" : "N" );
            
        }
        scanner.close();
    }
}