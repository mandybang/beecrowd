import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Lanche {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double cod1 = 4;
        double cod2 = 4.50;
        double cod3 = 5;
        double cod4 = 2;
        double cod5 = 1.50;
        int cod = input.nextInt();
        int qtd = input.nextInt();
        double total = 0;

        switch (cod) {
            case 1:
            total = cod1 * qtd;

                break;
            case 2:
            total = cod2 * qtd;

                break;
            case 3:
            total = cod3 * qtd;

                break;
            case 4:
            total = cod4 * qtd;
            
                break;
            case 5:
            total = cod5 * qtd;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", total);

        input.close();
 
    }
 
}