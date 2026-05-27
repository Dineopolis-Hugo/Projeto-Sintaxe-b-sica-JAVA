import java.util.Scanner;

public class TransferenciaFunc {
    static double ultimatransferencia;
    static String ultimapessoa;
        public static void transferenciaBancaria(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor da transferência");
            double transferencia =  scanner.nextDouble();

            if(transferencia > Banco.saldoFinal){
                System.err.println("O VALOR DA TRANSFERÊNCIA NÃO PODE SER MAIOR QUE O SALDO");

                System.exit(1);
            }
            else if (transferencia < 0){
                System.err.println("O VALOR TEM QUE SER MAIOR QUE ZERO,TENTE NOVAMENTE");

                System.exit(1);

            }
            scanner.nextLine();

            System.out.println("Digite o nome da conta para transferencia");
            String nomeConta = scanner.nextLine();

            if(nomeConta.matches(".*\\d.*")){
                //Você pode validar apenas nomes usando matches().
                //Conceito:
                //se tiver número → erro
                //se tiver só letras → aceita
                System.err.println("DIGITE APENAS NOMES,TENTE NOVAMENTE");
                System.exit(1);
            }

            System.out.println("SUCESSO! Você transferiu " + "R$"+ transferencia + " para " + nomeConta);
            System.out.println("Seu saldo final é de " + "R$" + ( Banco.saldoFinal - transferencia));

        ultimatransferencia = transferencia;
        ultimapessoa = nomeConta;
        Banco.saldoFinal =  Banco.saldoFinal - transferencia;
    }
}
