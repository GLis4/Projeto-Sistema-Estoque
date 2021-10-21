package atividade.estoque.tela;

import java.util.Scanner;

import atividade.estoque.GerenciadorIngredientes;

public class TelaInicial {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		selecionarOpcao();
	}
	
	static void selecionarOpcao() {
		int opcao;
		do {	
			System.out.println("0 - Sair");
			System.out.println("1 - Gerenciar Lista de Insumos. ");
			System.out.println("2 - Pesquisar no Estoque. ");
			System.out.println("3 - Baixa Estoque. ");
			System.out.println("4 - Gerenciar Lista de Produtos.");

			opcao =  Integer.parseInt(sc.nextLine());

			switch(opcao) {
			case 1 :
				TelaEstoqueInsumo.opcoesCadastro();
				break;
			case 2:
				pesquisarEstoque();
				break;
			case 3 : 
				System.out.println("Baixando Estoque.");
				break;
			case 4 : 
				TelaProduto.selecionarOpcao();
				break;

			default:
				System.out.println("Não existe essa opção");
			}
		}while(opcao != 0);		

	}
	static void pesquisarEstoque() {

		System.out.println(" *Somente pesquisar por nome do produto* ");
		System.out.println(" Pesquisar por :  ");
		String resultPesquisa = GerenciadorIngredientes.pesquisarIngredientes(sc.nextLine());
		if(resultPesquisa.isBlank()) {
			System.out.println("Não há nenhum item com esse nome");
		}else {
			System.out.println(resultPesquisa);
		}


	}

}
