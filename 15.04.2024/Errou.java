import java.util.Scanner;
import java.io.IOException;

public class Errou {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        // Ler o número de casos
        int numCasos = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        
        for (int caso = 0; caso < numCasos; caso++) {
            // Ler a equação como uma linha de texto e dividir em partes
            String linha = scanner.nextLine();
            String[] partes = linha.split(" ");
            
            // Extrair os números e o operador
            int primeiroNumero = Integer.parseInt(partes[0]);
            String operador = partes[1];
            int segundoNumero = Integer.parseInt(partes[2]);
            String respostaUsuario = partes[4];
            
            // Calcular o resultado real
            int resultadoReal;
            if (operador.equals("+")) {
                resultadoReal = primeiroNumero + segundoNumero;
            } else if (operador.equals("-")) {
                resultadoReal = primeiroNumero - segundoNumero;
            } else { // Supondo que o operador seja sempre *
                resultadoReal = primeiroNumero * segundoNumero;
            }
            
            // Verificar se o resultado fornecido pelo usuário está correto
            if (!respostaUsuario.equals(String.valueOf(resultadoReal))) {
                // Calcular a diferença entre os resultados
                int diferenca = Math.abs(Integer.parseInt(respostaUsuario) - resultadoReal);
                // Gerar a mensagem de erro
                String mensagemErro = "E"+"r".repeat(diferenca) + "ou!";
                System.out.println(mensagemErro);
            }
        }
   scanner.close(); }
}
