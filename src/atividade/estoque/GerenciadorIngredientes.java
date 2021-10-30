package atividade.estoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	public static List<Insumo> listIns = new ArrayList<>();
	

	public static void comprarEstoque(Insumo ins){
		listIns.add(ins);
	}
	
	public static List<Insumo> pesquisarIngredientes(String nomeIngrediente) {
		
		List<Insumo> listInsumosEncontrados = new ArrayList<>();

		for (int i = 0; i < listIns.size(); i++) {
			
			if (listIns.get(i).nome.toLowerCase().contains(nomeIngrediente.toLowerCase()) ) {
				listInsumosEncontrados.add(listIns.get(i));
			}
		}
		
		return listInsumosEncontrados;
	}

	public static void baixaEstoque(int ins, double removerEstoque) {
		listIns.get(ins).removerEstoque(removerEstoque);
	}
	
	

}
