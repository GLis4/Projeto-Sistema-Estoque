package atividade.estoque.tela;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import atividade.estoque.GerenciadorInsumo;
import atividade.estoque.Insumo;
import atividade.estoque.db.ConectandoSQL;
import atividade.estoque.util.UtilFormatacao;

public class TelaInicial {

	static Scanner sc = new Scanner(System.in);
	static ConectandoSQL con;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		inicializarConexaoBanco();
		selecionarOpcao();
	}

	static void inicializarConexaoBanco() throws ClassNotFoundException, SQLException {
		
		 con = new ConectandoSQL("./estoque.db");
		 
		 
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
			case 0: 
				System.out.println("Saindo...");
				break;
			case 1 :
				TelaInsumo.opcoesCadastro();
				break;
			case 2:
				pesquisarEstoque();
				break;
			case 3 : 
				abaixarItem();
				break;
			case 4 : 
				TelaProduto.opocoesDeCadastroProd();
				break;

			default:
				System.out.println("Não existe essa opção");
			}
		}while(opcao != 0);		

	}
	static void pesquisarEstoque() {

		System.out.println(" *Somente pesquisar por nome do ingrediente* ");
		System.out.println(" Pesquisar por :  ");
		List<Insumo> listaFiltradaInsumos = GerenciadorInsumo.pesquisarIngredientes(sc.nextLine());
		if(listaFiltradaInsumos.size() == 0) {
			System.out.println("Não há nenhum item com esse nome");
		}else {

			String insumosFormatadosParaApresentacao = UtilFormatacao.montarApresentacaoTextualLInsumo(listaFiltradaInsumos);
			System.out.println(insumosFormatadosParaApresentacao);

		}
	}

	static void abaixarItem() {

		System.out.println("\tBaixa- Estoque");
		if (GerenciadorInsumo.listIns.size() == 0) {
			System.out.println("Não há nenhum item na lista.");
			selecionarOpcao();

		} else {
			System.out.println(UtilFormatacao.montarApresentacaoTextualLInsumo(GerenciadorInsumo.listIns));
			int indexAbaixarItem = Integer.parseInt(sc.nextLine()); 
			System.out.println("Deseja abaixar no estoque o item...");
			System.out.println("Quanto quer abaixar no estoque atual?");
			int abaixaEstoqueA = Integer.parseInt(sc.nextLine());  
			GerenciadorInsumo.baixaEstoque(indexAbaixarItem - 1, abaixaEstoqueA);
		}
	}

}
