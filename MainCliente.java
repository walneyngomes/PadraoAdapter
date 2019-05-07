package br.com.adapter.ney;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("81234784123");
		cliente.setNome("Walney Negreiros");
		cliente.criaConexao();

	}

}
