import java.util.Scanner;

public class contaTerminal{
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Por favor, digite o número da Conta: ");
        int conta = scanner.nextInt();
        
        System.out.print("Por favor, digite a da Agência: ");
        String agencia = scanner.nextLine();
        
        System.out.print("Por favor, digite o nome do cliente: ");
        String nome = scanner.nextLine().toUpperCase();
        
        System.out.print("Por favor, digite o valor do Saldo da conta: ");
        float saldo = scanner.nextFloat();
        
		System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
	}
}