package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exj {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a, b, c;
		System.out.println("Informe o valor do número A");
		a = scan.nextInt();
		System.out.println("Informe o valor do número B");
		b = scan.nextInt();
		c = (a * a) - (2 * a * b) + (b * b);
		System.out.println("O resultado é:" + c);

		scan.close();

	}

}
