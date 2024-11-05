package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
	int nota1, nota2, nota3, p1, p2, p3, media;
		
		nota1 = 7;
		nota2 = 8;
		nota3 = 9;
		p1 = 1;
		p2 = 2;
		p3 = 3;
		media = ((nota1*p1) + (nota2*p2) + (nota3))/(p1+p2+p3);
		
		System.out.println("A media das suas notas é:" + media);


	}

}
