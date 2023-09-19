public class DiaDosNamorados extends CartaoWEB implements IMensagem {
   public DiaDosNamorados() {
   }

   public String showMessagem(CartaoWEB p1) {
      String var10000 = p1.get_email();
      return "mensagem para: " + var10000 + "\n Parab\u00e9ns, " + p1.get_nome() + " pelo Dia dos Namroados.\n==========================================";
   }
}
