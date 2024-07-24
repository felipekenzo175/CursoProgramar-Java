package Singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Singleton {
	private static Singleton instancia;
	private Connection con;
	private String url = "jdbc:ucanaccess://C:\\Curso Programar\\preferencias1.accdb";
	
	private Singleton() {
		
	}
	
	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
	
	public Connection getConexao() {
		try {
			if (con == null || con.isClosed()) {
				con = DriverManager.getConnection(url);
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados" + ex.getMessage().toString());
		}
		return con;
	}
	
	public void closeConexao() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
				JOptionPane.showMessageDialog(null, "Erro ao fechar conexão com o banco de dados" + ex.getMessage().toString());
			}
		}
	}
}
