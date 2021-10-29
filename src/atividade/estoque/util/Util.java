package atividade.estoque.util;

public class Util {

	public static boolean estaDentroDosLimites(double numeroASerVerificado, double valorMinimo, double valorMaximo) {

		boolean estaDentroDosLimites = false;
		if (numeroASerVerificado >= valorMinimo && numeroASerVerificado <= valorMaximo ) {
			estaDentroDosLimites = true;
		}
		return estaDentroDosLimites;

	}

	public static String devolverSit(int sitEstoque) {

		switch(sitEstoque) {
		case 1 : 
			return "Negativo/ Insuficiente";
		case 2 : 
			return "Abaixo do Mínimo";
		case 3 :
			return "Regular";
		}
		return "";

		
	}
}
