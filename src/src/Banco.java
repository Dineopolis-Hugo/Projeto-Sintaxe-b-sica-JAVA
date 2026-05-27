import java.util.Scanner;

public class Banco {

    static double saldoFinal = 0;
    // Assim a variável consegue ser acessada por outras classes
    public static void main(String[] args) {

        //TO DO: TRATAR EXCEÇÕES

        Scanner scanner = new Scanner(System.in);
        boolean rodandomenu = true;
        String resposta = "";

        while (rodandomenu == true) {
        System.out.println("1 VER SALDO");
        System.out.println("2 DEPOSITAR SALDO");
        System.out.println("3 SACAR SALDO ");
        System.out.println("4 TRANSFERIR");
        System.out.println("5 VER EXTRATO");
        System.out.println("6 ENCERRAR PROGRAMA");

        System.out.print("Escolha sua opção: ");
        int opção = scanner.nextInt();

        switch (opção) {

                case 1:
                VerSaldoFunc.verSaldo();

                    System.out.println("Deseja voltar ao menu?[s/n]");
                 resposta = scanner.next();
                if (resposta.equalsIgnoreCase("s")) {
                    break;
                }
                else {
                    rodandomenu = false;
                    break;
                }

            case 2:
                DepositoFunc.depositarSaldo();

                System.out.println("Deseja voltar ao menu?[s/n]");
                 resposta = scanner.next();

                if(resposta.equalsIgnoreCase("s")){
                   break;
                }
                else {
                    rodandomenu = false;
                    break;
                }

            case 3:
                SacarFunc.sacarSaldo();
                System.out.println("Deseja voltar ao menu?[s/n]");
                resposta = scanner.next();

                if (resposta.equalsIgnoreCase("s")) {
                    break;
                }
                else {
                    rodandomenu = false;
                    break;
                }

            case 4:
                TransferenciaFunc.transferenciaBancaria();
                System.out.println("Deseja voltar ao menu?[s/n]");
                resposta = scanner.next();

                if (resposta.equalsIgnoreCase("s")) {
                    break;
                }
                else {
                    rodandomenu = false;
                    break;
                }

            case 5:
                ExtratoFunc.extratoBancario();
                System.out.println("Deseja voltar ao menu?[s/n]");
                resposta = scanner.next();

                if (resposta.equalsIgnoreCase("s")) {
                    break;
                }
                else {
                    rodandomenu = false;
                    break;
                }

            case 6:
                rodandomenu = false;
                System.err.println("PROGRAMA ENCERRADO");
                    break;

            default:
                System.err.println("OPÇÃO INVÁLIDA");
                    break;
        }



        }
    }
}