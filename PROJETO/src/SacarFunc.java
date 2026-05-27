import java.util.Scanner;

public class SacarFunc {
    static double ultimosaque;

    public static void sacarSaldo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seu Saldo é de " + "R$" + Banco.saldoFinal);


        System.out.println("Digite o valor do saque");
        double saque = scanner.nextDouble();
        if (saque < (Banco.saldoFinal + 1) && saque > -1) {
            System.out.println("SUCESSO seu novo saldo é de " + "R$" + (Banco.saldoFinal - saque));
        } else if (saque < 0) {
            System.err.println("O SAQUE NÃO PODE SER MENOR QUE ZERO");

        } else if (Banco.saldoFinal <= 0) {
            System.err.println("VOCÊ NÃO TEM SALDO PARA SACAR");
        } else {
            System.err.println("O SEU SAQUE DEVE SER MENOR QUE SEU SALDO");
        }
        ultimosaque = saque;
        if (saque < Banco.saldoFinal && Banco.saldoFinal > 0 && saque > -1) {
            Banco.saldoFinal = Banco.saldoFinal - saque;
        }
    }
}
