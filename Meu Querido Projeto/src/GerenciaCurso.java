import javax.swing.JOptionPane;

public class GerenciaCurso {

	 Curso cr = new Curso();
	 
public void CadastrarCurso(){
	
	 cr.setMateria(JOptionPane.showInputDialog(
			 "Digite a materia do Curso: "));
	 
	 cr.setProfessorCurso(JOptionPane.showInputDialog(
			 "Digite o Professor do Curso: "));

	 cr.setTurma(JOptionPane.showInputDialog(
			 "Digite a turma do Curso: "));
	 
}
	
}
