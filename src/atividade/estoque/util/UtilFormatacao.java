package atividade.estoque.util;

import java.util.List;

import atividade.estoque.Insumo;

public class UtilFormatacao {

	public static String montarApresentacaoTextualInsumo(Insumo insumo) {
		return "\nInsumo cadastrado " + insumo.nome + "\n" + "=============================================="
				+ "C�digo do Sistema   : " + insumo.codSistema + "\n" + "Categoria           : " + insumo.categoria
				+ "\n" + "Pre�o de Custo      : " + insumo.pCusto + "\n" + "Medida              : " + insumo.medida
				+ "\n" + "Estoque M�nimo      : " + insumo.estoqueM + "\n" + "Estoque Atual       : " + insumo.estoqueA
				+ "\n" + "Situa��o do Estoque : " + insumo.sitEstoque + "\n"
				+ "==============================================";
	}

	public static String montarApresentacaoTextualInsumo(List<Insumo> insumos) {
		String itens = "";
		for (Insumo insumo : insumos) {
			itens += "\nInsumo cadastrado " + insumo.nome + "\n" + "=============================================="
					+ "C�digo do Sistema   : " + insumo.codSistema + "\n" + "Categoria           : " + insumo.categoria
					+ "\n" + "Pre�o de Custo      : " + insumo.pCusto + "\n" + "Medida              : " + insumo.medida
					+ "\n" + "Estoque M�nimo      : " + insumo.estoqueM + "\n" + "Estoque Atual       : "
					+ insumo.estoqueA + "\n" + "Situa��o do Estoque : " + insumo.sitEstoque + "\n"
					+ "==============================================";

		}
		return itens;
	}

}
