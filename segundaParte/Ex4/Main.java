import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double deposito, saque;
        int decisao, numero, zipCode;
        String nome, seguroSocial, logradouro, bairro, cidade;
        List<String> email = new ArrayList<>();

        System.out.println("Qual tipo de Cliente:");
        System.out.println("1 - Standart");
        System.out.println("2 - VIP");
        decisao = in.nextInt();

        if (decisao == 1) {
            int decisaoStandart;

            ClienteStandart cs = new ClienteStandart();
            System.out.println("Qual seu nome?");
            nome = in.next();
            cs.setNome(nome);

            System.out.println("Qual sua cidade?");
            cidade = in.next();
            cs.setCidade(cidade);

            System.out.println("Qual seu bairro?");
            bairro = in.next();
            cs.setBairro(bairro);

            System.out.println("Qual seu logradouro?");
            logradouro = in.next();
            cs.setLogradouro(logradouro);

            System.out.println("Qual seu código postal?");
            zipCode = in.nextInt();
            cs.setZipCode(zipCode);

            System.out.println("Qual seu Numero da conta");
            numero = in.nextInt();

            System.out.println("Qual seu email?");
            email.add(in.next());

            System.out.println("Qual o nome do Seguro Social?");
            seguroSocial = in.next();
            cs.setSeguroSocial(seguroSocial);

            while (true) {
                System.out.println("1 - Depositar Bits");
                System.out.println("2 - Sacar Bits");
                System.out.println("3 - Sair");
                decisaoStandart = in.nextInt();

                if (decisaoStandart == 1) {
                    System.out.println("Quantos Bits deseja Depositar?");
                    System.out.println("Saldo Atual: " + cs.getSaldo());
                    deposito = in.nextDouble();
                    cs.depositar(deposito);
                }
                if (decisaoStandart == 2) {
                    System.out.println("Quantos Bits deseja Sacar?");
                    System.out.println("Saldo Atual: " + cs.getSaldo());
                    saque = in.nextDouble();
                    cs.sacar(saque);
                }
                if (decisaoStandart == 3) {
                    System.out.println("Programa Encerrado.");
                    break;
                }
            }

        }

        if (decisao == 2) {
            int decisaoVip = 0;
            ClienteVIP cv = new ClienteVIP();

            System.out.println("Qual seu nome?");
            nome = in.next();
            cv.setNome(nome);

            System.out.println("Qual sua cidade?");
            cidade = in.nextLine();
            cv.setCidade(cidade);

            System.out.println("Qual seu bairro?");
            bairro = in.next();
            cv.setBairro(bairro);

            System.out.println("Qual seu logradouro?");
            logradouro = in.next();
            cv.setLogradouro(logradouro);

            System.out.println("Qual seu código postal?");
            zipCode = in.nextInt();
            cv.setZipCode(zipCode);

            System.out.println("Qual seu Numero da conta");
            numero = in.nextInt();
            cv.setNumero(numero);

            System.out.println("Qual seu email?");
            email.add(in.next());
            cv.setEmail(email);

            System.out.println("Qual o nome do Seguro Social?");
            seguroSocial = in.next();
            cv.setSeguroSocial(seguroSocial);

            while (true) {
                System.out.println("1 - Depositar Bits");
                System.out.println("2 - Sacar Bits");
                System.out.println("3 - Sair");
                decisaoVip = in.nextInt();

                if (decisaoVip == 1) {
                    System.out.println("Quantos Bits deseja Depositar?");
                    System.out.println("Saldo Atual: " + cv.getSaldo());
                    deposito = in.nextDouble();
                    cv.depositar(deposito);
                }
                if (decisaoVip == 2) {
                    System.out.println("Quantos Bits deseja Sacar?");
                    System.out.println("Saldo Atual: " + cv.getSaldo());
                    saque = in.nextDouble();
                    System.out.println("Sacar somente com notas de 7 e 5?");
                    System.out.println(" 1 - sim \n 2 - não");
                    int decisaoSaque = in.nextInt();

                    if (decisaoSaque == 1) {
                        cv.saqueExclusivo(saque);
                    }
                    if (decisaoSaque == 2) {
                        cv.sacar(saque);
                    }
                }
                if (decisaoVip == 3) {
                    System.out.println("Programa Encerrado.");
                    break;
                }
            }
        }
        in.close();
    }
}