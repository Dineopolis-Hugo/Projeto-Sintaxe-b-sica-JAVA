import java.util.Scanner;

public class DepositoFunc {
    static double ultimodeposito;


    public static void depositarSaldo(){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Digite o valor do deposito: ");
        double deposito = scanner.nextDouble();
        System.out.println("SUCESSO! Seu novo saldo é: " + "R$" + (deposito + Banco.saldoFinal));

                ultimodeposito = deposito;
                Banco.saldoFinal = Banco.saldoFinal + deposito;


    }
}
