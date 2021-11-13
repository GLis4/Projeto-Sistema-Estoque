package atividade.estoque.util;

public class Util {

	public static boolean estaDentroDosLimites(double numeroASerVerificado, double valorMinimo, double valorMaximo) {

		boolean estaDentroDosLimites = false;
		if (numeroASerVerificado >= valorMinimo && numeroASerVerificado <= valorMaximo ) {
			estaDentroDosLimites = true;
		}
		
		return estaDentroDosLimites;

	}

	public static String getSituacao(int situacaoEstoque) {

		switch(situacaoEstoque) {
		case 1 : 
			return "Negativo/ Insuficiente";
		case 2 : 
			return "Abaixo do M�nimo";
		case 3 :
			return "Regular";
		default:
			return "Situa��o n�o cadastrada";
		}

		
	}
}
