package entities;

public class Produto {

	private String nome;
	private int tipo;
	
	public Produto(){
	}
	
	public Produto(String nome, int tipo) {
		this.nome = nome;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public void cadastrarProduto (String nome, int tipo){
		
	}

	
	public String toString() {
		return "nome: " + nome + ", tipo: " + tipo;
	}

}