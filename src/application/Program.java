package application;

import java.util.Scanner;

import entities.Funcoes;
import entities.enums.TipoProduto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcoes funcao = new Funcoes();
		int x;
		do {
			System.out.println("=====================Bem-vindo ao Vivas Market=============================");
			System.out.println("Selecione o que deseja fazer: ");
			System.out.println(
					"1- Realizar cadastro \n2- Realizar atualização \n3- Realizar exclusão \n4- Gerar relatório \n5- Sair");
			x = sc.nextInt();
			sc.nextLine();
			char numero = String.valueOf(x).charAt(0);
			switch (numero) {
			case '1':
				System.out.println("Você selecionou 1, selecione o que deseja cadastrar:");
				System.out.println("1- Cadastrar produto \n2- Cadastrar fornecedor");
				int y = sc.nextInt();
				sc.nextLine();
				switch (y) {
				case 1:
					System.out.print("Você selecionou produto, digite o nome do produto: ");
					String nome = sc.nextLine();
					System.out.print("Digite o tipo: ");
					TipoProduto tipo = TipoProduto.valueOf(sc.next().toUpperCase());
					System.out.print("Informe o nome do fornecedor: ");
					String razaoSocial=sc.nextLine();
					if(funcao.buscaFornecedorNome(razaoSocial)) {
						funcao.adicionarProduto(nome, tipo, funcao.idFornecedorEncontrado(razaoSocial));
					}
					
					break;
				case 2:
					System.out.print("Você selecionou fornecedor");
					System.out.print("Digite a razão social: ");
					razaoSocial = sc.nextLine();
					System.out.print("Digite o CNPJ: ");
					int cnpj = sc.nextInt();
					funcao.adicionarFornecedor(razaoSocial, cnpj);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				break;
			case '2':
				System.out.println("Você selecionou 2, selecione o que deseja atualizar:");
				System.out.println("1- Atualizar produto \n2- Atualizar fornecedor");
				y = sc.nextInt();
				switch (y) {
				case 1:
					System.out.println("Você selecionou 1, digite qual produto deseja atualizar");
					funcao.mostrarProdutos();
					sc.nextLine();
					System.out.println("Nome do produto que quer editar: ");
					String nomeAntigo = sc.nextLine();
					if(funcao.buscaProdutoNome(nomeAntigo)) {
						System.out.print("Novo nome: ");
						String nomeNovo = sc.nextLine();
						System.out.print("Novo tipo: ");
						TipoProduto tipo = TipoProduto.valueOf(sc.next().toUpperCase());
						System.out.print("Novo id: ");
						int id = sc.nextInt();
						funcao.editarProduto(nomeAntigo, nomeNovo, id, tipo);
						System.out.println("Produto alterado com sucesso!");
					}
					else {
						System.out.println("Produto não encontrado!");
					}
					break;
				case 2:
					System.out.println("Você selecionou 2, digite qual fornecedor deseja atualizar");
					funcao.mostrarFornecedores();
					sc.nextLine();
					System.out.print("Razao social do fornecedor que quer editar: ");
					String razaoSocialAntiga = sc.nextLine();
					/*if(funcao.buscarFornecedor(razaoSocialAntiga)) {
						System.out.println("Nova razao social: ");
						String razaoSocialNova = sc.nextLine();
						System.out.println("id novo: ");
						int id = sc.nextInt();
						System.out.println("CNPJ: ");
						int cnpj = sc.nextInt();
						funcao.editarFornecedor(razaoSocialAntiga, razaoSocialNova, id, cnpj);
						System.out.println("Fornecedor alterado com sucesso!");
					}*/
					
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				break;
			case '3':
				System.out.println("Você selecionou 3, selecione o que deseja excluir: ");
				System.out.println("1- Excluir produto \n2- Excluir fornecedor");
				y = sc.nextInt();
				switch (y) {
				case 1:
					System.out.println("Você selecionou 1, escolha qual produto deseja excluir: ");
					funcao.mostrarProdutos();
					System.out.print("Digite o nome: ");
					String nome = sc.nextLine();
					sc.nextLine();
					System.out.print("Tipo: ");
					TipoProduto tipo = TipoProduto.valueOf(sc.next().toUpperCase());
					System.out.println("id do fornecedor");
					int id = sc.nextInt();
					funcao.deletarProduto(nome, tipo, id);
					break;
				case 2:
					System.out.println("Você selecionou 2, escolha qual fornecedor deseja excluir: ");
					funcao.mostrarFornecedores();
					System.out.println("Digite o id");
					id = sc.nextInt();
					funcao.deletarFornecedor(id);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				break;
			case '4':
				System.out.println("Você selecionou 4, selecione o que deseja gerar: ");
				System.out.println(
						"1- Relatório de fornecedor por produto \n2- Relatório de produto por fornecedor \n3- Relatório de produto por tipo"
								+ "\n4- Relatório de fornecedores e produtos");
				y = sc.nextInt();
				switch (y) {

				case 3:
					funcao.mostrarProdutosPorTipo();
					break;

				case 4:
					funcao.mostrarProdutosEFornecedores();
				}

				break;

			case '5':
				System.out.println("Você selecionou sair. \nObrigado e volte sempre!");
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
			System.out.println(
					"=============================================================================================");
		} while (x != 5);
		sc.close();
	}
}