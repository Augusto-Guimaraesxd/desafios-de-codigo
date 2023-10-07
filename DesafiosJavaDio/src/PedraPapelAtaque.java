import java.util.*;

public class PedraPapelAtaque {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        String jogador1, jogador2;
        StringBuilder resultados = new StringBuilder(); // Variável para armazenar os resultados

        for (int i = 0; i < N; i++) {
            jogador1 = leitor.next();
            jogador2 = leitor.next();

            if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("ataque"))
                resultados.append("Aniquilacao mutua\n");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("papel"))
                resultados.append("Ambos venceram\n");
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("papel"))
                resultados.append("Jogador 1 venceu\n");
            else if (jogador1.equalsIgnoreCase("ataque") && jogador2.equalsIgnoreCase("pedra"))
                resultados.append("Jogador 1 venceu\n");
            else if (jogador1.equalsIgnoreCase("pedra") && jogador2.equalsIgnoreCase("ataque"))
                resultados.append("Jogador 2 venceu\n");
            else if (jogador2.equalsIgnoreCase("ataque") && jogador1.equalsIgnoreCase("papel"))
                resultados.append("Jogador 2 venceu\n");
            else if (jogador2.equalsIgnoreCase("papel") && jogador1.equalsIgnoreCase("ataque"))
                resultados.append("Jogador 1 venceu\n");
            else if (jogador1.equalsIgnoreCase("papel") && jogador2.equalsIgnoreCase("pedra"))
                resultados.append("Jogador 2 venceu\n");
            else
                resultados.append("Sem ganhador\n");
        }

        // Imprimir todos os resultados juntos
        System.out.println(resultados.toString());
    }}