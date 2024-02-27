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
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ExercicioAlterarBD_01_27022024 extends JFrame implements ActionListener{

	JLabel lblMensagem, lblDesvioCondicional, lblDesvioCondicionalEncadeado, lblSwitchCase, lblImpTxtWhile, lblImpTxtDoWhile, lblImpTxtFor, lblImpTxtForIn,
	lblImpTxtForEach, lblLimpaTexto, lblBancoConectado, lblBancoDesconectado, lblConsultarBD, lblPreferencias, lblPreferenciasgd, lblInserirBD,
	lblExcluirBD, lblAlterarBD;
	
	JButton btnMensagem, btnDesvioCondicional, btnDesvioCondicionalEncadeado, btnSwitchCase, btnImpTxtWhile, btnImpTxtDoWhile, btnImpTxtFor, btnImpTxtForIn,
	btnImpTxtForEach, btnLimpaTexto, btnBancoConectado, btnBancoDesconectado, btnConsultarBD, btnInserirBD, btnExcluirBD, btnAlterarBD;
	
	JList<String> lstbxPreferencias;
	
	JPanel dtgdvwPreferencias;
	
	JTextField textField;
	
	DefaultTableModel modelo;
	
	JTable table;
	
	JScrollPane scrollPane;
	
	public ExercicioAlterarBD_01_27022024() {
		setTitle("Exercicio AlterarBD 01 - 27/02/2024");
		setSize(475, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		init();
		ConsultarBD();
		setVisible(true);
	}
	
	public void init() {
		LayoutManager layout = new FlowLayout();
		
		modelo = new DefaultTableModel();
		
		int lblSizeX = 200;
		int lblSizeY = 10;
		int btnSizeX = 200;
		int btnSizeY = 20;
		int locationX = 20;
		int locationY = 10;
		int incBtnLocation = 15;
		int incLblLocation = 25;
		int locationXPreferencias = 240;
		int sizeXPreferencias = 200;
		int sizeYPreferencias = 300;
		
		
		lblMensagem = new JLabel("Mensagem");
		lblMensagem.setSize(lblSizeX, lblSizeY);
		lblMensagem.setLocation(locationX, locationY);
		add(lblMensagem);
		
		btnMensagem = new JButton("Mensagem");
		btnMensagem.setSize(btnSizeX, btnSizeY);
		btnMensagem.setLocation(locationX, lblMensagem.getY()+incBtnLocation);
		add(btnMensagem);
		
		lblDesvioCondicional = new JLabel("Desvio Condicional");
		lblDesvioCondicional.setSize(lblSizeX, lblSizeY);
		lblDesvioCondicional.setLocation(locationX, btnMensagem.getY()+incLblLocation);
		add(lblDesvioCondicional);
		
		btnDesvioCondicional = new JButton("Desvio Condicional");
		btnDesvioCondicional.setSize(btnSizeX, btnSizeY);
		btnDesvioCondicional.setLocation(locationX, lblDesvioCondicional.getY()+incBtnLocation);
		add(btnDesvioCondicional);
		
		lblDesvioCondicionalEncadeado = new JLabel("Desvio Condicional Encadeado");
		lblDesvioCondicionalEncadeado.setSize(lblSizeX, lblSizeY);
		lblDesvioCondicionalEncadeado.setLocation(locationX, btnDesvioCondicional.getY()+incLblLocation);
		add(lblDesvioCondicionalEncadeado);

		btnDesvioCondicionalEncadeado = new JButton("Desvio Condicional Encadeado");
		btnDesvioCondicionalEncadeado.setSize(btnSizeX, btnSizeY);
		btnDesvioCondicionalEncadeado.setLocation(locationX, lblDesvioCondicionalEncadeado.getY()+incBtnLocation);
		add(btnDesvioCondicionalEncadeado);
		
		lblSwitchCase = new JLabel("Switch Case");
		lblSwitchCase.setSize(lblSizeX, lblSizeY);
		lblSwitchCase.setLocation(locationX, btnDesvioCondicionalEncadeado.getY()+incLblLocation);
		add(lblSwitchCase);
		
		btnSwitchCase = new JButton("Switch Case");
		btnSwitchCase.setSize(btnSizeX, btnSizeY);
		btnSwitchCase.setLocation(locationX, lblSwitchCase.getY()+incBtnLocation);
		add(btnSwitchCase);
		
		lblImpTxtWhile = new JLabel("Importar Texto While");
		lblImpTxtWhile.setSize(lblSizeX, lblSizeY);
		lblImpTxtWhile.setLocation(locationX, btnSwitchCase.getY()+incLblLocation);
		add(lblImpTxtWhile);
		
		btnImpTxtWhile = new JButton("Importar Texto While");
		btnImpTxtWhile.setSize(btnSizeX, btnSizeY);
		btnImpTxtWhile.setLocation(locationX, lblImpTxtWhile.getY()+incBtnLocation);
		add(btnImpTxtWhile);
		
		lblImpTxtDoWhile = new JLabel("Importar Texto Do While");
		lblImpTxtDoWhile.setSize(lblSizeX, lblSizeY);
		lblImpTxtDoWhile.setLocation(locationX, btnImpTxtWhile.getY()+incLblLocation);
		add(lblImpTxtDoWhile);
		
		btnImpTxtDoWhile = new JButton("Importar Texto Do While");
		btnImpTxtDoWhile.setSize(btnSizeX, btnSizeY);
		btnImpTxtDoWhile.setLocation(locationX, lblImpTxtDoWhile.getY()+incBtnLocation);
		add(btnImpTxtDoWhile);
		
		lblImpTxtFor = new JLabel("Importar Texto For");
		lblImpTxtFor.setSize(lblSizeX, lblSizeY);
		lblImpTxtFor.setLocation(locationX, btnImpTxtDoWhile.getY()+incLblLocation);
		add(lblImpTxtFor);
		
		btnImpTxtFor = new JButton("Importar Texto For");
		btnImpTxtFor.setSize(btnSizeX, btnSizeY);
		btnImpTxtFor.setLocation(locationX, lblImpTxtFor.getY()+incBtnLocation);
		add(btnImpTxtFor);
		
		lblImpTxtForIn = new JLabel("Importar Texto For In");
		lblImpTxtForIn.setSize(lblSizeX, lblSizeY);
		lblImpTxtForIn.setLocation(locationX, btnImpTxtFor.getY()+incLblLocation);
		add(lblImpTxtForIn);
		
		btnImpTxtForIn = new JButton("Importar Texto For In");
		btnImpTxtForIn.setSize(btnSizeX, btnSizeY);
		btnImpTxtForIn.setLocation(locationX, lblImpTxtForIn.getY()+incBtnLocation);
		add(btnImpTxtForIn);
		
		lblImpTxtForEach = new JLabel("Importar Texto ForEach");
		lblImpTxtForEach.setSize(lblSizeX, lblSizeY);
		lblImpTxtForEach.setLocation(locationX, btnImpTxtForIn.getY()+incLblLocation);
		add(lblImpTxtForEach);
		
		btnImpTxtForEach = new JButton("Importar Texto ForEach");
		btnImpTxtForEach.setSize(btnSizeX, btnSizeY);
		btnImpTxtForEach.setLocation(locationX, lblImpTxtForEach.getY()+incBtnLocation);
		add(btnImpTxtForEach);
		
		lblLimpaTexto = new JLabel("Limpa Texto");
		lblLimpaTexto.setSize(lblSizeX, lblSizeY);
		lblLimpaTexto.setLocation(locationX, btnImpTxtForEach.getY()+incLblLocation);
		add(lblLimpaTexto);
		
		btnLimpaTexto = new JButton("Limpa Texto");
		btnLimpaTexto.setSize(btnSizeX, btnSizeY);
		btnLimpaTexto.setLocation(locationX, lblLimpaTexto.getY()+incBtnLocation);
		add(btnLimpaTexto);
		
		lblBancoConectado = new JLabel("Importar Banco Conectado");
		lblBancoConectado.setSize(lblSizeX, lblSizeY);
		lblBancoConectado.setLocation(locationX, btnLimpaTexto.getY()+incLblLocation);
		add(lblBancoConectado);
		
		btnBancoConectado = new JButton("Importar Banco Conectado");
		btnBancoConectado.setSize(btnSizeX, btnSizeY);
		btnBancoConectado.setLocation(locationX, lblBancoConectado.getY()+incBtnLocation);
		add(btnBancoConectado);
		
		lblBancoDesconectado = new JLabel("Importar Banco Desconectado");
		lblBancoDesconectado.setSize(lblSizeX, lblSizeY);
		lblBancoDesconectado.setLocation(locationX, btnBancoConectado.getY()+incLblLocation);
		add(lblBancoDesconectado);
		
		btnBancoDesconectado = new JButton("Importar Banco Desconectado");
		btnBancoDesconectado.setSize(btnSizeX, btnSizeY);
		btnBancoDesconectado.setLocation(locationX, lblBancoDesconectado.getY()+incBtnLocation);
		add(btnBancoDesconectado);
		
		lblConsultarBD = new JLabel("Consultar BD");
		lblConsultarBD.setSize(lblSizeX, lblSizeY);
		lblConsultarBD.setLocation(locationX, btnBancoDesconectado.getY()+incLblLocation);
		add(lblConsultarBD);
		
		btnConsultarBD = new JButton("Consultar BD");
		btnConsultarBD.setSize(btnSizeX, btnSizeY);
		btnConsultarBD.setLocation(locationX, lblConsultarBD.getY()+incBtnLocation);
		add(btnConsultarBD);
		
		lblInserirBD = new JLabel("Inserir BD");
		lblInserirBD.setSize(lblSizeX, lblSizeY);
		lblInserirBD.setLocation(locationX, btnConsultarBD.getY()+incLblLocation);
		add(lblInserirBD);
		
		btnInserirBD = new JButton("Inserir BD");
		btnInserirBD.setSize(btnSizeX, btnSizeY);
		btnInserirBD.setLocation(locationX, lblInserirBD.getY()+incBtnLocation);
		add(btnInserirBD);
		
		lblExcluirBD = new JLabel("Excluir BD");
		lblExcluirBD.setSize(lblSizeX, lblSizeY);
		lblExcluirBD.setLocation(locationX, btnInserirBD.getY()+incLblLocation);
		add(lblExcluirBD);
		
		btnExcluirBD = new JButton("Excluir BD");
		btnExcluirBD.setSize(btnSizeX, btnSizeY);
		btnExcluirBD.setLocation(locationX, lblExcluirBD.getY()+incBtnLocation);
		add(btnExcluirBD);
		
		lblAlterarBD = new JLabel("Alterar BD");
		lblAlterarBD.setSize(lblSizeX, lblSizeY);
		lblAlterarBD.setLocation(locationX, btnExcluirBD.getY()+incLblLocation);
		add(lblAlterarBD);
		
		btnAlterarBD = new JButton("Alterar BD");
		btnAlterarBD.setSize(btnSizeX, btnSizeY);
		btnAlterarBD.setLocation(locationX, lblAlterarBD.getY()+incBtnLocation);
		add(btnAlterarBD);
		
		lblPreferencias = new JLabel("lstbxPreferencias");
		lblPreferencias.setSize(lblSizeX, lblSizeY);
		lblPreferencias.setLocation(locationXPreferencias, locationY);
		add(lblPreferencias);
		
		lstbxPreferencias = new JList<String>();
		lstbxPreferencias.setBounds(locationXPreferencias, lblPreferencias.getY()+incBtnLocation, sizeXPreferencias, sizeYPreferencias);
		add(lstbxPreferencias);
		
		lblPreferenciasgd = new JLabel("dtgdvwPreferencias");
		lblPreferenciasgd.setSize(lblSizeX, lblSizeY);
		lblPreferenciasgd.setLocation(locationXPreferencias, lstbxPreferencias.getY()+incBtnLocation+sizeYPreferencias);
		add(lblPreferenciasgd);
		
		dtgdvwPreferencias = new JPanel(new BorderLayout());
        dtgdvwPreferencias.setSize(sizeXPreferencias, sizeYPreferencias);
        dtgdvwPreferencias.setLocation(locationXPreferencias, lblPreferenciasgd.getY()+incBtnLocation);  
        add(dtgdvwPreferencias);
        
        modelo.addColumn("ID");
        modelo.addColumn("Descricao");
        
        table = new JTable(modelo);
        
        scrollPane = new JScrollPane(table);
        dtgdvwPreferencias.add(scrollPane, BorderLayout.CENTER);
        
        TableColumnModel columnModel = table.getColumnModel();
        TableColumn column = columnModel.getColumn(0);
        column.setHeaderValue("ID");
        column = columnModel.getColumn(1);
        column.setHeaderValue("Descrição");
        table.getTableHeader().repaint();
		
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
		btnInserirBD.addActionListener(this);
		btnExcluirBD.addActionListener(this);
		btnAlterarBD.addActionListener(this);
	}
	
	public void ConsultarBD() {
	    Connection con = null;
	    try {
	        modelo.setRowCount(0);
	        
	        String servidorDriver = "jdbc:ucanaccess://";
	        String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
	        String connectionString = servidorDriver + bancoDeDados.trim();
	        con = DriverManager.getConnection(connectionString);

	        String strSql = "SELECT ID, Descricao FROM Preferencias_3";
	        PreparedStatement psql = con.prepareStatement(strSql);
	        ResultSet rsPreferencias = psql.executeQuery();

	        while (rsPreferencias.next()) {
	            String id = rsPreferencias.getString("ID");
	            String descricao = rsPreferencias.getString("Descricao");
	            modelo.addRow(new Object[]{id, descricao});
	        }
	        
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Erro ao Executar: " + ex.getMessage());
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(this, "Erro ao fechar conexão com o banco de dados: " + ex.getMessage());
	            }
	        }
	    }
	}
	
	public void InserirBD(String strPreferenciaIncluida) {
	    Connection con = null;
	    try {
	        String servidorDriver = "jdbc:ucanaccess://";
	        String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
	        String connectionString = servidorDriver + bancoDeDados.trim();
	        con = DriverManager.getConnection(connectionString);

	        String strSql = "INSERT INTO Preferencias_3 (Descricao) VALUES (?)";
	        PreparedStatement psql = con.prepareStatement(strSql);
	        psql.setString(1, strPreferenciaIncluida);
	        psql.executeUpdate();

	        ConsultarBD();

	        con.close();

	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Erro ao Executar: " + ex.getMessage());
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(this, "Erro ao fechar conexão com o banco de dados: " + ex.getMessage());
	            }
	        }
	    }
	}
	
	public void ExcluirBD() {
	    Connection con = null;
	    try {
	        JTable table = (JTable)((JScrollPane)dtgdvwPreferencias.getComponent(0)).getViewport().getView();
	        int selectedRow = table.getSelectedRow();
	        if (selectedRow == -1) {
	            JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para excluir.");
	            return;
	        }

	        int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0)); 

	        String servidorDriver = "jdbc:ucanaccess://";
	        String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
	        String connectionString = servidorDriver + bancoDeDados.trim();
	        con = DriverManager.getConnection(connectionString);

	        String strSql = "DELETE FROM Preferencias_3 WHERE ID = ?";
	        PreparedStatement psql = con.prepareStatement(strSql);
	        psql.setInt(1, id); 
	        psql.executeUpdate(); 
	        
	        con.close();
	        
	        DefaultTableModel modelo = (DefaultTableModel) table.getModel();
	        modelo.removeRow(selectedRow); 
	        modelo.fireTableDataChanged(); 

	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Erro ao Executar: " + ex.getMessage());
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(this, "Erro ao fechar conexão com o banco de dados: " + ex.getMessage());
	            }
	        }
	    }
	}

	public void AlterarBD() {
	    Connection con = null;
	    try {
	        String servidorDriver = "jdbc:ucanaccess://";
	        String bancoDeDados = "C:/CURSO PROGRAMAR/2. Java/Preferencias_1_05072023.accdb";
	        String connectionString = servidorDriver + bancoDeDados.trim();
	        con = DriverManager.getConnection(connectionString);

	        String novaDescricao = JOptionPane.showInputDialog(this, "Digite a nova descrição da preferência:");
	        JTable table = (JTable)((JScrollPane)dtgdvwPreferencias.getComponent(0)).getViewport().getView();
	        int selectedRow = table.getSelectedRow();
	        if (selectedRow == -1) {
	            JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para alterar.");
	            return;
	        }
	        int id = Integer.parseInt((String) table.getValueAt(selectedRow, 0)); 
	        String strSql = "UPDATE Preferencias_3 SET Descricao = ? WHERE ID = ?";
	        PreparedStatement psql = con.prepareStatement(strSql);
	        psql.setString(1, novaDescricao);
	        psql.setInt(2, id);
	        psql.executeUpdate();

	        ConsultarBD();

	        con.close();
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, "Erro ao Executar: " + ex.getMessage());
	    } finally {
	        if (con != null) {
	            try {
	                con.close();
	            } catch (Exception ex) {
	                JOptionPane.showMessageDialog(this, "Erro ao fechar conexão com o banco de dados: " + ex.getMessage());
	            }
	        }
	    }
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
			ConsultarBD();
		} if(arg0.getSource().equals(btnInserirBD)) {
			String descricaoInserida = JOptionPane.showInputDialog(this, "Digite a preferencia a ser incluída:");
			InserirBD(descricaoInserida);
		} if(arg0.getSource().equals(btnExcluirBD)) {
			ExcluirBD();
		} if(arg0.getSource().equals(btnAlterarBD)) {
			AlterarBD();
		}
	}

}
