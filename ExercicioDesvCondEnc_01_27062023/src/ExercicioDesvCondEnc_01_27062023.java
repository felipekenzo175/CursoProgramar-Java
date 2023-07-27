import javax.swing.JOptionPane;

public class ExercicioDesvCondEnc_01_27062023 {

	public static void main(String[] args) {
		int mensagem = JOptionPane.showConfirmDialog(null, "Escolha Sim, Não ou Cancelar", "Desvio Condicional", JOptionPane.YES_NO_CANCEL_OPTION);
		if( mensagem == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Você Escolheu Sim");
		}
		else if(mensagem == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Você Escolheu Não");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você Escolheu Cancelar");
		}
	}
}
