package etec.heranca.bebida;

	public abstract class Bebida {

	private String nome;
	private double preco;

	public Bebida() {
	this("", 0);
}
	public Bebida(String nome, Double preco) {
		this.nome=nome;
		this.preco=preco;
}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	abstract String mostrarBedida();
	abstract boolean VerificarPreco(double);
	}
	