package atividade.estoque.tela;

import java.util.Scanner;

import atividade.estoque.GerenciadorInsumo;
import atividade.estoque.Insumo;
import atividade.estoque.util.Util;

public class TelaInsumo {

	private static Scanner sc = new Scanner(System.in);

	static void opcoesCadastro() {

		int opcao;
		try {
			do {

				System.out.println("Menu Insumo: ");
				System.out.println("====================================\n");
				System.out.println("0 - Voltar");
				System.out.println("1 - Cadastrar novo Insumo");
				System.out.println("2 - Editar Insumo");
				System.out.println("3 - Consultar todos os Insumos");
				System.out.println("4 - Excluir Insumo");

				opcao = Integer.parseInt(sc.nextLine());
				switch (opcao) {
				case 0:
					System.out.println("Voce escolheu a opção: " + opcao);
					System.out.println("Voltou ao menu ");
					break;
				case 1:
					cadastrarInsumo();
					break;
				case 2:
					editarInsumo();
					break;
				case 3:
					consultarInsumo();
					break;
				case 4:
					excluirInsumo();
					break;
				default:
					System.out.println("Opção inválida " + opcao);
					break;
				}
			} while (opcao != 0);
		} catch (Exception e) {
			System.out.println("Erro ao selecionar. Preencha com um número valido.");
			System.out.println("");
			opcoesCadastro();

		}
	}

	public static void cadastrarInsumo() {

		try {
			Insumo insumo = new Insumo();

			System.out.println("Cadastrar novo insumo. Entre com os dados: ");
			System.out.println("=====================================\n");
			System.out.println("Código do insumo: ");
			insumo.codSistema = Integer.parseInt(sc.nextLine());

			System.out.println("Nome: ");
			insumo.nome = sc.nextLine();

			System.out.println("Categoria: ");
			System.out.println("1- bebidas");
			System.out.println("2- carnes");
			System.out.println("3- condimentos");
			System.out.println("4- embalagens");
			System.out.println("5- frios");
			System.out.println("6- leites e derivados");
			System.out.println("7- liquidos");
			System.out.println("8- massas");
			System.out.println("9- verduras");
			System.out.println("10- outros");
			insumo.categoria = Byte.parseByte(sc.nextLine());

			while (Util.estaDentroDosLimites(insumo.categoria, 1, 10) == false) {
				System.out.println("Valor digitado está fora dos limites. Por favor informar numero valido.");
				insumo.categoria = Byte.parseByte(sc.nextLine());

			}

			System.out.println("Preço de Custo: ");
			insumo.pCusto = Double.parseDouble(sc.nextLine());

			System.out.println("Medida: ");
			System.out.println("1- UN");
			System.out.println("2- KG");
			System.out.println("3- LT");
			insumo.medida = Byte.parseByte(sc.nextLine());
			while (Util.estaDentroDosLimites(insumo.medida, 1, 3) == false) {
				System.out.println("Valor digitado está fora dos limites. Por favor informar numero valido.");
				insumo.medida = Byte.parseByte(sc.nextLine());
			}

			System.out.println("Estoque Mínimo: ");
			insumo.estoqueM = Double.parseDouble(sc.nextLine());

			System.out.println("Estoque Atual: ");
			insumo.estoqueA = Double.parseDouble(sc.nextLine());

			if (insumo.estoqueA >= insumo.estoqueM) {
				insumo.sitEstoque = 3;
			} else if (insumo.estoqueA <= insumo.estoqueM) {
				insumo.sitEstoque = 2;
			} else if (insumo.estoqueA < 0) {
				insumo.sitEstoque = 1;
			}
			String devolverSit = Util.getSituacao(insumo.sitEstoque);

			System.out.println("\nINSUMO CADASTRADO COM SUCESSO!");
			System.out.println("================================================");
			System.out.println("Código do Sistema   : " + insumo.codSistema);
			System.out.println("Nome                : " + insumo.nome);
			System.out.println("Categoria           : " + insumo.categoria);
			System.out.println("Preço de Custo      : " + insumo.pCusto);
			System.out.println("Medida              : " + insumo.medida);
			System.out.println("Estoque Mínimo      : " + insumo.estoqueM);
			System.out.println("Estoque Atual       : " + insumo.estoqueA);
			System.out.println("Situação do Estoque : " + devolverSit);
			System.out.println("================================================");

			GerenciadorInsumo.listIns.add(insumo);

		} catch (Exception e) {
			System.out.println("Erro ao cadastrar insumo.");
			cadastrarInsumo();

		}

	}

