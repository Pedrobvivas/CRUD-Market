package entities;

import java.util.ArrayList;
import java.util.List;


public class Funcoes {

	private List<Produto> produtos;
	private List<Fornecedor> fornecedores;
	


	public Funcoes() {
		produtos = new ArrayList<>();
		fornecedores = new ArrayList<>();
	}
	
	public void adicionarFornecedor(int id, String razaoSocial, int cpnj) {
		Fornecedor fornecedor=new Fornecedor(id,razaoSocial,cpnj);
		fornecedores.add(fornecedor);
		System.out.println("Fornecedor adicionado com sucessor");
		
	}
	
	public void mostrarFornecedores() {
		System.out.println("Fornecedores: ");
		for(Fornecedor x : fornecedores) {
			System.out.println(x);
		}
	}
	
	public void adicionarProduto(String nome, int tipo){
		Produto produto=new Produto(nome,tipo);
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso! ");
	}
	
	public void mostrarProdutos(){
		System.out.println("Produtos: ");
		 for (Produto x : produtos)
				System.out.println(x);		 
	}

	public void deletarProduto(String nome,int tipo){
		Produto produto=new Produto(nome,tipo);
		produtos.remove(produto);
		System.out.println("Produto removido");
	}

	public void deletarFornecedor(int id) {
		Fornecedor fornecedor=new Fornecedor(id);
		fornecedores.remove(fornecedor);
		System.out.println("Fornecedor removido");
	}
	
}