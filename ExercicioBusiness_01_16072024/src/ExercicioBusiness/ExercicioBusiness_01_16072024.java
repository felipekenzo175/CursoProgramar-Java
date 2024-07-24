package ExercicioBusiness;

import Singleton.Singleton;
import Business.Preferencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

public class ExercicioBusiness_01_16072024 extends JFrame implements ActionListener{
	JLabel lblMensagem, lblDesvioCondicional, lblDesvioCondicionalEncadeado, lblSwitchCase,
	lblImpTxtWhile, lblImpTxtDoWhile, lblImpTxtFor, lblImpTxtForIn, lblImpTxtForEach, lblLimpaTexto,
	lblBancoConectado, lblBancoDesconectado, lblConsultarBD, lblInserirBD, lblExcluirBD, lblAlterarBD,
	lblPreferencias, lblPreferenciasgd;
	
	JButton btnMensagem, btnDesvioCondicional, btnDesvioCondicionalEncadeado, btnSwitchCase,
	btnImpTxtWhile, btnImpTxtDoWhile, btnImpTxtFor, btnImpTxtForIn, btnImpTxtForEach, btnLimpaTexto,
	btnBancoConectado, btnBancoDesconectado, btnConsultarBD, btnInserirBD, btnExcluirBD, btnAlterarBD;
	
	JList<String> lstbxPreferencias;
	
	JPanel dtgdvwPreferencias;
	
	JTextField textField;
	
	DefaultTableModel modelo;
	
	JTable table;
	
	JScrollPane scrollPane;
	
	Preferencias objPreferencias;
	
