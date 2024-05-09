
public class ContaTerminal {
    public static void main(String[] args) {
        // Simulação de dados pré-preenchidos para teste
        String agencia = "067-8";
        int numero = 1021;
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        // Exibir mensagem com os dados da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
