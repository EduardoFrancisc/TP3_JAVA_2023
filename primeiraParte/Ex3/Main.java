import java.text.Normalizer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome Completo:");
        String entrada = in.nextLine();

        entrada = Normalizer.normalize(entrada, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
        entrada = entrada.toUpperCase().replaceAll(" DAS | DOS | DU | E | DI | DE | DA | DO ", " ");
        String resultado = entrada.replaceAll("\\B\\w\\s*", "");

        System.out.println("Inicias do Nome: " + resultado);

        in.close();
    }
}
