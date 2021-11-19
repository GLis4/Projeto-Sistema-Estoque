package atividade.estoque.util;

import java.util.List;
import atividade.estoque.Insumo;

public class UtilFormatacao {

	public static String montarApresentacaoTextualInsumo(Insumo insumo) {
		return "\nInsumo : " + insumo.nome + "\n" +
				"==============================================\n"
				+ "Código do Sistema   : " + insumo.codInsumo + "\n" + "Categoria           : " + insumo.categoria
				+ "\n" + "Preço de Custo      : " + insumo.pCusto + "\n" + "Medida              : " + insumo.medida
				+ "\n" + "Estoque Mínimo      : " + insumo.estoqueM + "\n" + "Estoque Atual       : " + insumo.estoqueA
				+ "\n" + "Situação do Estoque : " + insumo.sitEstoque + "\n"
				+ "==============================================";
	}

	public static String montarApresentacaoTextualLInsumo(List<Insumo> insumos) {
		String itens = "";
		int index  = 0;
		for (Insumo insumo : insumos) {
			index += 1;
			itens += "#"+ index +"\nInsumo " + insumo.nome + "\n"
					+ "=============================================="
					+ "\n" +"Código do Sistema   : " + insumo.codInsumo 
					+ "\n" + "Categoria           : " + insumo.categoria
					+ "\n" + "Preço de Custo      : " + insumo.pCusto
					+ "\n" + "Medida              : " + insumo.medida
					+ "\n" + "Estoque Mínimo      : " + insumo.estoqueM 
					+ "\n" + "Estoque Atual       : " + insumo.estoqueA + "\n"  
					+ "\n" + "Situação do Estoque : " + Util.getSituacao(insumo.sitEstoque) 
					+ "\n" + "==============================================";

		}
		return itens;
	}

}
