package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.TipoProduto;

public class Funcoes {

	private List<Produto> produtos;
	private List<Fornecedor> fornecedores;

	public Funcoes() {
		produtos = new ArrayList<>();
		fornecedores = new ArrayList<>();
	}

	public void adicionarFornecedor(int id, String razaoSocial, int cpnj) {
		Fornecedor fornecedor = new Fornecedor(id, razaoSocial, cpnj);
		fornecedores.add(fornecedor);
		System.out.println("Fornecedor adicionado com sucessor");

	}

	public void mostrarFornecedores() {
		System.out.println("Fornecedores: ");
		for (Fornecedor x : fornecedores) {
			System.out.println(x);
		}
	}

	public void mostrarProdutosEFornecedores() {
		System.out.println("Fornecedores: ");
		for (Fornecedor x : fornecedores) {
			System.out.println(x);
		}
		System.out.println("Produtos: ");
		for (Produto y : produtos) {
			System.out.println(y);
		}

	}

	public void adicionarProduto(String nome, TipoProduto tipo, int id) {
		Produto produto = new Produto(nome, tipo, id);
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso! ");
	}

	public void mostrarProdutos() {
		System.out.println("Produtos: ");
		for (Produto x : produtos)
			System.out.println(x);
	}

	public void deletarProduto(String nome, TipoProduto tipo, int id) {
		Produto produto = new Produto(nome, tipo, id);
		produtos.remove(produto);
		System.out.println("Produto removido");
	}

	public void deletarFornecedor(int id) {
		Fornecedor fornecedor = new Fornecedor(id);
		fornecedores.remove(fornecedor);
		System.out.println("Fornecedor removido");
	}

	public Produto buscarProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null;

	}

	public void editarProduto(String nomeAntigo, String nomeNovo, int id, TipoProduto novoTipo) {
		Produto produto = buscarProduto(nomeAntigo);
		if (produto != null) {
			produto.setNome(nomeNovo);
			produto.setId(id);
			produto.setTipo(novoTipo);
		}
	}

	public Fornecedor buscarFornecedor(String razaoSocial) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getRazaosocial().equals(razaoSocial)) {
				return fornecedor;
			}
		}
		return null;

	}

	public void editarFornecedor(String razaoSocialAntiga, String razaoSocialNova, int id, int cnpj) {
		Fornecedor fornecedor = buscarFornecedor(razaoSocialAntiga);
		if (fornecedor != null) {
			fornecedor.setRazaosocial(razaoSocialNova);
			fornecedor.setId(id);
			fornecedor.setCnpj(cnpj);
		}
	}

}