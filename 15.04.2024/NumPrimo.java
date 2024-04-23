import java.io.IOException;
 
import java.util.Scanner;
public class NumPrimo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
            int qtd= scanner.nextInt(); //qtd vezes repetir
            int N = 0;
            int primo = 0;

        for (int a=0; a < qtd ; a++){ //qtd de vezes que vai calcular
            primo = 0;
            N = scanner.nextInt();
                for (int i=1; i<=N; i++){
                    if (N % i ==0) {
                    primo ++;
                    }
                }
                if (primo == 2) {
                        System.out.println(N+" eh primo");
                } else { 
                        System.out.println(N+" nao eh primo");
                    }
        }   
    scanner.close();}
           
}
           
    