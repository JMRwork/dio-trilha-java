import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void imprimirClientes() {
		System.out.println(String.format("=== Clientes %s ===", this.nome));
		List<Cliente> cl = new ArrayList<Cliente>();
		this.contas.forEach(conta -> {if(!cl.contains(conta.getCliente())) {cl.add(conta.getCliente());}});
		cl.forEach(cliente -> System.out.println(cliente.getNome()));
	}
}
