package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double Deposito, Taxa, Rendimento, Total;
		Deposito = 700;
		Taxa = 9;
		Rendimento = Deposito * Taxa/100;
		Total = Deposito + Rendimento;
		
		System.out.println(Rendimento);
		System.out.println(Total);

	}

}
