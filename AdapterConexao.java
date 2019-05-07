package br.com.adapter.ney;

public class AdapterConexao implements ConexaoSQL {
	ConexaoAurora aurora = new ConexaoAurora();

	public void criarConexao() {
		aurora.criarConexao();

	}

	public void inserir(String nome, String cpf) {
		aurora.inserir(nome, cpf);

	}

	public ConexaoAurora getAurora() {
		return aurora;
	}

	public void setAurora(ConexaoAurora aurora) {
		this.aurora = aurora;
	}

}
