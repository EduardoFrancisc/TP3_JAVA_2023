public class AlgoritmosGeneticos {
    public String[] recombinacao(String s1, String s2, int tamanho){
        tamanho = tamanho / 2;

        
        int indiceAleatorio = (int)(Math.random() * tamanho);

        String filho1 = (s1.substring(0, indiceAleatorio));
        String filho2 = (s1.substring(indiceAleatorio, tamanho));

        String filho3 = (s2.substring(0, indiceAleatorio));
        String filho4 = (s2.substring(indiceAleatorio, tamanho));

        String sequenciaRecombinada1 = filho1 + filho4;
        String sequenciaRecombinada2 = filho3 + filho2;

        String [] recombinados = {sequenciaRecombinada1,sequenciaRecombinada2};
        System.out.println("Fator de Corte da Combinacao: " + indiceAleatorio);
        System.out.println("Resultado da Combinação:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(sequenciaRecombinada1);
        System.out.println(sequenciaRecombinada2);
        System.out.println("================================");
        System.out.println();

        return recombinados;
    }

    public void mutacao(String s1, String s2, int tamanho){
        tamanho = tamanho / 2;

        int indiceAleatorioMutacao = (int)(Math.random() * tamanho);
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        char controle = arr1[indiceAleatorioMutacao];
        arr1[indiceAleatorioMutacao] = arr2[indiceAleatorioMutacao];
        arr2[indiceAleatorioMutacao] = controle;

        System.out.println("Resultado da Mutacao:");
        System.out.println("Indice aleatorio da Mutacao: " + (indiceAleatorioMutacao));
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println("================================");
    }
}
