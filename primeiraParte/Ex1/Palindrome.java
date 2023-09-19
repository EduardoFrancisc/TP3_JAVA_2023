package primeiraParte.Ex1;
public class Palindrome {
    public String verificaPalavra(String entrada){

        String invertida = new StringBuffer(entrada).reverse().toString();
        return invertida;
    }
}