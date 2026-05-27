import java.util.Scanner;

public class TransferenciaFunc {
    static double ultimatransferencia;
    static String ultimapessoa;
        public static void transferenciaBancaria(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o valor da transferência");
            double transferencia =  scanner.nextDouble();

            if(transferencia > Banco.saldoFinal){
                System.err.println("O VALOR DA TRANSFERÊNCIA NÃO PODE SER MAIOR QUE O SALDO");}

            System.out.println("Digite o nome da conta para transferencia");
            String nomeConta = scanner.next();
            System.out.println("SUCESSO! Você transferiu " + "R$"+ transferencia + " para " + nomeConta);
            System.out.println("Seu saldo final é de " + "R$" + ( Banco.saldoFinal - transferencia));

        ultimatransferencia = transferencia;
        ultimapessoa = nomeConta;
        Banco.saldoFinal =  Banco.saldoFinal - transferencia;
    }
}
