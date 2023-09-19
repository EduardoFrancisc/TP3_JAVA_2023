import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

      List<IMensagem> cartoes = new LinkedList();
      Scanner in = new Scanner(System.in);

      String nome, email;

      System.out.println("Qual é o seu Nome?");
      nome = in.nextLine();
      System.out.println("Qual é o seu Email?");
      email = in.nextLine();
      System.out.println();


      CartaoWEB p1 = new CartaoWEB();
      p1.CartãoWEB(nome, email);

      Aniversario c1 = new Aniversario();
      DiaDosNamorados c2 = new DiaDosNamorados();
      Natal c3 = new Natal();
      Pascoa c4 = new Pascoa();
      Pascoa c5 = new Pascoa();

      cartoes.add(c1);
      cartoes.add(c2);
      cartoes.add(c3);
      cartoes.add(c4);
      cartoes.add(c5);

      c1.showMessagem(p1);
      c2.showMessagem(p1);
      c3.showMessagem(p1);
      c4.showMessagem(p1);
      c5.showMessagem(p1);

      for (IMensagem iMensagem : cartoes) {
         System.out.println(iMensagem.showMessagem(p1));
      }

      in.close();
   }
}