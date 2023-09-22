public class DiaDosNamorados extends CartaoWEB implements IMensagem {
   @Override
   public String showMessagem(CartaoWEB p1) {
      String email = p1.get_email();
      String nome = p1.get_nome();
      return "mensagem para: " + email + "\n Parabéns, " + nome + " pelo Dia dos Namorados.\n==========================================";
   }
}
