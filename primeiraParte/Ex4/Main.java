import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        CadeiaDeDna cadeia = new CadeiaDeDna();
        AlgoritmosGeneticos seq1 = new AlgoritmosGeneticos();

        System.out.println("Digite o Tamanho da Cadeia:");

        int tamanho = in.nextInt() * 2;

        cadeia.geradorDeDna(tamanho);

        String sequencia1 = (cadeia.geradorDeDna(tamanho)[0]);
        String sequencia2 = (cadeia.geradorDeDna(tamanho)[1]);

        seq1.recombinacao(sequencia1, sequencia2, tamanho);
        seq1.mutacao(sequencia1, sequencia2, tamanho);

        in.close();
    }
}
