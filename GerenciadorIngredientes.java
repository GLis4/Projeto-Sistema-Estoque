package projetos.atividadeEstoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	static List<Insumo> listIns = new ArrayList<>();

	static void comprarEstoque(Insumo ins){

		listIns.add(ins);

	}
	
	static void PesquisarIngredientes(String pesquisa) {

		for (int i = 0; i < listIns.size(); i++) {
			
			if (listIns.get(i).nome.contains(pesquisa)) {
				System.out.println("\nInsumo cadastrado " + listIns.get(i).nome);
				System.out.println("==============================================");
				System.out.println("Código do Sistema   : " + listIns.get(i).codSistema);
				System.out.println("Categoria           : " + listIns.get(i).categoria);
				System.out.println("Preço de Custo      : " + listIns.get(i).pCusto);
				System.out.println("Medida              : " + listIns.get(i).medida);
				System.out.println("Estoque Mínimo      : " + listIns.get(i).estoqueM);
				System.out.println("Estoque Atual       : " + listIns.get(i).estoqueA);
				System.out.println("Situação do Estoque : " + listIns.get(i).sitEstoque);
				System.out.println("==============================================");
			}
		}
	}

	static void baixaEstoque(int ins, double removerEstoque) {
		listIns.get(ins).removerEstoque(removerEstoque);
	}
	
	static void consultarEstoque(){
		
		for(int i = 0; i < listIns.size(); i++) {
			
			System.out.println("\nInsumo cadastrado " + listIns.get(i).nome);
			System.out.println("==============================================");
			System.out.println("Código do Sistema   : " + listIns.get(i).codSistema);
			System.out.println("Categoria           : " + listIns.get(i).categoria);
			System.out.println("Preço de Custo      : " + listIns.get(i).pCusto);
			System.out.println("Medida              : " + listIns.get(i).medida);
			System.out.println("Estoque Mínimo      : " + listIns.get(i).estoqueM);
			System.out.println("Estoque Atual       : " + listIns.get(i).estoqueA);
			System.out.println("Situação do Estoque : " + listIns.get(i).sitEstoque);
			System.out.println("==============================================");
		}
		
	}


}
