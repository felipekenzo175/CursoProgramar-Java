import javax.swing.JOptionPane;

public class ExercicioDesvCond_01_27062023 {

	public static void main(String[] args) {
		if(JOptionPane.showConfirmDialog(null, "Escolha OK ou Cancelar", "Desvio Condicional", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
			JOptionPane.showMessageDialog(null, "Você clicou OK");
		}
		else {
			JOptionPane.showMessageDialog(null, "Você clicou Cancelar");
		}

}
}
