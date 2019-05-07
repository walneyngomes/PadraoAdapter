package br.com.adapter.ney;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoAurora {
	Connection conn;

	public void criarConexao() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} // WALNEY

		String url = "jdbc:postgresql://localhost:5432/ConexaoAurora"; // Nome da

		String user = "postgres"; // nome do usuário do MySQL
		String password = "post@123"; // senha do MySQL

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void inserir(String nome, String cpf) {
		PreparedStatement st = null;
		// try {// WALNEY
		// st = conn.prepareStatement("INSERT INTO Clientes"// WALNEY
		// + "(nome,cpf)" + "VALUES " + "(?,?)");
		// st.setString(1, nome);
		// st.setString(2, cpf);// WALNEY

		// st.executeQuery();

		// } catch (SQLException e) {
		System.out.println("Inserido" + "nome" + nome + "cpf" + cpf);

	}

}
