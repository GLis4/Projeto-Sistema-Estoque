package atividade.estoque;

public class Insumo {
	
	public int codInsumo;
	public String nome;
	public byte categoria;
	public double pCusto;
	public byte medida;
	public double estoqueM;
	public double estoqueA;
	public int sitEstoque;

	public void adicionarEstoque(double addEstoque) {
		estoqueA += addEstoque;
	} 
	
	public void removerEstoque(double remEstoque) {
		estoqueA -= remEstoque;
	}
}
