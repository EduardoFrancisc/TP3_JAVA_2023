package primeiraParte.Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String entrada = in.nextLine();
        Vogais contv = new Vogais();
        Numeros contn = new Numeros();

        Palindrome teste = new Palindrome();
        String palindrome = "";

        if (teste.verificaPalavra(entrada).equals(entrada)) {
            palindrome = "sim";
        } else {
            palindrome = "não";
        }

        System.out.println("---------------------------------------");
        System.out.println("Numero de Caracteres da string: " + entrada.length());
        System.out.println("Em formato Maiúsculo: " + entrada.toUpperCase());
        System.out.println("Numero de Vogais: " + contv.contador(entrada));
        System.out.println("Começo da String: " + entrada.substring(0, 3));
        System.out.println("Fim da String: " + entrada.substring(entrada.length() - 3));
        System.out.println("Quantidade de numeros: " + contn.contadorNumeros(entrada));
        System.out.println("Os dois primeiros digitos da String: " + entrada.substring(0, 2));
        System.out.println("A palavra " + entrada + " é Palindrome: " + palindrome);
        System.out.println("---------------------------------------");

        in.close();
    }
}