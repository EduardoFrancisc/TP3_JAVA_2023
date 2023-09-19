public class Numero {
    public String leitorNumeros(int entrada){

        String str = Integer.toString(entrada);
        String[] colection = str.split("");
        
        for(int i = 0; i < str.length(); i++){           

            if (colection[i].equals("0")) {
                colection[i] = "zero";
            }
            if (colection[i].equals("1")) {
                colection[i] = "um";
            }
            if (colection[i].equals("2")) {
                colection[i] = "dois";
            }
            if (colection[i].equals("3")) {
                colection[i] = "três";
            }
            if (colection[i].equals("4")) {
                colection[i] = "quatro";
            }
            if (colection[i].equals("5")) {
                colection[i] = "cinco";
            }
            if (colection[i].equals("6")) {
                colection[i] = "seis";
            }
            if (colection[i].equals("7")) {
                colection[i] = "sete";
            }
            if (colection[i].equals("8")) {
                colection[i] = "oito";
            }
            if (colection[i].equals("9")) {
                colection[i] = "nove";
            } 
        }
        return String.join(", ", colection);
    }
}
