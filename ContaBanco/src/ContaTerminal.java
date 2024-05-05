import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContaTerminal {
    public static void main(String[] args) {
        // Intânciar classe Scanner para pode ler os dados do usuário
        Scanner tec = new Scanner(System.in);

        // Obter dados do cliente no terminal
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = tec.next();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = tec.nextInt();
        tec.nextLine();

        System.out.println("Por favor, digite o Nome:");
        String nomeCliente = tec.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = 0;
        if (tec.hasNextDouble())
            saldo = tec.nextDouble();

        // fechar o Scanner
        tec.close();

        // Imprimir dados da conta no terminal
        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é " +
                           agencia+ ", conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque.");



    }
}