import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TesteFormsLoops_01_28112023 {

	public static void main(String[] args) {
		criarTela();
	}
	
	public static void criarTela() {
		JFrame tela = new JFrame();
		tela.setTitle("Tela de Botões");
		tela.setSize(500,700);
		tela.setVisible(true);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		criarTelaDoUsuario(tela);
	}
	
	public static void criarTelaDoUsuario(JFrame tela) {
		JPanel panel = new JPanel();
		LayoutManager layout = new FlowLayout();
		panel.setLayout(null);
		
		JLabel lblMensagem = new JLabel("MENSAGEM");
		lblMensagem.setSize(200,10);
		lblMensagem.setLocation(20, 10);
		panel.add(lblMensagem);
		
		JButton btnMensagem = new JButton("mensagem");
		btnMensagem.setSize(200,40);
		btnMensagem.setLocation(20, lblMensagem.getY()+15);
		panel.add(btnMensagem);
		
		JLabel lblDesvioCondicional = new JLabel("DESVIO CONDICIONAL");
		lblDesvioCondicional.setSize(200,10);
		lblDesvioCondicional.setLocation(20, btnMensagem.getY()+50);
		panel.add(lblDesvioCondicional);
		
		JButton btnDesvioCondicional = new JButton("desvio condicional");
		btnDesvioCondicional.setSize(200,40);
		btnDesvioCondicional.setLocation(20, lblDesvioCondicional.getY()+15);
		panel.add(btnDesvioCondicional);
		
		JLabel lblDesvioCondicionalEncadeado = new JLabel("DESVIO CONDICIONAL ENCADEADO");
		lblDesvioCondicionalEncadeado.setSize(200,10);
		lblDesvioCondicionalEncadeado.setLocation(20, btnDesvioCondicional.getY()+50);
		panel.add(lblDesvioCondicionalEncadeado);
		
		JButton btnDesvioCondicionalEncadeado = new JButton("desvio condicional encadeado");
		btnDesvioCondicionalEncadeado.setSize(200,40);
		btnDesvioCondicionalEncadeado.setLocation(20, lblDesvioCondicionalEncadeado.getY()+15);
		panel.add(btnDesvioCondicionalEncadeado);
		
		JLabel lblSwitchCase = new JLabel("SWITCH CASE");
		lblSwitchCase.setSize(200,10);
		lblSwitchCase.setLocation(20, btnDesvioCondicionalEncadeado.getY()+50);
		panel.add(lblSwitchCase);
		
		JButton btnSwitchCase = new JButton("switch case");
		btnSwitchCase.setSize(200,40);
		btnSwitchCase.setLocation(20, lblSwitchCase.getY()+15);
		panel.add(btnSwitchCase);
		
		JLabel lblImpTxtWhile = new JLabel("IMPORTAR TEXTO WHILE");
		lblImpTxtWhile.setSize(200,10);
		lblImpTxtWhile.setLocation(20, btnSwitchCase.getY()+50);
		panel.add(lblImpTxtWhile);
		
		JButton btnImpTxtWhile = new JButton("importar texto while");
		btnImpTxtWhile.setSize(200,40);
		btnImpTxtWhile.setLocation(20, lblImpTxtWhile.getY()+15);
		panel.add(btnImpTxtWhile);
		
		JLabel lblImpTxtDoWhile = new JLabel("IMPORTAR TEXTO DO WHILE");
		lblImpTxtDoWhile.setSize(200,10);
		lblImpTxtDoWhile.setLocation(20, btnImpTxtWhile.getY()+50);
		panel.add(lblImpTxtDoWhile);
		
		JButton btnImpTxtDoWhile = new JButton("importar texto do while");
		btnImpTxtDoWhile.setSize(200,40);
		btnImpTxtDoWhile.setLocation(20, lblImpTxtDoWhile.getY()+15);
		panel.add(btnImpTxtDoWhile);
		
		JLabel lblImpTxtFor = new JLabel("IMPORTAR TEXTO FOR");
		lblImpTxtFor.setSize(200,10);
		lblImpTxtFor.setLocation(20, btnImpTxtDoWhile.getY()+50);
		panel.add(lblImpTxtFor);
		
		JButton btnImpTxtFor = new JButton("importar texto for");
		btnImpTxtFor.setSize(200,40);
		btnImpTxtFor.setLocation(20, lblImpTxtFor.getY()+15);
		panel.add(btnImpTxtFor);
		
		JLabel lblImpTxtForIn = new JLabel("IMPORTAR TEXTO FOR IN");
		lblImpTxtForIn.setSize(200,10);
		lblImpTxtForIn.setLocation(20, btnImpTxtFor.getY()+50);
		panel.add(lblImpTxtForIn);
		
		JButton btnImpTxtForIn = new JButton("importar texto for in");
		btnImpTxtForIn.setSize(200,40);
		btnImpTxtForIn.setLocation(20, lblImpTxtForIn.getY()+15);
		panel.add(btnImpTxtForIn);
		
		JLabel lblImpTxtForEach = new JLabel("IMPORTAR TEXTO FOR EACH");
		lblImpTxtForEach.setSize(200,10);
		lblImpTxtForEach.setLocation(20, btnImpTxtForIn.getY()+50);
		panel.add(lblImpTxtForEach);
		
		JButton btnImpTxtForEach = new JButton("importar texto for each");
		btnImpTxtForEach.setSize(200,40);
		btnImpTxtForEach.setLocation(20, lblImpTxtForEach.getY()+15);
		panel.add(btnImpTxtForEach);
		
		JLabel lblLimpaTexto = new JLabel("LIMPA TEXTO");
		lblLimpaTexto.setSize(200,10);
		lblLimpaTexto.setLocation(20, btnImpTxtForEach.getY()+50);
		panel.add(lblLimpaTexto);
		
		JButton btnLimpaTexto = new JButton("limpa texto");
		btnLimpaTexto.setSize(200,40);
		btnLimpaTexto.setLocation(20, lblLimpaTexto.getY()+15);
		panel.add(btnLimpaTexto);
		
		JLabel lblPreferencias = new JLabel("LISTAGEM DAS PREFERÊNCIAS");
		lblPreferencias.setSize(200,10);
		lblPreferencias.setLocation(260, 10);
		panel.add(lblPreferencias);
		
		JList<String> lstbxPreferencias = new JList<String>();
		lstbxPreferencias.setBounds(240,30,220,600);
		panel.add(lstbxPreferencias);
		
		btnMensagem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Olá, Mundo!");
			}
		});
		
		btnDesvioCondicional.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(tela, "desvio condicional", "Escolha Ok ou Cancelar", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Ok");
				}
				else {
					JOptionPane.showMessageDialog(tela, "Você escolheu Cancelar");
				}
			}
		});
		
		btnDesvioCondicionalEncadeado.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(tela, "desvio condicional encadedado", "Escolha Sim, Não ou Cancelar", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(resposta == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Sim");
				}
				else if(resposta == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Não");
				}
				else {
					JOptionPane.showMessageDialog(tela, "Você escolheu Cancelar");
				}
			}
		});
		
		btnSwitchCase.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(JOptionPane.showConfirmDialog(tela, "desvio condicional encadedado", "Escolha Sim, Não ou Cancelar", JOptionPane.YES_NO_CANCEL_OPTION)) {
				case JOptionPane.YES_OPTION:
					JOptionPane.showMessageDialog(tela, "Você escolheu Sim");
					break;
				case JOptionPane.NO_OPTION:
					JOptionPane.showMessageDialog(tela, "Você escolheu Não");
					break;
				case JOptionPane.CANCEL_OPTION:
					JOptionPane.showMessageDialog(tela, "Você escolheu Cancelar");
					break;
				default:
					JOptionPane.showMessageDialog(tela, "Você escolheu Errado, Escolha Sim, Não ou Cancelar");
					break;
				}
			}
		});
		
		btnImpTxtWhile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
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
			}
		});
		
		btnImpTxtDoWhile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
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
			}
		});
		
		btnImpTxtFor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
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
			}
		});
		
		btnImpTxtForIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
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
			}
		});
		
		btnImpTxtForEach.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
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
			}
		});
		
		btnLimpaTexto.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\2. Java\\preferencias.txt");
					List<String> arrayLinhasArquivo = Files.readAllLines(file.toPath());
					
					DefaultListModel<String> modelo = new DefaultListModel<String>();
					
					int linhaArquivo = 0;
					int totalLinhas = arrayLinhasArquivo.size();
					
					modelo.clear();
					
					lstbxPreferencias.setModel(modelo);
				}
				catch(Exception ex) {
					new Exception("Erro ao Executar ->" + ex.getMessage().toString());
				}
			}
		});
		
		tela.getContentPane().add(panel, BorderLayout.CENTER);
	}
	
	

}
