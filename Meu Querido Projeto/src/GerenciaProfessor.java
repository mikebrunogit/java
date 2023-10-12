import javax.swing.JOptionPane;

public class GerenciaProfessor {

	Professor pf = new Professor();
	
public void CadastrarProfessor() {
	
	 pf.setNome(JOptionPane.showInputDialog(
			 "Digite o nome do profesor: "));

pf.setRegistroGeral(JOptionPane.showInputDialog(
				 "Digite o RG do professor: "));
						 
			
pf.setRegistroMatricula(JOptionPane.showInputDialog(
				 "Digite o Registro de Matricula do professor: "));

}
}
