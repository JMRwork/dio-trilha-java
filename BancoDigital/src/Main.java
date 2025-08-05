import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.setNome("José");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		
		Conta cc1 = new ContaCorrente(cliente1);
		Conta poupanca1 = new ContaPoupanca(cliente1);
		Conta cc2 = new ContaCorrente(cliente2);

		List<Conta> cl = new ArrayList<Conta>();
		cl.add(cc1);
		cl.add(poupanca1);
		cl.add(cc2);
				
		cc1.depositar(100);
		cc1.transferir(100, poupanca1);
		cc2.depositar(50);
		
		cc1.imprimirExtrato();
		poupanca1.imprimirExtrato();
		cc2.imprimirExtrato();
		
		Banco banco1 = new Banco();
		banco1.setNome("Banco SP");
		banco1.setContas(cl);
		
		banco1.imprimirClientes();
	}

}
