import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		GerenciaAluno ga = new GerenciaAluno();
		GerenciaProfessor gp = new GerenciaProfessor();
		GerenciaTurma gt = new GerenciaTurma();
		GerenciaCurso gc = new GerenciaCurso();

		int num;		
	do{
		num = Integer.parseInt(
				JOptionPane.showInputDialog(
						"escolha uma opção: " +
				"\n1 - Cadastrar aluno" +
				"\n2 - Cadastrar Professor" +
				"\n3 - Cadastrar Turma" +
				"\n4 - Cadastrar Curso " +
				"\n5 - Mostar Aluno" +
				"\n0 - Sair"));
  
	switch(num) {
	case 1:
		ga.CadastrarAluno();
		break;
	case 2:
		gp.CadastrarProfessor();
		break;
	case 3:
		gt.CadastrarTurma();
		break;
	case 4:
		gc.CadastrarCurso();
		break;
	case 5:
		ga.mostrarAluno();
		break;
	}
	} while( num != 0);
}
}