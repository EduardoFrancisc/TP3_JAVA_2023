public class ClienteVIP extends Cliente {
    @Override
    public double depositar(double entrada) {

        if (entrada < 0) {
            System.out.println();
        } else {
            setSaldo(entrada);
        }
        return getSaldo();
    }

    @Override
    public double sacar(double entrada) {

        if (entrada > getSaldo() || entrada < 0) {
            System.out.println("Valor indisponível");
        } else {
            // Novo Saldo (após o saque)
            setSaldo(getSaldo() - entrada);

            double resto = entrada % 50;
            double numeroDeNotasCinquenta = (entrada - resto) / 50;

            double restoDeDez = resto % 10;
            double numeroDeNotasDez = (resto - restoDeDez) / 10;

            double restoDeCinco = restoDeDez % 5;
            double numeroDeNotasCinco = (restoDeDez - restoDeCinco) / 5;

            double restoDeUm = restoDeCinco % 1;
            double numeroDeNotasUm = (restoDeCinco - restoDeUm) / 1;

            System.out.println("Notas entregues: " + numeroDeNotasCinquenta + " de B$50, " + numeroDeNotasDez
                    + " de B$10, " + numeroDeNotasCinco + " de B$5 e " + numeroDeNotasUm + " de B$1.");
        }
        return 0;
    }

    public double saqueExclusivo(double entrada) {

        if (entrada > getSaldo() || entrada < 0) {
            System.out.println("Valor indisponível");
        } else {
            // Novo Saldo (após o saque)
            setSaldo(getSaldo() - entrada);

            double resto = entrada % 5;
            double numeroDeNotasCinco = (entrada - resto) / 5;

            double restoDeUm = resto % 1;
            double numeroDeNotasUm = (resto - restoDeUm) / 1;

            System.out.println("Notas entregues: " + 0 + " de B$50, " + 0
                    + " de B$10, " + numeroDeNotasCinco + " de B$5 e " + numeroDeNotasUm + " de B$1.");
        }
        return 0;
    }
}
