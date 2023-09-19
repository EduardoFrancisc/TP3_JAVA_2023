public class Pascoa extends CartaoWEB implements IMensagem {
   public Pascoa() {
   }

   public String showMessagem(CartaoWEB p1) {
      String var10000 = p1.get_email();
      return "mensagem para: " + var10000 + "\n Parab\u00e9ns, " + p1.get_nome() + " pela P\u00e1scoa.\n==========================================";
   }
}