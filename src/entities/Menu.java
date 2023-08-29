package entities;

import java.util.Scanner;

import entities.enums.TipoProduto;

public class Menu {

		Scanner sc=new Scanner(System.in);
		Funcoes funcao=new Funcoes();
		
		public void menuPrincipal() {
			System.out.println("=====================Bem-vindo ao Vivas Market=============================");
			System.out.println("Selecione o que deseja fazer: ");
			System.out.println(
					"1- Realizar cadastro \n2- Realizar atualização \n3- Realizar exclusão \n4- Gerar relatório \n5- Sair");
		
	}
		public void menuCase1(int opcao1, Scanner sc) {
			System.out.println("Você selecionou 1, selecione o que deseja cadastrar:");
			System.out.println("1- Cadastrar produto \n2- Cadastrar fornecedor");
			opcao1 = sc.nextInt();
			sc.nextLine();
		
		}

		public void addProduto(String nome,Scanner sc, TipoProduto tipo,int id) {
			System.out.print("Você selecionou produto, digite o nome do produto: ");
			nome = sc.nextLine();
			System.out.print("Digite o tipo: ");
			tipo = TipoProduto.valueOf(sc.next().toUpperCase());
			System.out.print("Digite o id do fornecedor: ");
			id = sc.nextInt();
			funcao.adicionarProduto(nome, tipo, id);

		}

		public void addFornecedor(int id, Scanner sc, String razaoSocial, int cnpj) {
			System.out.print("Você selecionou fornecedor, digite o id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Digite a razão social: ");
			razaoSocial = sc.nextLine();
			System.out.print("Digite o CNPJ: ");
			cnpj = sc.nextInt();
			funcao.adicionarFornecedor(id, razaoSocial, cnpj);
		}

		public void menuCase2(int opcao2,Scanner sc) {
			System.out.println("Você selecionou 2, selecione o que deseja atualizar:");
			System.out.println("1- Atualizar produto \n2- Atualizar fornecedor");
			opcao2 = sc.nextInt();
		}
		public void attProduto( Scanner sc, String nomeAntigo, String nomeNovo, TipoProduto tipo,int id) {
			System.out.println("Você selecionou 1, digite qual produto deseja atualizar");
			funcao.mostrarProdutos();
			sc.nextLine();
			System.out.println("Nome do produto que quer editar: ");
			nomeAntigo=sc.nextLine();
			System.out.print("Novo nome: ");
			nomeNovo=sc.nextLine();
			System.out.print("Novo tipo: ");
			tipo= TipoProduto.valueOf(sc.next().toUpperCase());
			System.out.print("Novo id: ");
			id=sc.nextInt();
			funcao.editarProduto(nomeAntigo,nomeNovo, id, tipo);
			System.out.println("Produto alterado com sucesso!");
		}
		public void attFornecedor (Scanner sc, String razaoSocialAntiga, String razaoSocialNova,int id,int cnpj) {
			System.out.println("Você selecionou 2, digite qual fornecedor deseja atualizar");
			funcao.mostrarFornecedores();
			sc.nextLine();
			System.out.print("Razao social do fornecedor que quer editar: ");
			razaoSocialAntiga=sc.nextLine();
			System.out.println("Nova razao social: ");
			razaoSocialNova=sc.nextLine();
			System.out.println("id novo: ");
			id=sc.nextInt();
			System.out.println("CNPJ: ");
			cnpj=sc.nextInt();
			funcao.editarFornecedor(razaoSocialAntiga, razaoSocialNova, id, cnpj);
			System.out.println("Fornecedor alterado com sucesso!");
		}

		public void menuCase3(int opcao3, Scanner sc) {
			System.out.println("Você selecionou 3, selecione o que deseja excluir: ");
			System.out.println("1- Excluir produto \n2- Excluir fornecedor");
			opcao3 = sc.nextInt();
		}

		public void excluirProduto(String nome,Scanner sc, TipoProduto tipo, int id) {
			System.out.println("Você selecionou 1, escolha qual produto deseja excluir: ");
			funcao.mostrarProdutos();
			System.out.print("Digite o nome: ");
			nome = sc.nextLine();
			System.out.print("Tipo: ");
			tipo = TipoProduto.valueOf(sc.next().toUpperCase());
			System.out.println("id do fornecedor");
			id = sc.nextInt();
			funcao.deletarProduto(nome, tipo, id);
		}
}