import java.io.IOException;
import java.util.Scanner;

public class OHobbit {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha após o número

        int hobbits = 0, humanos = 0, elfos = 0, anoes = 0, magos = 0;

        for (int i = 1; i <= N; i++) {
            String[] input = scanner.nextLine().split(" ");
            String tipo = input[1];

            switch (tipo) {
                case "A":
                    anoes++;
                    break;
                case "E":
                    elfos++;
                    break;
                case "H":
                    humanos++;
                    break;
                case "M":
                    magos++;
                    break;
                case "X":
                    hobbits++;
                    break;
                default:
                    break;
            }
        }

        System.out.printf("%d Hobbit(s)\n%d Humano(s)\n%d Elfo(s)\n%d Anao(oes)\n%d Mago(s)\n",
                hobbits, humanos, elfos, anoes, magos);

        scanner.close();
    }
}
