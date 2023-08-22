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
import java.util.Scanner;
import java.io.FileReader;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStream;

public class ExercicioForms_11_22082023 {

	public static void main(String[] args) {
		criarTela();
	}
	
	public static void criarTela() {
		JFrame tela = new JFrame();
		
		criarInterfaceDoUsuario(tela);
		
		tela.setTitle("Tela de Botões");
		
		tela.setVisible(true);
		
		tela.setSize(500, 500);
		
		tela.setLocationRelativeTo(null);
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void criarInterfaceDoUsuario(JFrame tela) {
		LayoutManager layout = new FlowLayout();
		
		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		JLabel lblMensagem = new JLabel("MENSAGEM");
		
		lblMensagem.setSize(200,10);
		lblMensagem.setLocation(20, 70);
		
		JButton btnMensagem = new JButton("mensagem");
		
		btnMensagem.setSize(200,40);
		btnMensagem.setLocation(20, 85);
		
		JLabel lblDesvCond = new JLabel("DESVIO CONDICIONAL");
		
		lblDesvCond.setSize(200,10);
		lblDesvCond.setLocation(20, 135);
		
		JButton btnDesvCond = new JButton("desvio condicional");
		
		btnDesvCond.setSize(200,40);
		btnDesvCond.setLocation(20, 150);
		
		JLabel lblDesvCondAninhado = new JLabel("DESVIO CONDICIONAL ANINHADO");
		
		lblDesvCondAninhado.setSize(200,10);
		lblDesvCondAninhado.setLocation(20, 200);
		
		JButton btnDesvCondAninhado = new JButton("desvio condicional aninhado");
		
		btnDesvCondAninhado.setSize(200,40);
		btnDesvCondAninhado.setLocation(20, 215);
		
		JLabel lblSwitchCase = new JLabel("SWITCH CASE");
		
		lblSwitchCase.setSize(200,10);
		lblSwitchCase.setLocation(20, 265);
		
		JButton btnSwitchCase = new JButton("switch case");
		
		btnSwitchCase.setSize(200,40);
		btnSwitchCase.setLocation(20, 280);
		
		JLabel lblImpTxtWhile = new JLabel("IMPORTAR TEXTO WHILE");
		
		lblImpTxtWhile.setSize(200,10);
		lblImpTxtWhile.setLocation(20, 325);
		
		JButton btnImpTxtWhile = new JButton("importar texto while");
		
		btnImpTxtWhile.setSize(200,40);
		btnImpTxtWhile.setLocation(20, 340);
		
		JLabel lblPreferencias = new JLabel("LISTAGEM DAS PREFERÊNCIAS");
		
		lblPreferencias.setSize(200,10);
		lblPreferencias.setLocation(240,70);
		
		JList lstbxPreferencias = new JList();
		
		lstbxPreferencias.setSize(220,300);
		lstbxPreferencias.setLocation(240,85);
		
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
				String strTexto = new Scanner(new InputStream("C:\\CURSO PROGRAMAR\\JAVA\\preferencias.txt"), "UTF-8").userDelimiter("\\A");
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
		
		tela.getContentPane().add(panel, BorderLayout.CENTER);
	}

}
