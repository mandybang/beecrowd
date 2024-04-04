import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/

public class Experimentos {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // casos que vem a seguir
        int qtd = 0; // qtd de cobaias utilizadas >=1 && <=15 
        // Ex: se for 10 (N), então em cada um pode ter no min 1 cobaia ou no max 15 cobaias. 10x

        int ratos =0;
        int coelhos = 0;
        int sapos = 0;
        int soma; // soma entre as cobaias
        double prcC; // percentual coelho
        double prcR; // percentual rato
        double prcS; // percentual sapo

        for (int i=0; i < N; i++) {
            int qtdCobaias = input.nextInt(); // quantidade de cobaias informada
            char select = input.next().charAt(0); // tipo de cobaia utilizada
           
            if (qtdCobaias >= 1 && qtdCobaias<=15) {
                switch (select) {
                    case 'R':
                    ratos = ratos + qtdCobaias;
                        
                        break;
                    case 'S':
                    sapos = sapos + qtdCobaias;
                        break;
                    case 'C':
                    coelhos = coelhos + qtdCobaias;
                        
                        break;
                
                    default:
        
                        break;
                }
                
            }

        }

        soma = coelhos+sapos+ratos;
        prcC = (coelhos*100.00)/soma;
        prcR = (ratos*100.00)/soma;
        prcS = (sapos*100.00)/soma;
       
      
        input.close(); 


        System.out.println("Total: " + soma + " cobaias");
        System.out.println("Total de coelhos: " +coelhos );
        System.out.println("Total de ratos: " +ratos);
        System.out.println("Total de sapos: " +sapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", prcC) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", prcR) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", prcS) + " %");

    }
 
} 

