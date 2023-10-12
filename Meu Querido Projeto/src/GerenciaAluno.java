import javax.swing.JOptionPane;

public class GerenciaAluno {

 Aluno al = new Aluno();
 
 public void CadastrarAluno() {
	 
	 al.setNome (JOptionPane.showInputDialog(
			 "Digite o nome do aluno: "));

	 al.setEmailSed (JOptionPane.showInputDialog(
			 "Digite o Email do aluno: "));
	 
	 al.setCadPessoaFisica (JOptionPane.showInputDialog(
			 "Digite o CPF do aluno: "));
	 
	 al.setRegistroGeral(JOptionPane.showInputDialog(
			 "Digite o RG do aluno: "));
	 
	 al.setCep (JOptionPane.showInputDialog(
			 "Digite o CEP do aluno: "));
 
	 al.setCursoQestuda(JOptionPane.showInputDialog(
			 "Digite o curso que o aluno estudo: "));
	 
	 al.setDataNascimento(JOptionPane.showInputDialog(
			 "Digite a data de nascimento do aluno: "));
	 
	 al.setNomePai(JOptionPane.showInputDialog(
			 "Digite o nome do Pai do aluno: "));
 
	 al.setNomeMae(JOptionPane.showInputDialog(
			 "Digite o nome da Mãe aluno: "));
 
	 al.setEmailPai(JOptionPane.showInputDialog(
			 "Digite o Email do Pai do aluno: "));
 
	 al.setEmailMae(JOptionPane.showInputDialog(
			 "Digite o Email Mãe aluno: "));
	 
	 al.setNumeroResidencial(JOptionPane.showInputDialog(
			 "Digite o número residencial do aluno: "));
	 
	 al.setRegistroMatricula(JOptionPane.showInputDialog(
			 "Digite o Registro de matricula do aluno: "));
	 
	 al.setIdade (Integer.parseInt(JOptionPane.showInputDialog(
			 "Digite a idade do aluno: ")));
	 
	 al.setAltura (Float.parseFloat(JOptionPane.showInputDialog(
			 "Digite a altura do aluno: ")));
 }
	 public void mostrarAluno(){
		 JOptionPane.showMessageDialog(null, 
				 "Nome do aluno:" + al.getNome());
		 
		 JOptionPane.showMessageDialog(null, 
				 "Idade do aluno:" + al.getIdade());
	 }
	 
	 
 }
 
