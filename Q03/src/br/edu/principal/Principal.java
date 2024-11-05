package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	int Nota_1, Nota_2, Nota_3=3, Peso_1, Peso_2, Peso_3, Media;
		
		Nota_1 = 8;
		Nota_2 = 5;
		Nota_3 = 6;
		Peso_1 = 4;
		Peso_2 = 3;
		Peso_3 = 2;
		Media = ((Nota_1*Peso_1) + (Nota_2*Peso_2) + (Nota_3))/(Peso_1+Peso_2+Peso_3);
		
		System.out.println("media das notas vai ser:" + Media);


	}

}

