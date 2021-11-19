package atividade.estoque.tela;
import java.util.Scanner;

import atividade.estoque.GerenciadorInsumo;
import atividade.estoque.GerenciadorProduto;
import atividade.estoque.Produto;
import atividade.estoque.util.UtilFormatacao;

public class TelaProduto {
	public static Scanner sc = new Scanner(System.in);

	static void opocoesDeCadastroProd() {
		int opcao;

		try {

			do {
				System.out.println("Menu Produto: ");
				System.out.println("====================================\n");
				System.out.println("0 - Voltar");
				System.out.println("1 - Cadastrar novo Produto");
				System.out.println("2 - Editar Produto");
				System.out.println("3 - Consultar Produto");
				System.out.println("4 - Excluir Produto");

				opcao = Integer.parseInt(sc.nextLine());

				switch(opcao) {

				case 0: 
					TelaInicial.selecionarOpcao();
					break;
				case 1:
					cadastrarProduto();
					break;
				case 2:
					alterarProduto();
					break;
				case 3:
					consultarProduto();
					break;
				case 4: 
					excluirProduto();
					break;

				default: 
					System.out.println("Opção inválida " + opcao);					
					break;

				}

			}while(opcao !=0);

		}catch(Exception e) {

			System.out.println("Erro ao selecionar. Preencha com um número valido.");
			System.out.println("");
			opocoesDeCadastroProd();

		}

		sc.close();
	}

	static void cadastrarProduto() {
		Produto prod = new Produto();

		try {

			System.out.println("Cadastrar novo Produto. Entre com os dados: ");
			System.out.println("=====================================\n");
			System.out.println("Id Produto: ");
			prod.codPro = Integer.parseInt(sc.nextLine());

			System.out.println("Nome: ");
			prod.nomePro = sc.nextLine();

			System.out.println("Preço de Custo: ");
			prod.precoPro = Double.parseDouble(sc.nextLine());
			System.out.println("Adicione uma lista de ingredientes");
			TelaInsumo.consultarInsumo();
			int indexProd = Integer.parseInt(sc.nextLine());
			prod.ingProd.add(GerenciadorInsumo.listIns.get(indexProd));

			System.out.println("");

			System.out.println("\nProduto CADASTRADO COM SUCESSO!");
			System.out.println("================================================");
			System.out.println("Codigo do Produto   : " + prod.codPro);
			System.out.println("Nome                : " + prod.nomePro);
			System.out.println("Preço de Custo      : " + prod.precoPro); 
			System.out.println(UtilFormatacao.montarApresentacaoTextualLInsumo(prod.ingProd));
			System.out.println("================================================");
			GerenciadorProduto.listProd.add(prod);

		} catch (Exception e) {
			System.out.println("Erro ao cadastrar produto.");
			cadastrarProduto();

		}
	}

	static void alterarProduto() {
		consultarProduto();

		try {
			System.out.println("Deseja alterar o item : ");
			int indexRem = Integer.parseInt(sc.nextLine());

			System.out.println("Digite o número para alterar no cadastro do Produto: ");
			System.out.println("===================================================");
			System.out.println("");
			System.out.println("1 - Codigo do Produto");
			System.out.println("2 - Nome   do Produto");
			System.out.println("3 - Preço  do Produto");
			System.out.println("");
			System.out.println("===================================================");
			int opcao = Integer.parseInt(sc.nextLine());

			switch (opcao) {
			case 1:
				System.out.println("Codigo do Produto: ");
				GerenciadorProduto.listProd.get(indexRem).codPro = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				System.out.println("Nome: ");
				GerenciadorProduto.listProd.get(indexRem).nomePro = sc.nextLine();
				break;

			case 3 :
				System.out.println("Preço de Custo: ");
				GerenciadorProduto.listProd.get(indexRem).precoPro = Double.parseDouble(sc.nextLine());
				break;
			
			default:
				System.out.println("Opção invalida");
				break;
			}

		} catch (Exception e) {

			System.out.println("Erro ao editar");
			alterarProduto();
		}

	}

	static void consultarProduto() {

		if (GerenciadorProduto.listProd.size() == 0) {
			System.out.println("Não há nenhum item na lista.");
			opocoesDeCadastroProd();

		} else {
			for (int i = 0; i < GerenciadorProduto.listProd.size(); i++) {

				System.out.println("\nInsumo cadastrado # " + i);
				System.out.println("==============================================");
				System.out.println("Nome                : " + GerenciadorProduto.listProd.get(i).nomePro);
				System.out.println("Código do Produto   : " + GerenciadorProduto.listProd.get(i).codPro);
				System.out.println("Preço  de Custo     : " + GerenciadorProduto.listProd.get(i).precoPro);
				System.out.println("");
				System.out.println("==============================================");
			}

		}



	}

	static void excluirProduto() {


		System.out.println("==============================================");
		System.out.println("Excolha uma das opções!");
		System.out.println("");
		System.out.println("1- Excluir todos os itens da lista!");	
		System.out.println("");
		System.out.println("2- Excluir Apenas um dos Itens!");
		System.out.println("");
		System.out.println("==============================================");
		int opcao = Integer.parseInt(sc.nextLine());
		switch (opcao) {
		case 1:
			GerenciadorProduto.listProd.removeAll(GerenciadorProduto.listProd);
			break;
		case 2:
			consultarProduto();

			System.out.println("Deseja remover o item : ");
			int indexRem = Integer.parseInt(sc.nextLine());
			try {
				if (indexRem < 0 || indexRem > GerenciadorProduto.listProd.size() - 1) {
					System.out.println("Nao eh possivel excluir o item " + indexRem);
				} else {
					GerenciadorProduto.listProd.remove(indexRem);
				}
			} catch (Exception e) {
				System.out.println("Erro ao excluir item");
				e.printStackTrace();
			}
			break;
		}



	}

}