	public static void editarInsumo() {
		if (GerenciadorInsumo.listIns.size() == 0) {
			System.out.println("Não há nenhum item na lista.");
			opcoesCadastro();

		} else {
			consultarInsumo();

			try {
				System.out.println("Deseja alterar o item : ");
				int indexRem = Integer.parseInt(sc.nextLine());

				System.out.println("Digite o número para alterar no cadastro do insumo: ");
				System.out.println("===================================================");
				System.out.println("1 - Código do Sistema");
				System.out.println("2 - Nome");
				System.out.println("3 - Categoria");
				System.out.println("4 - Preço de Custo");
				System.out.println("5 - Medida");
				System.out.println("6 - Estoque Mínimo");
				System.out.println("7 - Estoque Atual");

				int opcao = Integer.parseInt(sc.nextLine());

				switch (opcao) {
				case 1:
					System.out.println("Código do Sistema: ");
					GerenciadorInsumo.listIns.get(indexRem).codSistema = Integer.parseInt(sc.nextLine());
					break;
				case 2:
					System.out.println("Nome: ");
					GerenciadorInsumo.listIns.get(indexRem).nome = sc.nextLine();
					break;
				case 3:
					System.out.println("Categoria: ");
					System.out.println("1- bebidas");
					System.out.println("2- carnes");
					System.out.println("3- condimentos");
					System.out.println("4- embalagens");
					System.out.println("5- frios");
					System.out.println("6- leites e derivados");
					System.out.println("7- liquidos");
					System.out.println("8- massas");
					System.out.println("9- verduras");
					System.out.println("10- outros");
					GerenciadorInsumo.listIns.get(indexRem).categoria = Byte.parseByte(sc.nextLine());
					break;
				case 4:
					System.out.println("Preço de Custo: ");
					GerenciadorInsumo.listIns.get(indexRem).pCusto = Double.parseDouble(sc.nextLine());
					break;
				case 5:
					System.out.println("Medida: ");
					System.out.println("1- UN");
					System.out.println("2- KG");
					System.out.println("3- LT");
					GerenciadorInsumo.listIns.get(indexRem).medida = Byte.parseByte(sc.nextLine());
					break;
				case 6:
					System.out.println("Estoque Mínimo: ");
					GerenciadorInsumo.listIns.get(indexRem).estoqueM = Double.parseDouble(sc.nextLine());
					break;
				case 7:
					System.out.println("Estoque Atual: ");
					GerenciadorInsumo.listIns.get(indexRem).estoqueA = Double.parseDouble(sc.nextLine());
					break;

				default:
					System.out.println("Opção invalida");
					break;
				}

			} catch (Exception e) {

				System.out.println("Erro ao editar");
				editarInsumo();
			}
		}

	}

	public static void consultarInsumo() {

		if (GerenciadorInsumo.listIns.size() == 0) {
			System.out.println("Não há nenhum item na lista.");
			opcoesCadastro();

		} else {
			for (int i = 0; i < GerenciadorInsumo.listIns.size(); i++) {

				String devolverSit = Util.getSituacao(GerenciadorInsumo.listIns.get(i).sitEstoque);

				System.out.println("\nInsumo cadastrado # " + i);
				System.out.println("==============================================");
				System.out.println("Nome                : " + GerenciadorInsumo.listIns.get(i).nome);
				System.out.println("Código do Sistema   : " + GerenciadorInsumo.listIns.get(i).codSistema);
				System.out.println("Categoria           : " + GerenciadorInsumo.listIns.get(i).categoria);
				System.out.println("Preço de Custo      : " + GerenciadorInsumo.listIns.get(i).pCusto);
				System.out.println("Medida              : " + GerenciadorInsumo.listIns.get(i).medida);
				System.out.println("Estoque Mínimo      : " + GerenciadorInsumo.listIns.get(i).estoqueM);
				System.out.println("Estoque Atual       : " + GerenciadorInsumo.listIns.get(i).estoqueA);
				System.out.println("Situação do Estoque : " + devolverSit);
				System.out.println("==============================================");
			}
		}
	}

	public static void excluirInsumo() {
		System.out.println("Deseja excluir \n 1. Todos da lista \n 2. Somente um dos itens");
		int opcao = Integer.parseInt(sc.nextLine());
		switch (opcao) {
		case 1:
			GerenciadorInsumo.listIns.removeAll(GerenciadorInsumo.listIns);
			break;
		case 2:
			consultarInsumo();
			System.out.println("Deseja remover o item : ");
			int indexRem = Integer.parseInt(sc.nextLine());
			try {
				if (indexRem < 0 || indexRem > GerenciadorInsumo.listIns.size() - 1) {
					System.out.println("Nao eh possivel excluir o item " + indexRem);
				} else {
					GerenciadorInsumo.listIns.remove(indexRem);
				}
			} catch (Exception e) {
				System.out.println("Erro ao excluir item");
				e.printStackTrace();
			}
			break;
		}

	}
}
