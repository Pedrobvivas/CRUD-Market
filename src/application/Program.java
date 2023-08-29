package application;

import java.util.Scanner;

import entities.Funcoes;
import entities.Menu;
import entities.enums.TipoProduto;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcoes funcao = new Funcoes();
		Menu menu=new Menu();
		int opcao,opcao1,opcao2,opcao3,opcao4;
		TipoProduto tipo;
		int id;
		String razaoSocial;
		
		
		do {
			menu.menuPrincipal();
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				menu.menuCase1(opcao1,sc);
				
				switch (opcao1) {
				case 1:
					menu.addProduto(nome,sc, tipo, opcao4);
					break;
				case 2:
					menu.addFornecedor(id, sc, razaoSocial, id);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				break;

			case 2:
				menu.menuCase2(opcao2, sc);
				switch (opcao2) {
				case 1:
					String nomeAntigo;
					String nomeNovo;
					menu.attProduto( sc, nomeAntigo, nomeNovo, tipo, id);
					break;
				case 2:
					String razaoSocialAntiga;
					String razaoSocialNova;
					int cnpj;
					menu.attFornecedor(sc, razaoSocialAntiga, razaoSocialNova, id, cnpj);
					break;
				default:
					System.out.println("Opção inválida");
					break;
				}
				break;

			case 3:
				menu.menuCase3(opcao3, sc);
				switch (opcao3) {
				case 1:
					menu.excluirProduto(nome, sc, tipo, id);
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
				opcao4 =sc.nextInt();
				switch(opcao4) {
				
				case 4:funcao.mostrarProdutosEFornecedores();
				}
				
				break; 

			case '5':
				System.out.println("Você selecionou sair. \nObrigado e volte sempre!");
				break;

			default:
				System.out.println("Opção inválida");
				break;
			}
		System.out.println("=============================================================================================");
		} while (opcao != 5);
		sc.close();
	}

}
