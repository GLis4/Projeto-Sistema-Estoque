package atividade.estoque.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectandoSQL {
	private Connection conn;
	private Statement stm;

	public ConectandoSQL(String arquivo) throws SQLException, ClassNotFoundException {
		Class.forName("org.sqlite.JDBC");
		this.conn = DriverManager.getConnection("jdbc:sqlite:" + arquivo);
		this.stm = this.conn.createStatement();
	}

	public void criarTabela() throws SQLException {
		this.stm.executeUpdate("CREATE TABLE  Insumo ("
				+ "nome varchar(70) PRIMARY KEY NOT NULL);");
	}

	public void adicionar(String nome) {		  
		try {		  
			this.stm = this.conn.createStatement();
			this.stm.executeUpdate("INSERT or IGNORE INTO Insumo  VALUES ('"+ nome + "')");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void deletarTudo() {
		
		try {
			this.stm.executeUpdate("DELETE FROM Insumo");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deletarUmValor(String nomeDeletar) {
		try {
			this.stm.executeUpdate("DELETE FROM Insumo WHERE nome = ('" + nomeDeletar +"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	public void mostrarTudo() {

		ResultSet rs;
		try {
			rs = this.stm.executeQuery("SELECT * FROM Insumo");

			while (rs.next()) {
				System.out.println(rs.getString("nome"));
			}
			rs.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean exist() throws SQLException  {

		DatabaseMetaData metadados = conn.getMetaData();
		ResultSet tabela = metadados.getTables(null, null, "insumo", null);

		return tabela.next();


	}
}
