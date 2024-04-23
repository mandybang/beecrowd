import java.io.IOException;
import java.util.Scanner;

public class FalhaMotor {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // quantidade de casos de teste

        int[] casoUso = new int[N];

        for (int i = 0; i < N; i++) {
            casoUso[i] = scanner.nextInt();
        }

        int maior = casoUso[0];
        int posicao = 0;

        for (int i = 0; i < N - 1; i++) {
            if (casoUso[i + 1] > maior) {
                maior = casoUso[i + 1];
            }

            if (casoUso[i + 1] < maior) {
                posicao = i + 2;
                break;
            }
        }

        System.out.println(posicao);

        scanner.close();
    }
}
