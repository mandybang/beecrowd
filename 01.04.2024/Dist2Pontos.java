import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Dist2Pontos { 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float x1 = input.nextFloat();
        float y1= input.nextFloat();
        float x2= input.nextFloat();
        float y2= input.nextFloat();

        double p1= Math.pow(x2-x1, 2);
        double p2 = Math.pow(y2-y1, 2);

        double distancia = Math.sqrt(p1+p2);
        
        System.out.printf("%.4f%n", distancia);


        input.close();
       
    }
 
}