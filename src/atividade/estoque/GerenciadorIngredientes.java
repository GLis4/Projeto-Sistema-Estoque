package atividade.estoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	public static List<Insumo> listIns = new ArrayList<>();
	

	public static void comprarEstoque(Insumo ins){
		listIns.add(ins);
	}
	
	public static String pesquisarIngredientes(String pesquisa) {
		
		String item = "";

		for (int i = 0; i < listIns.size(); i++) {
			
			if (listIns.get(i).nome.contains(pesquisa) ) {
				item = "\nInsumo cadastrado " + listIns.get(i).nome + "\n" + 
						"==============================================" +
						"Código do Sistema   : " + listIns.get(i).codSistema + "\n" +
						"Categoria           : " + listIns.get(i).categoria + "\n" +
						"Preço de Custo      : " + listIns.get(i).pCusto + "\n" +
						"Medida              : " + listIns.get(i).medida + "\n" +
						"Estoque Mínimo      : " + listIns.get(i).estoqueM + "\n" +
						"Estoque Atual       : " + listIns.get(i).estoqueA + "\n" +
						"Situação do Estoque : " + listIns.get(i).sitEstoque + "\n" +
						"==============================================";
			}
		}
		
		return item;
	}

	public static void baixaEstoque(int ins, double removerEstoque) {
		listIns.get(ins).removerEstoque(removerEstoque);
	}
	
	

}
