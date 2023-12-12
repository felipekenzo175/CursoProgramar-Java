import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class ExercicioArqProfFrontEndJava_03_05122023<Array> extends JFrame implements ActionListener{
	
	JLabel lblMensagem, lblDesvioCondicional, lblDesvioCondicionalEncadeado, lblSwitchCase, lblImpTxtWhile,
	lblImpTxtDoWhile, lblImpTxtFor, lblImpTxtForIn, lblImpTxtForEach, lblLimpaTexto, lblPreferencias, lblImpBDConectado, lblImpBDDesconectado;
	
	JButton btnMensagem, btnDesvioCondicional, btnDesvioCondicionalEncadeado, btnSwitchCase, btnImpTxtWhile,
	btnImpTxtDoWhile, btnImpTxtFor, btnImpTxtForIn, btnImpTxtForEach, btnLimpaTexto, btnImpBDConectado, btnImpBDDesconectado;
	
	JList<String> lstbxPreferencias;
	
	public ExercicioArqProfFrontEndJava_03_05122023() {
		setSize(500,720);
		setTitle("Exercicio Arquitetura Profissional Front End Java 03 05/12/2023");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		init();
		setVisible(true);
	}
	
	public void init() {
		LayoutManager layout = new FlowLayout();
		
		lblMensagem = new JLabel("MENSAGEM");
		lblMensagem.setSize(200,10);
		lblMensagem.setLocation(20, 10);
		add(lblMensagem);
		
		btnMensagem = new JButton("mensagem");
		btnMensagem.setSize(lblMensagem.getWidth(), lblMensagem.getHeight()+30);
		btnMensagem.setLocation(lblMensagem.getX(), lblMensagem.getY()+10);
		add(btnMensagem);
		
		lblDesvioCondicional = new JLabel("DESVIO CONDICIONAL");
		lblDesvioCondicional.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblDesvioCondicional.setLocation(lblMensagem.getX(), btnMensagem.getY()+45);
		add(lblDesvioCondicional);
		
		btnDesvioCondicional = new JButton("desvio condicional");
		btnDesvioCondicional.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnDesvioCondicional.setLocation(lblMensagem.getX(), lblDesvioCondicional.getY()+10);
		add(btnDesvioCondicional);
		
		lblDesvioCondicionalEncadeado = new JLabel("DESVIO CONDICIONAL ENCADEADO");
		lblDesvioCondicionalEncadeado.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblDesvioCondicionalEncadeado.setLocation(lblMensagem.getX(), btnDesvioCondicional.getY()+45);
		add(lblDesvioCondicionalEncadeado);
		
		btnDesvioCondicionalEncadeado = new JButton("desvio condicional encadeado");
		btnDesvioCondicionalEncadeado.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnDesvioCondicionalEncadeado.setLocation(lblMensagem.getX(), lblDesvioCondicionalEncadeado.getY()+10);
		add(btnDesvioCondicionalEncadeado);
		
		lblSwitchCase = new JLabel("SWITCH CASE");
		lblSwitchCase.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblSwitchCase.setLocation(lblMensagem.getX(), btnDesvioCondicionalEncadeado.getY()+45);
		add(lblSwitchCase);
		
		btnSwitchCase = new JButton("switch case");
		btnSwitchCase.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnSwitchCase.setLocation(lblMensagem.getX(), lblSwitchCase.getY()+10);
		add(btnSwitchCase);
		
		lblImpTxtWhile = new JLabel("IMPORTAR TEXTO WHILE");
		lblImpTxtWhile.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtWhile.setLocation(lblMensagem.getX(), btnSwitchCase.getY()+45);
		add(lblImpTxtWhile);
		
		btnImpTxtWhile = new JButton("importar texto while");
		btnImpTxtWhile.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpTxtWhile.setLocation(lblMensagem.getX(), lblImpTxtWhile.getY()+10);
		add(btnImpTxtWhile);
		
		lblImpTxtDoWhile = new JLabel("IMPORTAR TEXTO DO WHILE");
		lblImpTxtDoWhile.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtDoWhile.setLocation(lblMensagem.getX(), btnImpTxtWhile.getY()+45);
		add(lblImpTxtDoWhile);
		
		btnImpTxtDoWhile = new JButton("importar texto do while");
		btnImpTxtDoWhile.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpTxtDoWhile.setLocation(lblMensagem.getX(), lblImpTxtDoWhile.getY()+10);
		add(btnImpTxtDoWhile);
		
		lblImpTxtFor = new JLabel("IMPORTAR TEXTO FOR");
		lblImpTxtFor.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtFor.setLocation(lblMensagem.getX(), btnImpTxtDoWhile.getY()+45);
		add(lblImpTxtFor);
		
		btnImpTxtFor = new JButton("importar texto for");
		btnImpTxtFor.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpTxtFor.setLocation(lblMensagem.getX(), lblImpTxtFor.getY()+10);
		add(btnImpTxtFor);
		
		lblImpTxtForIn = new JLabel("IMPORTAR TEXTO FOR IN");
		lblImpTxtForIn.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtForIn.setLocation(lblMensagem.getX(), btnImpTxtFor.getY()+45);
		add(lblImpTxtForIn);
		
		btnImpTxtForIn = new JButton("importar texto for in");
		btnImpTxtForIn.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpTxtForIn.setLocation(lblMensagem.getX(), lblImpTxtForIn.getY()+10);
		add(btnImpTxtForIn);
		
		lblImpTxtForEach = new JLabel("IMPORTAR TEXTO FOR EACH");
		lblImpTxtForEach.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtForEach.setLocation(lblMensagem.getX(), btnImpTxtForIn.getY()+45);
		add(lblImpTxtForEach);
		
		btnImpTxtForEach = new JButton("importar texto for each");
		btnImpTxtForEach.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpTxtForEach.setLocation(lblMensagem.getX(), lblImpTxtForEach.getY()+10);
		add(btnImpTxtForEach);
		
		lblLimpaTexto = new JLabel("LIMPA TEXTO");
		lblLimpaTexto.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblLimpaTexto.setLocation(lblMensagem.getX(), btnImpTxtForEach.getY()+45);
		add(lblLimpaTexto);
		
		btnLimpaTexto = new JButton("limpa texto");
		btnLimpaTexto.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnLimpaTexto.setLocation(lblMensagem.getX(), lblLimpaTexto.getY()+10);
		add(btnLimpaTexto);
		
		lblImpBDConectado = new JLabel("IMPORTA BANCO CONECTADO");
		lblImpBDConectado.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpBDConectado.setLocation(lblMensagem.getX(), btnLimpaTexto.getY()+45);
		add(lblImpBDConectado);
		
		btnImpBDConectado = new JButton("importa banco conectado");
		btnImpBDConectado.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpBDConectado.setLocation(lblMensagem.getX(),lblImpBDConectado.getY()+10);
		add(btnImpBDConectado);
		
		lblImpBDDesconectado = new JLabel("IMPORTA BANCO DESCONECTADO");
		lblImpBDDesconectado.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpBDDesconectado.setLocation(lblMensagem.getX(), btnImpBDConectado.getY()+45);
		add(lblImpBDDesconectado);
		
		btnImpBDDesconectado = new JButton("importa banco desconectado");
		btnImpBDDesconectado.setSize(lblMensagem.getWidth(), btnMensagem.getHeight());
		btnImpBDDesconectado.setLocation(lblMensagem.getX(),lblImpBDDesconectado.getY()+10);
		add(btnImpBDDesconectado);
		
		lblPreferencias = new JLabel("LISTAGEM DAS PREFERÊNCIAS");
		lblPreferencias.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblPreferencias.setLocation(lblMensagem.getX()+220, lblMensagem.getY());
		add(lblPreferencias);
		
		lstbxPreferencias = new JList<String>();
		lstbxPreferencias.setBounds(lblMensagem.getX()+220, lblMensagem.getY()+15, btnMensagem.getWidth()+20, btnMensagem.getHeight()+600);
		add(lstbxPreferencias);
		
		btnMensagem.addActionListener(this);
		btnDesvioCondicional.addActionListener(this);
		btnDesvioCondicionalEncadeado.addActionListener(this);
		btnSwitchCase.addActionListener(this);
		btnImpTxtWhile.addActionListener(this);
		btnImpTxtDoWhile.addActionListener(this);
		btnImpTxtFor.addActionListener(this);
		btnImpTxtForIn.addActionListener(this);
		btnImpTxtForEach.addActionListener(this);
		btnLimpaTexto.addActionListener(this);
		btnImpBDConectado.addActionListener(this);
		btnImpBDDesconectado.addActionListener(this);
	}
	
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btnMensagem)) {
			JOptionPane.showMessageDialog(this, "Olá, Mundo!");
		} else if(arg0.getSource().equals(btnDesvioCondicional)) {
			if(JOptionPane.showConfirmDialog(this, "desvio condicional", "Escolha Ok ou Cancelar", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
				JOptionPane.showMessageDialog(this, "Você escolheu Ok");
			} else {
				JOptionPane.showMessageDialog(this, "Você escolheu Cancelar");
			}
		} else if(arg0.getSource().equals(btnDesvioCondicionalEncadeado)) {
			int resposta = JOptionPane.showConfirmDialog(this, "desvio condicional encadedado", "Escolha Sim, Não ou Cancelar", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(resposta == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this, "Você escolheu Sim");
			} else if(resposta == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(this, "Você escolheu Não");
			} else {
				JOptionPane.showMessageDialog(this, "Você escolheu Cancelar");
			}
		} else if(arg0.getSource().equals(btnSwitchCase)) {
			switch(JOptionPane.showConfirmDialog(this, "desvio condicional encadedado", "Escolha Sim, Não ou Cancelar", JOptionPane.YES_NO_CANCEL_OPTION)) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Sim");
				break;
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Não");
				break;
			case JOptionPane.CANCEL_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Cancelar");
				break;
			default:
				JOptionPane.showMessageDialog(this, "Você escolheu Errado, Escolha Sim, Não ou Cancelar");
				break;
			}
		} else if(arg0.getSource().equals(btnImpTxtWhile)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				int linhaArquivo = 0;
				int totalLinhas = arrayLinhasArquivo.size();
				
				modelo.clear();
				
				while(linhaArquivo < totalLinhas) {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
					linhaArquivo ++;
				}
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnImpTxtDoWhile)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				int linhaArquivo = 0;
				int totalLinhas = arrayLinhasArquivo.size();
				
				modelo.clear();
				
				do {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
					linhaArquivo ++;
				}while(linhaArquivo < totalLinhas);
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnImpTxtFor)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				for(int linhaArquivo = 0; linhaArquivo < arrayLinhasArquivo.size(); linhaArquivo ++) {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
				}
				
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnImpTxtForIn)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				for(String linhaArquivo : arrayLinhasArquivo) {
					modelo.addElement(linhaArquivo);
				}
				
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnImpTxtForEach)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				arrayLinhasArquivo.forEach(linhaArquivo -> {
					modelo.addElement(linhaArquivo);
				});
				
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnLimpaTexto)) {
			try {
				File file = new File("C:/CURSO PROGRAMAR/2. Java/preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				lstbxPreferencias.setModel(modelo);
			}
			catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		} else if(arg0.getSource().equals(btnImpBDConectado)) {
			Connection con = null;
			try {
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				String servidordriver = "jdbc:ucanaccess://";
				String bancoDeDados = "C:/GitHub/CursoProgrAmar/Java/ExercicioArqProfFrontEndJava_03_05122023/Preferencias_1_05072023.accdb";
				String connectionString = servidordriver + bancoDeDados.trim();
				
				con = DriverManager.getConnection(connectionString);
				
				String strSql = "SELECT Descricao FROM Preferencias_3";
				
				PreparedStatement psql = con.prepareStatement(strSql);
				
				ResultSet rsPreferencias = psql.executeQuery();
				
				while(rsPreferencias.next()) {
					modelo.addElement(rsPreferencias.getString("Descricao"));
				}
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
			finally {
				if(con != null) {
					try {
						con.close();
 					} catch(Exception ex) {
						JOptionPane.showMessageDialog(this, "Erro na importação conectada" + ex.getMessage());
					}
				}
			}
		} else if(arg0.getSource().equals(btnImpBDDesconectado)) {
			Connection con = null;
			try {
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				String servidordriver = "jdbc:ucanaccess://";
				String bancoDeDados = "C:/GitHub/CursoProgrAmar/Java/ExercicioArqProfFrontEndJava_03_05122023/Preferencias_1_05072023.accdb";
				String connectionString = servidordriver + bancoDeDados.trim();
				
				con = DriverManager.getConnection(connectionString);
				
				String strSql = "SELECT Descricao FROM Preferencias_3";
				
				PreparedStatement psql = con.prepareStatement(strSql);
				
				ResultSet rsPreferencias = psql.executeQuery();
				
				ArrayList<String> lista = new ArrayList<String>();

				while(rsPreferencias.next()) {
					lista.add(rsPreferencias.getString("Descricao"));
				}
				
				con.close();
				
				lista.forEach(linhaArquivo -> {
					modelo.addElement(linhaArquivo);
				});
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				new Exception("Erro ao Executar ->" + ex.getMessage().toString());
			}
		}
	}

}
