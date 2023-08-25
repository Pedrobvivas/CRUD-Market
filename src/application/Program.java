package application;

import java.util.Scanner;

import entities.Funcoes;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcoes funcao = new Funcoes();

		System.out.println("=====================Bem-vindo ao Vivas Market=============================");
		System.out.println("Selecione o que deseja fazer: ");
		System.out.println(
				"1- Realizar cadastro \n2- Realizar atualização \n3- Realizar exclusão \n4- Gerar relatório \n5- Sair");
		int x = sc.nextInt();
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
				int tipo = sc.nextInt();
				funcao.adicionarProduto(nome, tipo);
				break;
			case 2:
				System.out.print("Você selecionou fornecedor, digite o id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite a razão social: ");
				String razaoSocial = sc.nextLine();
				System.out.print("Digite o CNPJ: ");
				int cnpj = sc.nextInt();
				funcao.adicionarFornecedor(id, razaoSocial, cnpj);
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
				/* funcao de atualizar produto */
				break;
			case 2:
				System.out.println("Você selecionou 2, digite qual fornecedor deseja atualizar");
				funcao.mostrarFornecedores();
				/* funcao de atualizar fornecedores */
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
				System.out.print("Tipo: ");
				int tipo = sc.nextInt();
				funcao.deletarProduto(nome, tipo);
				break;
			case 2:
				System.out.println("Você selecionou 2, escolha qual fornecedor deseja excluir: ");
				funcao.mostrarFornecedores();
				System.out.println("Digite o id");
				int id = sc.nextInt();
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
			break;

		case '5':
			System.out.println("Você selecionou sair. \nObrigado e volte sempre!");
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}
	}
}