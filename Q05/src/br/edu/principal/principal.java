package br.edu.principal;

public class principal {

	public static void main(String[] args) {
			double Sal = 2000 , Percentual = 10, Aumento, Novosal;
			Aumento = Sal * Percentual / 100;
			System.out.println("Aumento é :" + Aumento);
			Novosal = Sal + Aumento;
			System.out.println("Salario novo é :" + Novosal);
		}

	}


