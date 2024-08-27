package Business_BLL;

import DAO_BLL.PreferenciasDAO;
import Model.PreferenciasVO;
import java.io.File;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.DefaultListModel;

public class Preferencias {	
	PreferenciasDAO objPreferenciasDAO;
	
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
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.BancoConectado();
		} catch (Exception ex) {
			throw ex;
		} 
	}
	
	public DefaultListModel<String> BancoDesconectado() throws Exception {
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.BancoDesconectado();
		} catch (Exception ex) {
			throw ex;
		} 
	}
	
	public ResultSet ConsultarBD() throws Exception {
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.ConsultarBD();
		} catch (Exception ex) {
			throw ex;
		} 
	}
	
	public Boolean InserirBD(PreferenciasVO preferencias) throws Exception {
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.InserirBD(preferencias);
		} catch (Exception ex) {
			throw ex;
		} 
	}
	
	public Boolean ExcluirBD(PreferenciasVO preferencias) throws Exception {
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.ExcluirBD(preferencias);
		} catch (Exception ex) {
			throw ex;
		} 
	}
	
	public Boolean AlterarBD(PreferenciasVO preferencias) throws Exception {
		try {
			objPreferenciasDAO = new PreferenciasDAO();
			return objPreferenciasDAO.AlterarBD(preferencias);
		} catch (Exception ex) {
			throw ex;
		} 
	}

}
