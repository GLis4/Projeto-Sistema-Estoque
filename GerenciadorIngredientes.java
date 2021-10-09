package projetos.atividadeEstoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorIngredientes {

	static List<Ingrediente> listIng = new ArrayList<>();

	static void comprarEstoque(Ingrediente ing){

		listIng.add(ing);

	}
	
	static void PesquisarIngredientes(String pesquisa) {

		for (int i = 0; i < listIng.size(); i++) {

			if (listIng.get(i).nome.contains(pesquisa)) {
				System.out.println("\nINSUMO CADASTRADO COM SUCESSO!");
				System.out.println("================================================");
				System.out.println("Nome                	 : " + listIng.get(i).nome);
				System.out.println("Quantidade no estoque    : " + listIng.get(i).qtdEstoque);
				System.out.println("Categoria 			     : " + listIng.get(i).categoria);
				System.out.println("================================================");
			}
		}
	}

	static void baixaEstoque(double removerEstoque) {

		listIng.get(0).removerEstoque(removerEstoque);

	}


}
