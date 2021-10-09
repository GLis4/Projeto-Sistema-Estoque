package projetos.atividadeEstoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	static List<Ingrediente> listIng = new ArrayList<>();

	static void comprarEstoque(String nome, double qtd){

		Ingrediente ing = new Ingrediente();
		ing.nome = nome;
		ing.qtdEstoque = qtd;	
	}
	
	static void PesquisarIngredientes(String pesquisa) {
		for (int i = 0; i < listIng.size(); i++) {
			
			if (listIng.get(i).nome.contains(pesquisa)) {
				System.out.println(listIng.get(i).nome);
				System.out.println(listIng.get(i).qtdEstoque);
				System.out.println("");
			}
			
		}
	}
	
	static void baixaEstoque(double removerEstoque) {
		
		listIng.get(0).removerEstoque(removerEstoque);
		
	}
}
