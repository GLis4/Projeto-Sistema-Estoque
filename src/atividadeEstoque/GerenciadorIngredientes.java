package atividadeEstoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	static List<Insumo> listIns = new ArrayList<>();
	

	static void comprarEstoque(Insumo ins){
		listIns.add(ins);
	}
	
	static String PesquisarIngredientes(String pesquisa) {
		
		String item = "";

		for (int i = 0; i < listIns.size(); i++) {
			
			if (listIns.get(i).nome.contains(pesquisa) ) {
				item = "\nInsumo cadastrado " + listIns.get(i).nome + "\n" + 
						"==============================================" +
						"C�digo do Sistema   : " + listIns.get(i).codSistema + "\n" +
						"Categoria           : " + listIns.get(i).categoria + "\n" +
						"Pre�o de Custo      : " + listIns.get(i).pCusto + "\n" +
						"Medida              : " + listIns.get(i).medida + "\n" +
						"Estoque M�nimo      : " + listIns.get(i).estoqueM + "\n" +
						"Estoque Atual       : " + listIns.get(i).estoqueA + "\n" +
						"Situa��o do Estoque : " + listIns.get(i).sitEstoque + "\n" +
						"==============================================";
			}
		}
		
		return item;
	}

	static void baixaEstoque(int ins, double removerEstoque) {
		listIns.get(ins).removerEstoque(removerEstoque);
	}
	
	static void consultarEstoque(){
		
		for(int i = 0; i < listIns.size(); i++) {
			
			System.out.println("\nInsumo cadastrado # "+ i); 
			System.out.println("==============================================");
			System.out.println("Nome                :"+listIns.get(i).nome);
			System.out.println("C�digo do Sistema   : " + listIns.get(i).codSistema);
			System.out.println("Categoria           : " + listIns.get(i).categoria);
			System.out.println("Pre�o de Custo      : " + listIns.get(i).pCusto);
			System.out.println("Medida              : " + listIns.get(i).medida);
			System.out.println("Estoque M�nimo      : " + listIns.get(i).estoqueM);
			System.out.println("Estoque Atual       : " + listIns.get(i).estoqueA);
			System.out.println("Situa��o do Estoque : " + listIns.get(i).sitEstoque);
			System.out.println("==============================================");
		}
		
	}


}
