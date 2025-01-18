package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double sm, pr, rn;

		System.out.println("Informe o valor do Sálario Mensal");
		sm = scan.nextDouble();
		System.out.println("Informe o valor percentual de reajuste");
		pr = scan.nextDouble();
		rn = sm * pr;
		System.out.println("O valor do novo salário é" + rn);
		scan.close();

	}

}
