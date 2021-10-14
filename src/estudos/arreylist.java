package estudos;
import java.util.ArrayList;
import java.util.Scanner;


public class arreylist {
     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int opcao1;
		
		int QArrey =  1;
		
		ArrayList<String> ingredientes = new ArrayList<>(QArrey);
		
		do {
			System.out.println("Escolha uma das opções por favor!!!");
			System.out.println("");
			System.out.println("1- Cadastrar Igrediente");
			System.out.println("2- Remover Ingrediente");
			
			opcao1 = sc.nextInt();

			
			switch (opcao1) {
			case 0:
				
				break;
			case 1:
				
				String intemARe = "";
				System.out.println("Digite o que quer registrar por favor!!!");
				System.out.print("Nome: ");
				intemARe = sc.next();
				ingredientes.add(intemARe);
				QArrey ++;
				
				break;
			case 2: 
				String intemARm = "";
				System.out.println("Digite o ingrediente que quer remover!!!");
				System.out.print("Nome: ");
				intemARm = sc.next();
				
				ingredientes.remove(intemARm);
				QArrey--;
				
				break;
			default:
				
				break;
			}
		} while (opcao1 != 0);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		//String resposta= "";
		//String resposta2= "";
		//Scanner sc = new Scanner(System.in);
		
		//ArrayList<Integer> numeros = new ArrayList<>();
		//ArrayList<String> carros = new ArrayList<>(100);
		
		//carros.trimToSize(); //serve para limitar o ArrayList apenas ao numero de elementos que existem na lista mesmo que o Arrey possua 100 posições
		
		//numeros.add(10);
		//numeros.add(22);
		//numeros.add(30);
		//carros.add("Tesla");
		//carros.add("Fiat");
		//carros.add("Ferrary");
		//carros.add("Chevrolet");
		//carros.add("Lanborgin");
		
		//System.out.println("Digite o Carro que quer remover");
		//resposta2 = sc.next();
		
		//carros.remove(resposta2);
		
		//System.out.println("Pesquise o Carro desejado");
		
		//resposta =sc.next();
		
		//System.out.println(carros.indexOf(resposta));
		
		//for(int i=0; i<carros.size(); i++) {
			
			//System.out.println(i + "- Marca " + carros.get(i));
			
		//}
		
		//System.out.println("O Carros Mais Rapido é o " + carros.get(0) + "O segundo Melhor Carro é:" + carros.get(1));
		
		
		
		//for(String m:carros) {
			
			//System.out.println(m);
			
		//}
		
		//for(int e:numeros) {
			
			//System.out.println(e);
			
		//}
		
	}
	

