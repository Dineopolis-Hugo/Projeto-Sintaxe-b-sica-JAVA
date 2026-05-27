import java.util.InputMismatchException;
import java.util.Scanner;

public class Banco {
    static boolean rodandomenu = true;
    static double saldoFinal = 0;
    // Assim a variável consegue ser acessada por outras classes
    public static void main(String[] args) {

        //TO DO: comentar o código

        Scanner scanner = new Scanner(System.in);

        String resposta  = "";

       try{
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
                    } else if (resposta.equalsIgnoreCase("n")) {
                        rodandomenu = false;
                        break;
                    }
                    else {
                        System.err.println("DIGITE APENAS [s/n]");
                        break;
                    }

                case 2:
                    DepositoFunc.depositarSaldo();

                    System.out.println("Deseja voltar ao menu?[s/n]");
                    resposta = scanner.next();

                    if (resposta.equalsIgnoreCase("s")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("n")) {
                        rodandomenu = false;
                        break;
                    }
                    else {
                        System.err.println("DIGITE APENAS [s/n]");
                        break;
                    }

                case 3:
                    SacarFunc.sacarSaldo();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    resposta = scanner.next();

                    if (resposta.equalsIgnoreCase("s")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("n")) {
                        rodandomenu = false;
                        break;
                    }
                    else {
                        System.err.println("DIGITE APENAS [s/n]");
                        break;
                    }

                case 4:
                    TransferenciaFunc.transferenciaBancaria();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    resposta = scanner.next();

                    if (resposta.equalsIgnoreCase("s")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("n")) {
                        rodandomenu = false;
                        break;
                    }
                    else {
                        System.err.println("DIGITE APENAS [s/n]");
                        break;
                    }

                case 5:
                    ExtratoFunc.extratoBancario();
                    System.out.println("Deseja voltar ao menu?[s/n]");
                    resposta = scanner.next();

                    if (resposta.equalsIgnoreCase("s")) {
                        break;
                    } else if (resposta.equalsIgnoreCase("n")) {
                        rodandomenu = false;
                        break;
                    }
                    else {
                        System.out.println("DIGITE APENAS [s/n]");
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

        }catch(InputMismatchException e){
           System.err.println("DIGITE APENAS NÚMEROS (INTEIROS) NESSA PARTE");
       }

        }
    }
