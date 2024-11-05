package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double Pes, Polegada, Jardas, Milhas;
		Pes = 9;
		Polegada = Pes * 12;
		Jardas = Pes / 3;
		Milhas = Jardas / 1760;
		
		System.out.println("A: "+Polegada);
		System.out.println("B: "+Jardas);
		System.out.println("C: "+Milhas);

	}

}

