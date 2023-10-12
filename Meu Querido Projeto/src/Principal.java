import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	
		GerenciaAluno ga = new GerenciaAluno();
		GerenciaProfessor gp = new GerenciaProfessor();

		int num;		
	do{
		num = Integer.parseInt(
				JOptionPane.showInputDialog(
						"escolha uma opção: " +
				"\n1 - Cadastrar aluno" +
				"\n2 - Cadastrar Professor" +
				"\n5 - Mostar Aluno" +
				"\n0 - Sair"));
  
	switch(num) {
	case 1:
		ga.CadastrarAluno();
		break;
	case 2:
		gp.CadastrarProfessor();
		break;
	case 5:
		ga.mostrarAluno();
		break;
	}
	} while( num != 0);
}
}