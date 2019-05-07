package br.com.adapter.ney;

public class Cliente {
	private String nome;
	private String cpf;

	ConexaoSQL conexao = new AdapterConexao();

	public void criaConexao() {
		conexao.criarConexao();
		inserirDados();
	}

	private void inserirDados() {
		conexao.inserir(getNome(), getCpf());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
