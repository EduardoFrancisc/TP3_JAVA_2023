package primeiraParte.Ex1;
public class Numeros {
    public int contadorNumeros(String entrada){
        int contadorDeNumeros = 0;

        
        for (int i = 0; i < entrada.length(); i++) {
            char n = entrada.charAt(i);
            if (n == '0' || n == '1' || n == '2' || n == '3' || n == '4' || n == '5' || n == '6' || n == '7' || n == '8' || n == '9') {
                contadorDeNumeros++;
            }
        }

        return contadorDeNumeros;
    }
}
