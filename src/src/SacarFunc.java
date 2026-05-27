import java.util.Scanner;

public class SacarFunc {
    static double ultimosaque;

        public static void sacarSaldo(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seu Saldo é de " + "R$" + Banco.saldoFinal);


            System.out.println("Digite o valor do saque");
            double saque = scanner.nextDouble();
                if (saque < (Banco.saldoFinal + 1)){
                    System.out.println("SUCESSO seu novo saldo é de " + "R$" +  (Banco.saldoFinal - saque));
                }
                else {
                    System.err.println("O SEU SAQUE DEVE SER MENOR QUE SEU SALDO");
        }
    ultimosaque = saque;
    Banco.saldoFinal = Banco.saldoFinal - saque;
    }
}
