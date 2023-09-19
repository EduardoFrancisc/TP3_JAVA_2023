public class CadeiaDeDna {
    public String[] geradorDeDna(int tamanho){

        String letrasPermitidas = "ACGT";
        StringBuilder sequenciaJunta = new StringBuilder(tamanho);

        for(int i = 0; i<tamanho; i++){
            int indiceAleatorio = (int)(Math.random() * 4);
            char caractereAleatorio = letrasPermitidas.charAt(indiceAleatorio);
            sequenciaJunta.append(caractereAleatorio);
        }
 
        String dnaSomado = sequenciaJunta.toString();
        String dna1 = dnaSomado.substring(0, tamanho/2);
        String dna2 = dnaSomado.substring(tamanho/2, tamanho);
        String[] arrDna = {dna1,dna2};
        
        return arrDna;
    }
}
