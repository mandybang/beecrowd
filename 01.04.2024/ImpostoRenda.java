import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class ImpostoRenda {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner (System.in);

        double salario;
        double imposto;
        double total;

        salario = input.nextDouble();

        if (salario <=2000.00) {
            imposto = 0.0;
            System.out.println("Isento");
        }
        else if (salario >= 2000.01 && salario <= 3000.00) {

            imposto = 0.08;
            total= (salario-2000.00) * imposto;
            System.out.printf("R$ %.2f%n", total);
        }
        else if (salario >= 3000.01 && salario <=4500.00) {
            imposto = 0.18;
            total= (1000.00 * 0.08) + ((salario - 3000.00) * imposto);
            System.out.printf("R$ %.2f%n", total);
        }
         else {
            imposto = 0.28;
            total= (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * imposto);
            System.out.printf("R$ %.2f%n", total);
        }
        


        input.close();
    }
 
}