package primeiraParte.Ex1;
public class Vogais {
    public int contador(String entrada){
        int contadorDeVogais = 0;

        entrada.toLowerCase();
        for (int i = 0; i < entrada.length(); i++) {
            char v = entrada.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                contadorDeVogais++;
            }
        }
        return contadorDeVogais;
    }
}
