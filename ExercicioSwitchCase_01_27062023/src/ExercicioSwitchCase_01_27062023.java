import javax.swing.JOptionPane;

public class ExercicioSwitchCase_01_27062023 {

	public static void main(String[] args) {
		switch (JOptionPane.showConfirmDialog(null, "Escolha Sim, Não ou Cancelar", "Switch Case", JOptionPane.YES_NO_CANCEL_OPTION)) {
			case JOptionPane.YES_OPTION : 
				JOptionPane.showMessageDialog(null, "Você Escolheu Sim"); 
				break;
			case JOptionPane.NO_OPTION : 
				JOptionPane.showMessageDialog(null, "Você Escolheu Não"); 
				break;
			case JOptionPane.CANCEL_OPTION : 
				JOptionPane.showMessageDialog(null, "Você Escolheu Cancelar"); 
				break;
			default : 
				JOptionPane.showMessageDialog(null, "Você Escolheu Errado, Escolha Sim, Não ou Cancelar");
		}
	}

}
