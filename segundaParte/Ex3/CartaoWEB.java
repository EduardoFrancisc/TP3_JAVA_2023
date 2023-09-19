import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CartaoWEB {
   private String _nome;
   private String _email;
   private static final String EMAIL_REGEX = "^[^.@][A-Za-z0-9+_.-]+[^.@]@[A-Za-z0-9.-]+.[A-Za-z]+$";

   public CartaoWEB() {
   }

   public String get_nome() {
      return this._nome;
   }

   public String get_email() {
      return this._email;
   }

   public void CartãoWEB(String nome, String email) {
      this._nome = nome;
      this._email = email;
      Pattern pattern = Pattern.compile(EMAIL_REGEX);
      Matcher matcher = pattern.matcher(email);
      if (!matcher.matches()) {
         this._email = "email inválido";
      } else {
         this._email = email;
      }

   }
}