	public ExercicioBusiness_01_16072024() {
		setTitle("Exercicio Business 01 16/07/2024");
		setSize(475,700);
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
		btnMensagem.setActionCommand("btnMensagem");
		add(btnMensagem);
		
		lblDesvioCondicional = new JLabel("Desvio Condicional");
		lblDesvioCondicional.setSize(lblSizeX, lblSizeY);
		lblDesvioCondicional.setLocation(locationX, btnMensagem.getY()+incLblLocation);
		add(lblDesvioCondicional);
		
		btnDesvioCondicional = new JButton("Desvio Condicional");
		btnDesvioCondicional.setSize(btnSizeX, btnSizeY);
		btnDesvioCondicional.setLocation(locationX, lblDesvioCondicional.getY()+incBtnLocation);
		btnDesvioCondicional.setActionCommand("btnDesvioCondicional");
		add(btnDesvioCondicional);
		
		lblDesvioCondicionalEncadeado = new JLabel("Desvio Condicional Encadeado");
		lblDesvioCondicionalEncadeado.setSize(lblSizeX, lblSizeY);
		lblDesvioCondicionalEncadeado.setLocation(locationX, btnDesvioCondicional.getY()+incLblLocation);
		add(lblDesvioCondicionalEncadeado);
		
		btnDesvioCondicionalEncadeado = new JButton("Desvio Condicional Encadeado");
		btnDesvioCondicionalEncadeado.setSize(btnSizeX, btnSizeY);
		btnDesvioCondicionalEncadeado.setLocation(locationX, lblDesvioCondicionalEncadeado.getY()+incBtnLocation);
		btnDesvioCondicionalEncadeado.setActionCommand("btnDesvioCondicionalEncadeado");
		add(btnDesvioCondicionalEncadeado);
		
		lblSwitchCase = new JLabel("Switch Case");
		lblSwitchCase.setSize(lblSizeX, lblSizeY);
		lblSwitchCase.setLocation(locationX, btnDesvioCondicionalEncadeado.getY()+incLblLocation);
		add(lblSwitchCase);
		
		btnSwitchCase = new JButton("Switch Case");
		btnSwitchCase.setSize(btnSizeX, btnSizeY);
		btnSwitchCase.setLocation(locationX, lblSwitchCase.getY()+incBtnLocation);
		btnSwitchCase.setActionCommand("btnSwitchCase");
		add(btnSwitchCase);
		
		lblImpTxtWhile = new JLabel("Importar Texto While");
		lblImpTxtWhile.setSize(lblSizeX, lblSizeY);
		lblImpTxtWhile.setLocation(locationX, btnSwitchCase.getY()+incLblLocation);
		add(lblImpTxtWhile);
		
		btnImpTxtWhile = new JButton("Importar Texto While");
		btnImpTxtWhile.setSize(btnSizeX, btnSizeY);
		btnImpTxtWhile.setLocation(locationX, lblImpTxtWhile.getY()+incBtnLocation);
		btnImpTxtWhile.setActionCommand("btnImpTxtWhile");
		add(btnImpTxtWhile);
		
		lblImpTxtDoWhile = new JLabel("Importar Texto Do While");
		lblImpTxtDoWhile.setSize(lblSizeX, lblSizeY);
		lblImpTxtDoWhile.setLocation(locationX, btnImpTxtWhile.getY()+incLblLocation);
		add(lblImpTxtDoWhile);
		
		btnImpTxtDoWhile = new JButton("Importar Texto Do While");
		btnImpTxtDoWhile.setSize(btnSizeX, btnSizeY);
		btnImpTxtDoWhile.setLocation(locationX, lblImpTxtDoWhile.getY()+incBtnLocation);
		btnImpTxtDoWhile.setActionCommand("btnImpTxtDoWhile");
		add(btnImpTxtDoWhile);
		
		lblImpTxtFor = new JLabel("Importar Texto For");
		lblImpTxtFor.setSize(lblSizeX, lblSizeY);
		lblImpTxtFor.setLocation(locationX, btnImpTxtDoWhile.getY()+incLblLocation);
		add(lblImpTxtFor);
		
		btnImpTxtFor = new JButton("Importar Texto For");
		btnImpTxtFor.setSize(btnSizeX, btnSizeY);
		btnImpTxtFor.setLocation(locationX, lblImpTxtFor.getY()+incBtnLocation);
		btnImpTxtFor.setActionCommand("btnImpTxtFor");
		add(btnImpTxtFor);
		
		lblImpTxtForIn = new JLabel("Importar Texto For In");
		lblImpTxtForIn.setSize(lblSizeX, lblSizeY);
		lblImpTxtForIn.setLocation(locationX, btnImpTxtFor.getY()+incLblLocation);
		add(lblImpTxtForIn);
		
		btnImpTxtForIn = new JButton("Importar Texto For In");
		btnImpTxtForIn.setSize(btnSizeX, btnSizeY);
		btnImpTxtForIn.setLocation(locationX, lblImpTxtForIn.getY()+incBtnLocation);
		btnImpTxtForIn.setActionCommand("btnImpTxtForIn");
		add(btnImpTxtForIn);
		
		lblImpTxtForEach = new JLabel("Importar Texto For Each");
		lblImpTxtForEach.setSize(lblSizeX, lblSizeY);
		lblImpTxtForEach.setLocation(locationX, btnImpTxtForIn.getY()+incLblLocation);
		add(lblImpTxtForEach);
		
		btnImpTxtForEach = new JButton("Importar Texto For Each");
		btnImpTxtForEach.setSize(btnSizeX, btnSizeY);
		btnImpTxtForEach.setLocation(locationX, lblImpTxtForEach.getY()+incBtnLocation);
		btnImpTxtForEach.setActionCommand("btnImpTxtForEach");
		add(btnImpTxtForEach);
		
		lblLimpaTexto = new JLabel("Limpa Texto");
		lblLimpaTexto.setSize(lblSizeX, lblSizeY);
		lblLimpaTexto.setLocation(locationX, btnImpTxtForEach.getY()+incLblLocation);
		add(lblLimpaTexto);
		
		btnLimpaTexto = new JButton("Limpa Texto");
		btnLimpaTexto.setSize(btnSizeX, btnSizeY);
		btnLimpaTexto.setLocation(locationX, lblLimpaTexto.getY()+incBtnLocation);
		btnLimpaTexto.setActionCommand("btnLimpaTexto");
		add(btnLimpaTexto);
		
		lblBancoConectado = new JLabel("Banco Conectado");
		lblBancoConectado.setSize(lblSizeX, lblSizeY);
		lblBancoConectado.setLocation(locationX, btnLimpaTexto.getY()+incLblLocation);
		add(lblBancoConectado);
		
		btnBancoConectado = new JButton("Banco Conectado");
		btnBancoConectado.setSize(btnSizeX, btnSizeY);
		btnBancoConectado.setLocation(locationX, lblBancoConectado.getY()+incBtnLocation);
		btnBancoConectado.setActionCommand("btnBancoConectado");
		add(btnBancoConectado);
		
		lblBancoDesconectado = new JLabel("Banco Desconectado");
		lblBancoDesconectado.setSize(lblSizeX, lblSizeY);
		lblBancoDesconectado.setLocation(locationX, btnBancoConectado.getY()+incLblLocation);
		add(lblBancoDesconectado);
		
		btnBancoDesconectado = new JButton("Banco Desconectado");
		btnBancoDesconectado.setSize(btnSizeX, btnSizeY);
		btnBancoDesconectado.setLocation(locationX, lblBancoDesconectado.getY()+incBtnLocation);
		btnBancoDesconectado.setActionCommand("btnBancoDesconectado");
		add(btnBancoDesconectado);
		
		lblConsultarBD = new JLabel("Consultar Banco de Dados");
		lblConsultarBD.setSize(lblSizeX, lblSizeY);
		lblConsultarBD.setLocation(locationX, btnBancoDesconectado.getY()+incLblLocation);
		add(lblConsultarBD);
		
		btnConsultarBD = new JButton("Consultar Banco de Dados");
		btnConsultarBD.setSize(btnSizeX, btnSizeY);
		btnConsultarBD.setLocation(locationX, lblConsultarBD.getY()+incBtnLocation);
		btnConsultarBD.setActionCommand("btnConsultarBD");
		add(btnConsultarBD);
		
		lblInserirBD = new JLabel("Inserir Banco de Dados");
		lblInserirBD.setSize(lblSizeX, lblSizeY);
		lblInserirBD.setLocation(locationX, btnConsultarBD.getY()+incLblLocation);
		add(lblInserirBD);
		
		btnInserirBD = new JButton("Inserir Banco de Dados");
		btnInserirBD.setSize(btnSizeX, btnSizeY);
		btnInserirBD.setLocation(locationX, lblInserirBD.getY()+incBtnLocation);
		btnInserirBD.setActionCommand("btnInserirBD");
		add(btnInserirBD);
		
		lblExcluirBD = new JLabel("Excluir Banco de Dados");
		lblExcluirBD.setSize(lblSizeX, lblSizeY);
		lblExcluirBD.setLocation(locationX, btnInserirBD.getY()+incLblLocation);
		add(lblExcluirBD);
		
		btnExcluirBD = new JButton("Excluir Banco de Dados");
		btnExcluirBD.setSize(btnSizeX, btnSizeY);
		btnExcluirBD.setLocation(locationX, lblExcluirBD.getY()+incBtnLocation);
		btnExcluirBD.setActionCommand("btnExcluirBD");
		add(btnExcluirBD);
		
		lblAlterarBD = new JLabel("Alterar Banco de Dados");
		lblAlterarBD.setSize(lblSizeX, lblSizeY);
		lblAlterarBD.setLocation(locationX, btnExcluirBD.getY()+incLblLocation);
		add(lblAlterarBD);
		
		btnAlterarBD = new JButton("Alterar Banco de Dados");
		btnAlterarBD.setSize(btnSizeX, btnSizeY);
		btnAlterarBD.setLocation(locationX, lblAlterarBD.getY()+incBtnLocation);
		btnAlterarBD.setActionCommand("btnAlterarBD");
		add(btnAlterarBD);
		
		lblPreferencias = new JLabel("ListBox Preferencias");
		lblPreferencias.setSize(lblSizeX, lblSizeY);
		lblPreferencias.setLocation(locationXPreferencias, locationY);
		add(lblPreferencias);
		
		lstbxPreferencias = new JList<String>();
		lstbxPreferencias.setBounds(locationXPreferencias, lblPreferencias.getY()+incBtnLocation, sizeXPreferencias, sizeYPreferencias);
		add(lstbxPreferencias);
		
		lblPreferenciasgd = new JLabel("DataGridView Preferencias");
		lblPreferenciasgd.setSize(lblSizeX, lblSizeY);
		lblPreferenciasgd.setLocation(locationXPreferencias, lstbxPreferencias.getY()+sizeYPreferencias+incLblLocation);
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
		column.setHeaderValue("Descricao");
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
	
	public void Mensagem() {
		JOptionPane.showMessageDialog(this, "Olá, Mundo");
	}
	
	public void DesvioCondicional() {
		if (JOptionPane.showConfirmDialog(this, "escolha sim ou não", "desvio condicional", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "você escolheu sim");
		} else {
			JOptionPane.showMessageDialog(this, "você escolheu não");
		}
	}
	
	public void DesvioCondicionalEncadeado() {
		int resposta = JOptionPane.showConfirmDialog(this, "escolha sim, não ou cancelar", "desvio condicional encadeado", JOptionPane.YES_NO_CANCEL_OPTION);
		
		if (resposta == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(this, "você escolheu sim");
		} else if (resposta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(this, "você escolheu não");
		} else {
			JOptionPane.showMessageDialog(this, "você escolheu cancelar");
		}
	}
	
	public void SwitchCase() {
		switch(JOptionPane.showConfirmDialog(this, "escolha sim, não ou cancelar", "switch case", JOptionPane.YES_NO_CANCEL_OPTION)) {
			case JOptionPane.YES_OPTION:
				JOptionPane.showMessageDialog(this, "você escolheu sim");
				break;
			case JOptionPane.NO_OPTION:
				JOptionPane.showMessageDialog(this, "você escolheu não");
				break;
			case JOptionPane.CANCEL_OPTION:
				JOptionPane.showMessageDialog(this, "você escolheu cancelar");
				break;
			default:
				JOptionPane.showMessageDialog(this, "você escolheu errado");
		}
	}
	
	public void ImpTxtWhile() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.ImpTxtWhile());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void ImpTxtDoWhile() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.ImpTxtDoWhile());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void ImpTxtFor() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.ImpTxtFor());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void ImpTxtForIn() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.ImpTxtForIn());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void ImpTxtForEach() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.ImpTxtForEach());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void LimpaTexto() {
		try {		
			DefaultListModel<String> modelo = new DefaultListModel<String>();
			
			modelo.clear();
			
			lstbxPreferencias.setModel(modelo);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void BancoConectado() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.BancoConectado());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void BancoDesconectado() {
		try {
			objPreferencias = new Preferencias();
			lstbxPreferencias.setModel(objPreferencias.BancoDesconectado());
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void ConsultarBD() {
		try {
			modelo.setRowCount(0);

			objPreferencias = new Preferencias();
			ResultSet rsPreferencias = objPreferencias.ConsultarBD();
			
			while (rsPreferencias.next()) {
				String id = rsPreferencias.getString("ID");
				String descricao = rsPreferencias.getString("Descricao");
				modelo.addRow(new Object[] {id, descricao});
			}

		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		}
	}
	
	public void InserirBD() {
		try {
			String strPreferenciaIncluida = JOptionPane.showInputDialog(this, "Digite a preferencia a ser incluída:");
			objPreferencias = new Preferencias();
			if (objPreferencias.InserirBD(strPreferenciaIncluida)) {
				JOptionPane.showMessageDialog(this, "Inserido com Sucesso");
			} else {
				JOptionPane.showMessageDialog(this, "Erro ao Inserir");
			}
			ConsultarBD();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		} 
	}
	
	public void ExcluirBD() {
		try {
			JTable table = (JTable)((JScrollPane)dtgdvwPreferencias.getComponent(0)).getViewport().getView();
			int selectRow = table.getSelectedRow();
			if (selectRow == -1) {
				JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para excluí-la");
				return;
			}
			int id = Integer.parseInt((String) table.getValueAt(selectRow, 0));
			objPreferencias = new Preferencias();
			if (objPreferencias.ExcluirBD(id)) {
				JOptionPane.showMessageDialog(this, "Excluído com Sucesso");
			} else {
				JOptionPane.showMessageDialog(this, "Erro ao Excluir");
			}
			ConsultarBD();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		} 
	}
	
	public void AlterarBD() {
		try {
			String novaDescricao = JOptionPane.showInputDialog(this, "Digite a nova descricão da preferência:");
			JTable table = (JTable)((JScrollPane)dtgdvwPreferencias.getComponent(0)).getViewport().getView();
			int selectRow = table.getSelectedRow();
			if (selectRow == -1) {
				JOptionPane.showMessageDialog(this, "Por favor, selecione uma linha para alterar");
				return;
			}
			int id = Integer.parseInt((String) table.getValueAt(selectRow, 0));
			objPreferencias = new Preferencias();
			if (objPreferencias.AlterarBD(novaDescricao, id)) {
				JOptionPane.showMessageDialog(this, "Alterado com Sucesso");
			} else {
				JOptionPane.showMessageDialog(this, "Erro ao Alterar");
			}
			ConsultarBD();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Erro ao Executar" + ex.getMessage().toString());
		} 
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() instanceof JButton) {
			JButton button = (JButton) arg0.getSource();
			String buttonName = button.getActionCommand();
			
			switch(buttonName) {
				case "btnMensagem":
					Mensagem();
					break;
				case "btnDesvioCondicional":
					DesvioCondicional();
					break;
				case "btnDesvioCondicionalEncadeado":
					DesvioCondicionalEncadeado();
					break;
				case "btnSwitchCase":
					SwitchCase();
					break;
				case "btnImpTxtWhile":
					ImpTxtWhile();
					break;
				case "btnImpTxtDoWhile":
					ImpTxtDoWhile();
					break;
				case "btnImpTxtFor":
					ImpTxtFor();
					break;
				case "btnImpTxtForIn":
					ImpTxtForIn();
					break;
				case "btnImpTxtForEach":
					ImpTxtForEach();
					break;
				case "btnLimpaTexto":
					LimpaTexto();
					break;
				case "btnBancoConectado":
					BancoConectado();
					break;
				case "btnBancoDesconectado":
					BancoDesconectado();
					break;
				case "btnConsultarBD":
					ConsultarBD();
					break;
				case "btnInserirBD":
					InserirBD();
					break;
				case "btnExcluirBD":
					ExcluirBD();
					break;
				case "btnAlterarBD":
					AlterarBD();
					break;
				default: 
					break;
			}
		}
	}
}

