package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Informe o valor do número A");
		a = scan.nextInt();
		System.out.println("Informe o valor do número B");
		b = scan.nextInt();
		double resultado = Math.pow((double) a / b, 2);
		System.out.println("o resultado é" + resultado);
		scan.close();
	}

}
