import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int entrada = in.nextInt();

        Numero tester = new Numero();
        System.out.println("Número por Extenso: " + tester.leitorNumeros(entrada));
        in.close();
    }
}
