package atividade.estoque.util;

public class Util {

	public static boolean estaDentroDosLimites(double numeroASerVerificado, double valorMinimo, double valorMaximo) {
		
		boolean estaDentroDosLimites = false;
		if (numeroASerVerificado >= valorMinimo && numeroASerVerificado <= valorMaximo ) {
			estaDentroDosLimites = true;
		}
		return estaDentroDosLimites;
		
	}
	
	public static void main(String[] args) {
		boolean b = estaDentroDosLimites(1, 1, 4);
		System.out.println(b);
	}
}
