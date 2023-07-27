import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JList;

public class TesteForms_06_25072023 {

	public static void main(String[] args) {
		criarTela();

	}
	
	public static void criarTela() {
		
		JFrame tela = new JFrame();
		
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		criarInterfaceDoUsuario(tela);
		
		tela.setSize(500,500);
		
		tela.setVisible(true);
		
		tela.setTitle("Tela de Botões");
		
		tela.setLocationRelativeTo(null);
	}
	
	public static void criarInterfaceDoUsuario(final JFrame tela) {
		JPanel panel = new JPanel();
		
		LayoutManager layout = new FlowLayout();
		
		panel.setLayout(null);
		
		JList lista = new JList();
		
		lista.setSize(200, 150);
		lista.setLocation(260, 20);
		
		JButton btnMensagem = new JButton("mensagem");
		
		btnMensagem.setSize(250, 40);
		btnMensagem.setLocation(10, 20);
		
		JLabel lblMensagem = new JLabel("mensagem");
		
		lblMensagem.setSize(250,10);
		lblMensagem.setLocation(10, 10);
		
		JButton btnDesvCond = new JButton("desvio condicional");
		
		btnDesvCond.setSize(250,40);
		btnDesvCond.setLocation(10, 80);
		
		JLabel lblDesvCond = new JLabel("desvio condicional");
		
		lblDesvCond.setSize(250,10);
		lblDesvCond.setLocation(10, 70);
		
		JButton btnDesvCondAninhado = new JButton("desvio condicional aninhado");
		
		btnDesvCondAninhado.setSize(250,40);
		btnDesvCondAninhado.setLocation(10, 140);
		
		JLabel lblDesvCondAninhado = new JLabel("desvio condicional aninhado");
		
		lblDesvCondAninhado.setSize(250,10);
		lblDesvCondAninhado.setLocation(10, 130);
		
		JButton btnSwitchCase = new JButton("switch case");
		
		btnSwitchCase.setSize(250,40);
		btnSwitchCase.setLocation(10, 200);
		
		JLabel lblSwitchCase = new JLabel("switch case");
		
		lblSwitchCase.setSize(250,10);
		lblSwitchCase.setLocation(10, 190);
		
		btnMensagem.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Olá, Mundo!");
			}
		});
		
		btnDesvCond.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(tela, "Escolha Ok ou Cancelar", "Desvio Condicional",
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
				int mensagem = JOptionPane.showConfirmDialog(tela, "Escolha Sim, Não ou Cancelar", "Desvio Condicional",
						JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(mensagem == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(tela, "Você escolheu Sim");
				}
				else if(mensagem == JOptionPane.NO_OPTION) {
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
				switch(JOptionPane.showConfirmDialog(tela, "Escolha Sim, Não ou Cancelar", "Desvio Condicional",
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
		
		panel.add(btnMensagem);
		panel.add(btnSwitchCase);
		panel.add(lblSwitchCase);
		panel.add(lblMensagem);
		panel.add(btnDesvCond);
		panel.add(lblDesvCond);
		panel.add(btnDesvCondAninhado);
		panel.add(lblDesvCondAninhado);
		
		tela.getContentPane().add(panel, BorderLayout.CENTER);
	}
}
