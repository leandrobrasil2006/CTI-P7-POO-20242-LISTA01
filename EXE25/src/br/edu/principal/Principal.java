package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double Custo,Convite;
		int Quantidade;

		        Scanner scanner = new Scanner(System.in);
	
		       
		        System.out.print("Insira o custo que sera o espetáculo: ");
		        Custo = scanner.nextDouble();
		        
		       
		        System.out.print("Insira o preço que sera o convite: ");
		        Convite = scanner.nextDouble();
		       
		        Quantidade = (int) Math.ceil(Custo / Convite); 
		        
		        
		        System.out.printf("Quantidade de convites que serao vendidos: %d.%n", Quantidade);
		        
		        
		        scanner.close();

}
}