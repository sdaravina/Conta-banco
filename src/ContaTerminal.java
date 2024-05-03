import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nomeCliente = leitura.next();

        System.out.println("Digite o número da agência:");
        String agenciaConta = leitura.next();

        System.out.println("Digite o número da conta: ");
        int numeroConta = leitura.nextInt(); 

        System.out.println("Digite o saldo inicial:");
        Float saldo = leitura.nextFloat();

        System.out.println("Olá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +
                ", conta "+ numeroConta +
                " e seu saldo "+ saldo +" já está disponível para saque");

        leitura.close();

    }
}