import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ExercicioArqProfFrontEndJava_13_23012024 extends JFrame implements ActionListener{

	JLabel lblMensagem, lblDesvioCondicional, lblDesvioCondicionalEncadeado, lblSwitchCase, lblImpTxtWhile, lblImpTxtDoWhile, lblImpTxtFor, lblImpTxtForIn,
	lblImpTxtForEach, lblLimpaTexto, lblBancoConectado, lblBancoDesconectado, lblConsultarBD, lblPreferencias;
	
	JButton btnMensagem, btnDesvioCondicional, btnDesvioCondicionalEncadeado, btnSwitchCase, btnImpTxtWhile, btnImpTxtDoWhile, btnImpTxtFor, btnImpTxtForIn,
	btnImpTxtForEach, btnLimpaTexto, btnBancoConectado, btnBancoDesconectado, btnConsultarBD;
	
	JList<String> lstbxPreferencias;
	
	public ExercicioArqProfFrontEndJava_13_23012024() {
		setTitle("Exercicio Arqutitetura Profissional Front End Java - 13 - 23/01/2024");
		setSize(500, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		init();
		setVisible(true);
	}
	
	public void init() {
		LayoutManager layout = new FlowLayout();
		
		lblMensagem = new JLabel("Mensagem");
		lblMensagem.setSize(200,10);
		lblMensagem.setLocation(20, 10);
		add(lblMensagem);
		
		btnMensagem = new JButton("Mensagem");
		btnMensagem.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnMensagem.setLocation(lblMensagem.getX(), lblMensagem.getY()+15);
		add(btnMensagem);
		
		lblDesvioCondicional = new JLabel("Desvio Condicional");
		lblDesvioCondicional.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblDesvioCondicional.setLocation(lblMensagem.getX(), btnMensagem.getY()+35);
		add(lblDesvioCondicional);
		
		btnDesvioCondicional = new JButton("Desvio Condicional");
		btnDesvioCondicional.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnDesvioCondicional.setLocation(lblMensagem.getX(), lblDesvioCondicional.getY()+15);
		add(btnDesvioCondicional);
		
		lblDesvioCondicionalEncadeado = new JLabel("Desvio Condicional Encadeado");
		lblDesvioCondicionalEncadeado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblDesvioCondicionalEncadeado.setLocation(lblMensagem.getX(), btnDesvioCondicional.getY()+35);
		add(lblDesvioCondicionalEncadeado);

		btnDesvioCondicionalEncadeado = new JButton("Desvio Condicional Encadeado");
		btnDesvioCondicionalEncadeado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnDesvioCondicionalEncadeado.setLocation(lblMensagem.getX(), lblDesvioCondicionalEncadeado.getY()+15);
		add(btnDesvioCondicionalEncadeado);
		
		lblSwitchCase = new JLabel("Switch Case");
		lblSwitchCase.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblSwitchCase.setLocation(lblMensagem.getX(), btnDesvioCondicionalEncadeado.getY()+35);
		add(lblSwitchCase);
		
		btnSwitchCase = new JButton("Switch Case");
		btnSwitchCase.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnSwitchCase.setLocation(lblMensagem.getX(), lblSwitchCase.getY()+15);
		add(btnSwitchCase);
		
		lblImpTxtWhile = new JLabel("Importar Texto While");
		lblImpTxtWhile.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblImpTxtWhile.setLocation(lblMensagem.getX(), btnSwitchCase.getY()+35);
		add(lblImpTxtWhile);
		
		btnImpTxtWhile = new JButton("Importar Texto While");
		btnImpTxtWhile.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnImpTxtWhile.setLocation(lblMensagem.getX(), lblImpTxtWhile.getY()+15);
		add(btnImpTxtWhile);
		
		lblImpTxtDoWhile = new JLabel("Importar Texto Do While");
		lblImpTxtDoWhile.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblImpTxtDoWhile.setLocation(lblMensagem.getX(), btnImpTxtWhile.getY()+35);
		add(lblImpTxtDoWhile);
		
		btnImpTxtDoWhile = new JButton("Importar Texto Do While");
		btnImpTxtDoWhile.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnImpTxtDoWhile.setLocation(lblMensagem.getX(), lblImpTxtDoWhile.getY()+15);
		add(btnImpTxtDoWhile);
		
		lblImpTxtFor = new JLabel("Importar Texto For");
		lblImpTxtFor.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblImpTxtFor.setLocation(lblMensagem.getX(), btnImpTxtDoWhile.getY()+35);
		add(lblImpTxtFor);
		
		btnImpTxtFor = new JButton("Importar Texto For");
		btnImpTxtFor.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnImpTxtFor.setLocation(lblMensagem.getX(), lblImpTxtFor.getY()+15);
		add(btnImpTxtFor);
		
		lblImpTxtForIn = new JLabel("Importar Texto For In");
		lblImpTxtForIn.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblImpTxtForIn.setLocation(lblMensagem.getX(), btnImpTxtFor.getY()+35);
		add(lblImpTxtForIn);
		
		btnImpTxtForIn = new JButton("Importar Texto For In");
		btnImpTxtForIn.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnImpTxtForIn.setLocation(lblMensagem.getX(), lblImpTxtForIn.getY()+15);
		add(btnImpTxtForIn);
		
		lblImpTxtForEach = new JLabel("Importar Texto ForEach");
		lblImpTxtForEach.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblImpTxtForEach.setLocation(lblMensagem.getX(), btnImpTxtForIn.getY()+35);
		add(lblImpTxtForEach);
		
		btnImpTxtForEach = new JButton("Importar Texto ForEach");
		btnImpTxtForEach.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnImpTxtForEach.setLocation(lblMensagem.getX(), lblImpTxtForEach.getY()+15);
		add(btnImpTxtForEach);
		
		lblLimpaTexto = new JLabel("Limpa Texto");
		lblLimpaTexto.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblLimpaTexto.setLocation(lblMensagem.getX(), btnImpTxtForEach.getY()+35);
		add(lblLimpaTexto);
		
		btnLimpaTexto = new JButton("Limpa Texto");
		btnLimpaTexto.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnLimpaTexto.setLocation(lblMensagem.getX(), lblLimpaTexto.getY()+15);
		add(btnLimpaTexto);
		
		lblBancoConectado = new JLabel("Importar Banco Conectado");
		lblBancoConectado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblBancoConectado.setLocation(lblMensagem.getX(), btnLimpaTexto.getY()+35);
		add(lblBancoConectado);
		
		btnBancoConectado = new JButton("Importar Banco Conectado");
		btnBancoConectado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnBancoConectado.setLocation(lblMensagem.getX(), lblBancoConectado.getY()+15);
		add(btnBancoConectado);
		
		lblBancoDesconectado = new JLabel("Importar Banco Desconectado");
		lblBancoDesconectado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblBancoDesconectado.setLocation(lblMensagem.getX(), btnBancoConectado.getY()+35);
		add(lblBancoDesconectado);
		
		btnBancoDesconectado = new JButton("Importar Banco Desconectado");
		btnBancoDesconectado.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnBancoDesconectado.setLocation(lblMensagem.getX(), lblBancoDesconectado.getY()+15);
		add(btnBancoDesconectado);
		
		lblConsultarBD = new JLabel("Consultar BD");
		lblConsultarBD.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblConsultarBD.setLocation(lblMensagem.getX(), btnBancoDesconectado.getY()+35);
		add(lblConsultarBD);
		
		btnConsultarBD = new JButton("Consultar BD");
		btnConsultarBD.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+20);
		btnConsultarBD.setLocation(lblMensagem.getX(), lblConsultarBD.getY()+15);
		add(btnConsultarBD);
		
		lblPreferencias = new JLabel("Preferencias");
		lblPreferencias.setSize(lblMensagem.getWidth(),lblMensagem.getHeight());
		lblPreferencias.setLocation(lblMensagem.getX()+220, lblMensagem.getY());
		add(lblPreferencias);
		
		lstbxPreferencias = new JList<String>();
		lstbxPreferencias.setBounds(lblMensagem.getX()+220, lblMensagem.getY()+15, lblMensagem.getWidth()+20, lblMensagem.getHeight()+630);
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
		btnBancoConectado.addActionListener(this);
		btnBancoDesconectado.addActionListener(this);
		btnConsultarBD.addActionListener(this);
		
	}
	@Override
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btnMensagem)) {
			JOptionPane.showMessageDialog(this, "Olá, Mundo!");
		} if(arg0.getSource().equals(btnDesvioCondicional)) {
			if(JOptionPane.showConfirmDialog(this, "Escolha Sim ou Não", "Escolha", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(this, "Você escolheu Sim!");
			} else {
				JOptionPane.showMessageDialog(this, "Você escolheu Não!");
			}
		} if(arg0.getSource().equals(btnDesvioCondicionalEncadeado)) {
			int resposta = JOptionPane.showConfirmDialog(this, "Escolha Sim, Não ou Cancelar", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION);
			if(resposta == JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(this, "Você escolheu Sim!");
			} if(resposta == JOptionPane.NO_OPTION){
				JOptionPane.showMessageDialog(this, "Você escolheu Não!");
			} else {
				JOptionPane.showMessageDialog(this, "Você escolheu Cancelar!");
			}
		} if(arg0.getSource().equals(btnSwitchCase)) {
			switch(JOptionPane.showConfirmDialog(this, "Escolha Sim, Não ou Cancelar", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION)) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Sim!");
				break;
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Não!");
				break;
			case JOptionPane.CANCEL_OPTION:
				JOptionPane.showMessageDialog(this, "Você escolheu Cancelar!");
				break;
			default:
				JOptionPane.showMessageDialog(this, "Você escolheu Errado, Escolha Sim, Não ou Cancelar!");
				break;
			}
		} if(arg0.getSource().equals(btnImpTxtWhile)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				int linhaArquivo = 0;
				int totalLinhas = arrayLinhasArquivo.size();
				
				modelo.clear();
				
				while(linhaArquivo < totalLinhas) {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
					linhaArquivo++;
				}
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnImpTxtDoWhile)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				int linhaArquivo = 0;
				int totalLinhas = arrayLinhasArquivo.size();
				
				modelo.clear();
				
				do {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
					linhaArquivo++;
				}while(linhaArquivo < totalLinhas);
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnImpTxtFor)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				for(int linhaArquivo = 0; linhaArquivo < arrayLinhasArquivo.size(); linhaArquivo++) {
					modelo.addElement(arrayLinhasArquivo.get(linhaArquivo));
				}
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnImpTxtForIn)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				for(String linhaArquivo : arrayLinhasArquivo) {
					modelo.addElement(linhaArquivo);
				}
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnImpTxtForEach)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				arrayLinhasArquivo.forEach( linhaArquivo -> {
					modelo.addElement(linhaArquivo);
				});
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnLimpaTexto)) {
			try {
				File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
				List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
				
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				modelo.clear();
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnBancoConectado)) {
			Connection con = null;
			try {
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				String servidorDriver = "jdbc:ucanaccess://";
				String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
				String connectionString = servidorDriver + bancoDeDados.trim();
				
				con = DriverManager.getConnection(connectionString);
				
				String strSql = "SELECT Descricao FROM Preferencias_3";
				
				PreparedStatement psql = con.prepareStatement(strSql);
				
				ResultSet rsPreferencias = psql.executeQuery();
				
				while(rsPreferencias.next()) {
					modelo.addElement(rsPreferencias.getString("Descricao"));
				}
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			} finally {
				if(con != null) {
					try {
						con.close();
					} catch(Exception ex) {
						JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
					}
				}
			}
		} if(arg0.getSource().equals(btnBancoDesconectado)) {
			Connection con = null;
			try {
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				String servidorDriver = "jdbc:ucanaccess://";
				String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
				String connectionString = servidorDriver + bancoDeDados.trim();
				
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
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		} if(arg0.getSource().equals(btnConsultarBD)) {
			Connection con = null;
			try {
				DefaultListModel<String> modelo = new DefaultListModel<String>();
				
				String servidorDriver = "jdbc:ucanaccess://";
				String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
				String connectionString = servidorDriver + bancoDeDados.trim();
				
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
				
				JTable table = new JTable();
				
				lstbxPreferencias.setModel(modelo);
			} catch(Exception ex) {
				JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
			}
		}
	}

}
