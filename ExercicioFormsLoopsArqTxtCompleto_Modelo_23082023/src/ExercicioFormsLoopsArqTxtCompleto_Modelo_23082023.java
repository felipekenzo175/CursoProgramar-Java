import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.DefaultListModel;

import java.util.List;
//import java.util.Scanner;
//import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
import java.nio.file.Files;
//import java.io.BufferedReader;
import java.io.File;
//import java.io.InputStream;

public class ExercicioFormsLoopsArqTxtCompleto_Modelo_23082023 {

	public static void main(String[] args) {
		criarTela();
	}
	
	public static void criarTela() {
		JFrame tela = new JFrame();
		
		tela.setTitle("Tela de Botões");
		
		tela.setVisible(true);
		
		tela.setSize(500, 700);
		
		tela.setLocationRelativeTo(null);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		criarInterfaceDoUsuario(tela);
	}
	
	/**
	 * @param tela
	 */
	public static void criarInterfaceDoUsuario(JFrame tela) {
		LayoutManager layout = new FlowLayout();
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel lblMensagem = new JLabel("MENSAGEM");
		
		lblMensagem.setSize(200,10);
		lblMensagem.setLocation(20, 10);
		
		JButton btnMensagem = new JButton("mensagem");
		
		btnMensagem.setSize(lblMensagem.getWidth(),lblMensagem.getHeight()+30);
		btnMensagem.setLocation(lblMensagem.getX(), lblMensagem.getY()+15);
		
		JLabel lblDesvCond = new JLabel("DESVIO CONDICIONAL");
		
		lblDesvCond.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblDesvCond.setLocation(lblMensagem.getX(), btnMensagem.getY()+50);
		
		JButton btnDesvCond = new JButton("desvio condicional");
		
		btnDesvCond.setSize(btnMensagem.getWidth(),btnMensagem.getHeight());
		btnDesvCond.setLocation(btnMensagem.getX(), lblDesvCond.getY()+15);
		
		JLabel lblDesvCondAninhado = new JLabel("DESVIO CONDICIONAL ANINHADO");
		
		lblDesvCondAninhado.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblDesvCondAninhado.setLocation(lblMensagem.getX(), btnDesvCond.getY()+50);
		
		JButton btnDesvCondAninhado = new JButton("desvio condicional aninhado");
		
		btnDesvCondAninhado.setSize(btnMensagem.getWidth(),btnMensagem.getHeight());
		btnDesvCondAninhado.setLocation(btnMensagem.getX(), lblDesvCondAninhado.getY()+15);
		
		JLabel lblSwitchCase = new JLabel("SWITCH CASE");
		
		lblSwitchCase.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblSwitchCase.setLocation(lblMensagem.getX(), btnDesvCondAninhado.getY()+50);
		
		JButton btnSwitchCase = new JButton("switch case");
		
		btnSwitchCase.setSize(btnMensagem.getWidth(),btnMensagem.getHeight());
		btnSwitchCase.setLocation(btnMensagem.getX(), lblSwitchCase.getY()+15);
		
		JLabel lblImpTxtWhile = new JLabel("IMPORTAR TEXTO WHILE");
		
		lblImpTxtWhile.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtWhile.setLocation(lblMensagem.getX(),  btnSwitchCase.getY()+50);
		
		JButton btnImpTxtWhile = new JButton("importar texto while");
		
		btnImpTxtWhile.setSize(btnMensagem.getWidth(),btnMensagem.getHeight());
		btnImpTxtWhile.setLocation(btnMensagem.getX(), lblImpTxtWhile.getY()+15);
		
		JLabel lblImpTxtDoWhile = new JLabel("IMPORTAR TEXTO DO WHILE");
		
		lblImpTxtDoWhile.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtDoWhile.setLocation(lblImpTxtWhile.getX(), btnImpTxtWhile.getY()+50);
		
		JButton btnImpTxtDoWhile = new JButton("importar texto Do while");
		
		btnImpTxtDoWhile.setSize(btnImpTxtWhile.getWidth(), btnImpTxtWhile.getHeight());
		btnImpTxtDoWhile.setLocation(20, lblImpTxtDoWhile.getY()+15);
		
		JLabel lblImpTxtFor = new JLabel("IMPORTAR TEXTO FOR");
		
		lblImpTxtFor.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtFor.setLocation(lblImpTxtDoWhile.getX(), btnImpTxtDoWhile.getY()+50);
		
		JButton btnImpTxtFor = new JButton("importar texto For");
		
		btnImpTxtFor.setSize(btnImpTxtDoWhile.getWidth(), btnImpTxtDoWhile.getHeight());
		btnImpTxtFor.setLocation(20, lblImpTxtFor.getY()+15);
		
		JLabel lblImpTxtForIn = new JLabel("IMPORTAR TEXTO FOR IN LISTA");
		
		lblImpTxtForIn.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtForIn.setLocation(lblImpTxtFor.getX(), btnImpTxtFor.getY()+50);
		
		JButton btnImpTxtForIn = new JButton("importar texto For In Coleção");
		
		btnImpTxtForIn.setSize(btnImpTxtFor.getWidth(), btnImpTxtFor.getHeight());
		btnImpTxtForIn.setLocation(20, lblImpTxtForIn.getY()+15);
		
		JLabel lblImpTxtForEach = new JLabel("IMPORTAR TEXTO FOREACH LAMBDA");
		
		lblImpTxtForEach.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtForEach.setLocation(lblImpTxtForIn.getX(), btnImpTxtForIn.getY()+50);
		
		JButton btnImpTxtForEach = new JButton("importar texto ForEach lambda");
		
		btnImpTxtForEach.setSize(btnImpTxtForIn.getWidth(), btnImpTxtForIn.getHeight());
		btnImpTxtForEach.setLocation(20, lblImpTxtForEach.getY()+15);
		
		JLabel lblImpTxtLimpa = new JLabel("LIMPAR A LIST BOX");
		
		lblImpTxtLimpa.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblImpTxtLimpa.setLocation(lblMensagem.getX(), btnImpTxtForEach.getY()+50);
		
		JButton btnImpTxtLimpa = new JButton("Limpar a List Box");
		
		btnImpTxtLimpa.setSize(btnMensagem.getWidth(),btnMensagem.getHeight());
		btnImpTxtLimpa.setLocation(btnMensagem.getX(), lblImpTxtLimpa.getY()+15);
		
		JLabel lblPreferencias = new JLabel("LISTAGEM DAS PREFERÊNCIAS");
		
		lblPreferencias.setSize(lblMensagem.getWidth(), lblMensagem.getHeight());
		lblPreferencias.setLocation(lblMensagem.getWidth()+40,lblMensagem.getY());
		
		JList<String> lstbxPreferencias = new JList<String>();
		
		/*
		 * lstbxPreferencias.setSize(220,300); 
		 * lstbxPreferencias.setLocation(240,85);
		 */
		lstbxPreferencias.setBounds(btnMensagem.getX()+220,
				btnMensagem.getY(), 
				btnMensagem.getWidth()+20, 
				btnMensagem.getHeight()+560);
		
		btnMensagem.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Olá, Mundo!");
			}
		});
		
		btnDesvCond.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(tela, "desvio condicional", "Escolha Ok ou Cancelar",
						JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Ok");
				}
				else {
					JOptionPane.showMessageDialog(tela, "Você escolheu Cancelar");
				}
			}
		});
		
		btnDesvCondAninhado.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				int resultado = JOptionPane.showConfirmDialog(tela, "desvio condicional aninhado", "Escolha Sim, Não ou Cancelar",
						JOptionPane.YES_NO_CANCEL_OPTION);
				if(resultado == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Sim");
				}
				else if(resultado == JOptionPane.NO_OPTION) {
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
				switch(JOptionPane.showConfirmDialog(tela, "desvio condicional aninhado", "Escolha Sim, Não ou Cancelar",
						JOptionPane.YES_NO_CANCEL_OPTION)) {
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
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					int totalLnhasDoArquivo = arrayLinhasDoArquivo.size();
					int linhaDoArquivo = 0;
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();
					
					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					modelo.clear();

					while(linhaDoArquivo < totalLnhasDoArquivo) {
						modelo.addElement(arrayLinhasDoArquivo.get(linhaDoArquivo));
						linhaDoArquivo++;
					}
					
					lstbxPreferencias.setModel(modelo);
					
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto While - " + ex.getMessage().toString());
				}
			}
		});
		
		btnImpTxtDoWhile.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					int totalLnhasDoArquivo = arrayLinhasDoArquivo.size();
					int linhaDoArquivo = 0;
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();

					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					modelo.clear();

					do {
						modelo.addElement(arrayLinhasDoArquivo.get(linhaDoArquivo));
						linhaDoArquivo++;
					} while(linhaDoArquivo < totalLnhasDoArquivo);
					
					lstbxPreferencias.setModel(modelo);
					
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto Do While - " + ex.getMessage().toString());
				}
			}
		});
		
		btnImpTxtFor.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();
					
					modelo.clear();

					for (int linhaDoArquivo = 0; linhaDoArquivo < arrayLinhasDoArquivo.size(); linhaDoArquivo++) {
						modelo.addElement(arrayLinhasDoArquivo.get(linhaDoArquivo));
					}
					
					lstbxPreferencias.setModel(modelo);
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto FOR - " + ex.getMessage().toString());
				}
			}
		});
		
		btnImpTxtForIn.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();
					
					modelo.clear();

					for (String linhaDoArquivo : arrayLinhasDoArquivo) {
						modelo.addElement(linhaDoArquivo);
					}
					
					lstbxPreferencias.setModel(modelo);
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto FOR - " + ex.getMessage().toString());
				}
			}
		});
		
		btnImpTxtForEach.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();
					
					modelo.clear();

					arrayLinhasDoArquivo.forEach(linhaDoArquivo -> {
						modelo.addElement(linhaDoArquivo);
					});
					
					lstbxPreferencias.setModel(modelo);
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto FOR - " + ex.getMessage().toString());
				}
			}
		});
		
		btnImpTxtLimpa.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				//String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
				try {
					File file = new File("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt");
					List<String> arrayLinhasDoArquivo = 
					Files.readAllLines(file.toPath());
					
					//((DefaultListModel<String>)(lstbxPreferencias.getModel())).clear();
					
					DefaultListModel<String> modelo =
							new DefaultListModel<String>();
					
					modelo.clear();

					lstbxPreferencias.setModel(modelo);
				} catch (Exception ex) {
					new Exception("Erro no Importar Texto FOR - " + ex.getMessage().toString());
				}
			}
		});
		
		panel.add(btnMensagem);
		panel.add(lblMensagem);
		panel.add(btnDesvCond);
		panel.add(lblDesvCond);
		panel.add(btnDesvCondAninhado);
		panel.add(lblDesvCondAninhado);
		panel.add(btnSwitchCase);
		panel.add(lblSwitchCase);
		panel.add(lstbxPreferencias);
		panel.add(lblPreferencias);
		panel.add(btnImpTxtWhile);
		panel.add(lblImpTxtWhile);
		panel.add(btnImpTxtDoWhile);
		panel.add(lblImpTxtDoWhile);
		panel.add(btnImpTxtFor);
		panel.add(lblImpTxtFor);
		panel.add(btnImpTxtForIn);
		panel.add(lblImpTxtForIn);
		panel.add(btnImpTxtForEach);
		panel.add(lblImpTxtForEach);
		panel.add(btnImpTxtLimpa);
		panel.add(lblImpTxtLimpa);
		
		tela.getContentPane().add(panel, BorderLayout.CENTER);
	}
}
