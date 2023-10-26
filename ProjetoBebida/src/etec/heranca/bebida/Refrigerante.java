package etec.heranca.bebida;


import javax.swing.JOptionPane;
public class Refrigerante extends Bebida{

	private boolean retornavel;
	
	public Refrigerante() {
		
		super();
} 
public Refrigerante 
	(String nome, double preco, boolean retornavel) {
	super(nome, preco);
	this.retornavel = retornavel; 
	
}

public boolean isRetornavel(){
	return retornavel;
}
 public void setRetornavel(boolean retornavel) {
	 this.retornavel = retornavel;
	 
	 
 }
 
 String mostrarBebida() {
	 String = resposta "";
	 String  = retorna "";
	 
	 if(this.isRetornavel() == true ) {
		 retorna = "Sim"; 
	 }else {
		 retorna = "Não";
	 }
	 
	 resposta = ("Seguem abaixo os dados do refrigerante: " + 
	 "\nNome = " + this.getNome() +
	 "\nPreco = " + this.getPreco());
	 return resposta;
	 
	 boolean verificarPreco(double preco) {
		 if (preco < 5){
			 return true;
		 }else {
			 return false;
		 }
	 } 
 }
}
