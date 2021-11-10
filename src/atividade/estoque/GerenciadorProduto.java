 package atividade.estoque;
	import java.util.ArrayList;
	import java.util.List;

	public class GerenciadorProduto {

		public static List<Produto> listProd = new ArrayList<>();
		

		public static void comprarEstoque(Produto prod){
			listProd.add(prod);
		}
		
		public static List<Produto> pesquisarProduto(String nomeProduto) {
			
			List<Produto> listProdutosEncontrados = new ArrayList<>();

			for (int i = 0; i < listProd.size(); i++) {
				
				if (listProd.get(i).nomePro.toLowerCase().contains(nomeProduto.toLowerCase()) ) {
					listProdutosEncontrados.add(listProd.get(i));
				}
			}
			
			return listProdutosEncontrados;
		}
		
				
	}



