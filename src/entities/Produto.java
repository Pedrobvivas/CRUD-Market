package entities;

import entities.enums.TipoProduto;

public class Produto {

	private String nome;
	private TipoProduto tipo;
	private int id;
	
	public Produto(){
	}
	
	
	
	public int  getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Produto(String nome, TipoProduto tipo, int id) {
		this.nome = nome;
		this.tipo = tipo;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipo() {
		return tipo;
	}

	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}


	public void cadastrarProduto (String nome, int tipo){
		
	}

	
	public String toString() {
		return "nome: " + nome + ", tipo: " + tipo + ", id: "+id;
	}

}