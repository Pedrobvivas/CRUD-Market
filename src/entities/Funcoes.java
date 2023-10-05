package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entities.enums.TipoProduto;

public class Funcoes {

	private List<Produto> produtos;
	private List<Fornecedor> fornecedores;
	private String prodAtual;

	public Funcoes() {
		produtos = new ArrayList<>();
		fornecedores = new ArrayList<>();
	}

	public int idFornecedorEncontrado(String razaoSocial) {
		int idFornecedor = 0;
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getRazaosocial().equals(razaoSocial)) {
				idFornecedor = fornecedor.getId();
			}
		}
		return idFornecedor;
	}

	public Boolean buscaFornecedorNome(String nome) {
		Boolean found = false;
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getRazaosocial().equals(nome)) {
				found = true;
			}
		}
		return found;
	}

	public void adicionarFornecedor(String razaoSocial, int cpnj) {
		Fornecedor fornecedor = new Fornecedor(razaoSocial, cpnj);
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

	public void adicionarProduto(String nome, TipoProduto tipo, int idFornecedor, int idProduto) {
		Produto produto = new Produto(nome, tipo, idFornecedor, idProduto);
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso! ");
	}

	public void mostrarProdutos() {
		System.out.println("Produtos: ");
		for (Produto x : produtos)
			System.out.println(x);
	}

	public boolean deletarFornecedor(int id) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getId() == id) {	
				for(Produto produto : produtos) {
					if(produto.getIdFornecedor()==fornecedor.getId()) {
						System.out.println("Não é possivel remover fornecedor pois possui produtos cadastrados.");
						return false;
					}
				}
				fornecedores.remove(fornecedor);
				System.out.println("Fornecedor removido");
				return true;
			}
		}
		return false;
	}

	public boolean deletarProduto(int idProduto) {
		for (Produto produto : produtos) {
			if (produto.getIdProduto() == idProduto) {
				produtos.remove(produto);
				System.out.println("Produto removido");
				return true;
			}
		}
		System.out.println("Produto nao encontrado");
		return false;

	}

	public Produto buscarProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				return produto;
			}
		}
		return null;

	}

	public Fornecedor buscarFornecedor(String razaoSocial) {
		for (Fornecedor fornecedor : fornecedores) {
			if (fornecedor.getRazaosocial().equals(razaoSocial)) {
				return fornecedor;
			}
		}
		return null;
	}

	public void editarProduto(String nomeAntigo, String nomeNovo, TipoProduto novoTipo) {
		Produto produto = buscarProduto(nomeAntigo);
		if (produto != null) {
			produto.setNome(nomeNovo);
			produto.setTipo(novoTipo);
		}
	}

	public void mostrarProdutosPorTipo() {
		Map<TipoProduto, List<Produto>> produtosPorTipo = new HashMap<>();

		for (Produto produto : produtos) {
			TipoProduto tipo = produto.getTipo();
			produtosPorTipo.putIfAbsent(tipo, new ArrayList<>());
			produtosPorTipo.get(tipo).add(produto);
		}

		System.out.println("Produtos por Tipo:");
		for (TipoProduto tipo : produtosPorTipo.keySet()) {
			List<Produto> produtosDoTipo = produtosPorTipo.get(tipo);

			System.out.println(tipo + ":");
			for (Produto produto : produtosDoTipo) {
				System.out.println("- " + produto);
			}
		}
	}

	public void fornecedoresPorProduto() {
		for (Fornecedor fornecedor : fornecedores) {
			System.out.println(fornecedor.getRazaosocial());
			for (Produto produto : produtos) {
				if (fornecedor.getId() == produto.getIdFornecedor()) {
					System.out.println(produto.getNome());
				}
			}
		}
	}

	public String buscarFornecedorProduto(String nome) {
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				for (Fornecedor fornecedor : fornecedores) {
					if (produto.getIdFornecedor() == fornecedor.getId()) {
						return fornecedor.getRazaosocial();
					}
				}
			}
		}
		return "Produto não encontrado";
	}

	public void editarFornecedor(String razaoSocialAntiga, String razaoSocialNova, int cnpj) {
		Fornecedor fornecedor = buscarFornecedor(razaoSocialAntiga);
		fornecedor.setRazaosocial(razaoSocialNova);
		fornecedor.setCnpj(cnpj);
	}

	public Boolean buscaProdutoNome(String nome) {
		Boolean found = false;
		for (Produto produto : produtos) {
			if (produto.getNome().equals(nome)) {
				found = true;
			}
		}
		return found;
	}
}
