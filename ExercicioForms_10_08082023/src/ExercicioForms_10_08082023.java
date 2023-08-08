import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class ExercicioForms_10_08082023 {

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
		
		//Mensagem
		JLabel lblMensagem = new JLabel("Mensagem");
		
		lblMensagem.setSize(200, 10);
		lblMensagem.setLocation(140, 70);
		
		JButton btnMensagem = new JButton("mensagem");
		
		btnMensagem.setSize(200, 40);
		btnMensagem.setLocation(140, 85);
		
		//Desvio Condicional
		
		JLabel lblDesvCond = new JLabel("Desvio Condicional");
		
		lblDesvCond.setSize(200, 10);
		lblDesvCond.setLocation(140, 135);
		
		JButton btnDesvCond = new JButton("desvio condicional");
		
		btnDesvCond.setSize(200, 40);
		btnDesvCond.setLocation(140, 150);
		
		//Desvio Condicional Aninhado
		JLabel lblDesvCondAninhado = new JLabel("Desvio Condicional Aninhado");
		
		lblDesvCondAninhado.setSize(200, 10);
		lblDesvCondAninhado.setLocation(140, 205);
		
		JButton btnDesvCondAninhado = new JButton("desvio condicional aninhado");
		
		btnDesvCondAninhado.setSize(200, 40);
		btnDesvCondAninhado.setLocation(140, 220);
		
		//Switch Case
		JLabel lblSwitchCase = new JLabel("Switch Case");
		
		lblSwitchCase.setSize(200, 10);
		lblSwitchCase.setLocation(140, 270);
		
		JButton btnSwitchCase = new JButton("switch case");
		
		btnSwitchCase.setSize(200, 40);
		btnSwitchCase.setLocation(140, 285);
		
		//Programação de Eventos
		
		btnMensagem.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(tela, "Olá, Mundo");
			}
		});
		
		btnDesvCond.addActionListener(new ActionListener() {
			@Override
			
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(tela, "Escolha Ok ou Cancelar", "desvio condicional",
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
				int mensagem = JOptionPane.showConfirmDialog(tela, "Escolha Sim, Não ou Cancelar", "desvio condicional aninhado",
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
				switch(JOptionPane.showConfirmDialog(tela, "Escolha Sim, Não ou Cancelar", "desvio condicional aninhado",
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
		panel.add(lblMensagem);
		panel.add(btnDesvCondAninhado);
		panel.add(lblDesvCondAninhado);
		panel.add(btnDesvCond);
		panel.add(btnSwitchCase);
		panel.add(lblSwitchCase);
		panel.add(lblDesvCond);
		
		tela.getContentPane().add(panel, BorderLayout.CENTER);
		
	}
	
	
	

}
