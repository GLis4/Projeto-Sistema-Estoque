package atividade.estoque.tela;

import java.util.Scanner;

import atividade.estoque.GerenciadorIngredientes;
import atividade.estoque.Prato;
public class TelaProduto {
	
	public static Scanner sc = new Scanner(System.in);
	public static Prato pd = new Prato();
	
	public static void main(String[] args) {
		selecionarOpcao();
	}
	
	public static void selecionarOpcao() {
		int opcao;
		do {
			 System.out.println("Menu Produtos");
			 System.out.println("====================================\n");
				System.out.println("0 - Voltar");
				System.out.println("1 - Cadastrar Produto");
				System.out.println("2 - Editar Produto");
				System.out.println("3 - Pesquisar Produto");
				System.out.println("4 - Excluir Produto");
			  opcao = sc.nextInt();
			  System.out.println("Voce escolheu a op��o: " + opcao);
			switch (opcao) {
			case 0:
				System.out.println("Voltar para o menu");
				TelaEstoqueInsumo.opcoesCadastro();
				break;
			case 1:
				cadastrarProduto();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			default:
				System.out.println("Op��o inv�lida " + opcao);
				break;
			}
		} while (opcao != 0);
	}
	
	public static void cadastrarProduto() {
		
		System.out.println("Informe o nome do produto");
		System.out.println("Nome: ");
		pd.nomePro = sc.next();
		System.out.println("Pre�o: ");
		pd.pre�oPro = sc.nextDouble();
		System.out.println("Adicione uma lista de ingredientes");
		TelaEstoqueInsumo.consultarInsumo();
		int indexProd = sc.nextInt();
		pd.ingPrato.add(GerenciadorIngredientes.listIns.get(indexProd));
		
		
		System.out.println("");
		
	}

}
