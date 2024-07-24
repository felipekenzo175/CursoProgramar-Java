package Business;

import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import Singleton.Singleton;

public class Preferencias {
	Boolean resultado = false;
	
	public DefaultListModel<String> ImpTxtWhile() throws Exception {
		try {
			File file = new File("C:\\Curso Programar\\preferencias.txt");
			List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
			
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			int linhaArquivo = 0;
			int totalLinhas = arrayLinhasArquivo.size();
			
			modelo.clear();
			
			while (linhaArquivo < totalLinhas) {
				modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
				linhaArquivo++;
			}
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DefaultListModel<String> ImpTxtDoWhile() throws Exception {
		try {
			File file = new File("C:\\Curso Programar\\preferencias.txt");
			List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
			
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			int linhaArquivo = 0;
			int totalLinhas = arrayLinhasArquivo.size();
			
			modelo.clear();
			
			do {
				modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
				linhaArquivo++;
			}while (linhaArquivo < totalLinhas);
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DefaultListModel<String> ImpTxtFor() throws Exception {
		try {
			File file = new File("C:\\Curso Programar\\preferencias.txt");
			List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
			
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			modelo.clear();
			
			for (int linhaArquivo = 0; linhaArquivo < arrayLinhasArquivo.size(); linhaArquivo++ ) {
				modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
			}
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DefaultListModel<String> ImpTxtForIn() throws Exception {
		try {
			File file = new File("C:\\Curso Programar\\preferencias.txt");
			List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
			
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			modelo.clear();
			
			for (String linhaArquivo : arrayLinhasArquivo) {
				modelo.addElement(linhaArquivo);
			}
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DefaultListModel<String> ImpTxtForEach() throws Exception {
		try {
			File file = new File("C:\\Curso Programar\\preferencias.txt");
			List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
			
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			modelo.clear();
			
			arrayLinhasArquivo.forEach( linhaArquivo -> {
				modelo.addElement(linhaArquivo);
			});
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public DefaultListModel<String> BancoConectado() throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			String strSql = "SELECT Descricao FROM Preferencias_3";
			
			PreparedStatement psql = con.prepareStatement(strSql);
			
			ResultSet rsPreferencias = psql.executeQuery();
			
			while (rsPreferencias.next()) {
				modelo.addElement(rsPreferencias.getString("Descricao"));
			}
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (con != null) {
				try {
					Singleton.getInstancia().closeConexao();
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
	}
	
	public DefaultListModel<String> BancoDesconectado() throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			String strSql = "SELECT Descricao FROM Preferencias_3";
			
			PreparedStatement psql = con.prepareStatement(strSql);
			
			ResultSet rsPreferencias = psql.executeQuery();
			
			ArrayList<String> lista = new ArrayList<String>();
			
			while (rsPreferencias.next()) {
				lista.add(rsPreferencias.getString("Descricao"));
			}
			
			Singleton.getInstancia().closeConexao();
			
			lista.forEach(linhaArquivo -> {
				modelo.addElement(linhaArquivo);
			});
			
			return modelo;
		} catch (Exception ex) {
			throw ex;
		}
	}
	
	public ResultSet ConsultarBD() throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {			
			String strSql = "SELECT ID, Descricao FROM Preferencias_3";
			PreparedStatement psql = con.prepareStatement(strSql);
			ResultSet rsPreferencias = psql.executeQuery();
			
			return rsPreferencias;

		} catch (Exception ex) {
			throw ex;
		} finally {
			if (con != null) {
				try {
					Singleton.getInstancia().closeConexao();
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
	}
	
	public Boolean InserirBD(String strPreferenciaIncluida) throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {		
			String strSql = "INSERT INTO Preferencias_3 (Descricao) VALUES (?)";
			PreparedStatement psql = con.prepareStatement(strSql);
			psql.setString(1, strPreferenciaIncluida);
			
			if (psql.executeUpdate() > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
			
			return resultado;
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (con != null) {
				try {
					Singleton.getInstancia().closeConexao();
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
	}
	
	public Boolean ExcluirBD(int id) throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {
			String strSql = "DELETE FROM Preferencias_3 WHERE ID = ?";
			PreparedStatement psql = con.prepareStatement(strSql);
			psql.setInt(1, id);
			
			if (psql.executeUpdate() > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
			
			return resultado;
			
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (con != null) {
				try {
					Singleton.getInstancia().closeConexao();
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
	}
	
	public Boolean AlterarBD(String novaDescricao, int id) throws Exception {
		Connection con = Singleton.getInstancia().getConexao();
		try {
			String strSql = "UPDATE Preferencias_3 SET Descricao = ? WHERE ID = ?";
			PreparedStatement psql = con.prepareStatement(strSql);
			psql.setString(1, novaDescricao);
			psql.setInt(2, id);
			
			if (psql.executeUpdate() > 0) {
				resultado = true;
			} else {
				resultado = false;
			}
			
			return resultado;		
		} catch (Exception ex) {
			throw ex;
		} finally {
			if (con != null) {
				try {
					Singleton.getInstancia().closeConexao();
				} catch (Exception ex) {
					throw ex;
				}
			}
		}
	}

}
