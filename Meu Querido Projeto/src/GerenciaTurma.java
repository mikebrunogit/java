import javax.swing.JOptionPane;

public class GerenciaTurma{

	Turma tm = new Turma(); 
	
	public void CadastrarTurma() {
		tm.setNomeTurma(JOptionPane.showInputDialog(
				 "Digite o nome da turma "));
		
		tm.setNumeroTurma(JOptionPane.showInputDialog(
				 "Digite o numero da turma "));
		
		tm.setAlunosTurma(JOptionPane.showInputDialog(
				 "Digite o numero da turma "));
	
	
}
}
