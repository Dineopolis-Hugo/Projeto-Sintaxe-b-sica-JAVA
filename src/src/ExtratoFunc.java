public class ExtratoFunc {

    // O conceito do extrato é:
    // Você guardar informações das operações que aconteceram para poder mostrar depois.
    // Como você está começando, o jeito mais simples é criar variáveis para armazenar:
    // °último depósito
    // °último saque
    // °última transferência

    // GUARDAR VAR
    // IMPLANTÁ-LAS NO MÉTODO
    // FAZER A FUNC

    static void extratoBancario(){
        System.out.println("Seu ultimo depósito foi de " + "R$" + DepositoFunc.ultimodeposito);
        System.out.println("Seu ultimo saque foi de " + "R$" + SacarFunc.ultimosaque );
        System.out.println("Sua ultima transferencia foi de " + "R$" + TransferenciaFunc.ultimatransferencia);
        System.out.println("Transferido para a conta de: " + TransferenciaFunc.ultimapessoa);
    }

}
