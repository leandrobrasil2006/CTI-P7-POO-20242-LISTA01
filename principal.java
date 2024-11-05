package br.edu.principal;

public class principal {

	public static void main(String[] args) {
		double Salario, Cheque_1, Cheque_2, CPMF_2, Saldo, CPMF_1;
		Salario = 1520;
		Cheque_1 = 300;
		Cheque_2 = 220;
		
		CPMF_1 = Cheque_1 * 0.38 / 100;
		CPMF_2 = Cheque_2 * 0.38 / 100;
		
		Saldo = Salario - Cheque_1 - Cheque_2 - CPMF_1 - CPMF_2;
		System.out.println(Saldo);

	}

}

