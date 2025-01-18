package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, D, E;
		System.out.println("Informe o valor de A");
		A = scan.nextInt();
		System.out.println("Informe o valor de B");
		B = scan.nextInt();
		System.out.println("Informe o valor de C");
		C = scan.nextInt();
		System.out.println("Informe o valor de D");
		D = scan.nextInt();
		System.out.println("Informe o valor de E");
		E = scan.nextInt();

		int maior = A;
		int menor = A;

		if (B > maior)
			maior = B;
		if (C > maior)
			maior = C;
		if (D > maior)
			maior = D;
		if (E > maior)
			maior = E;

		if (B < menor)
			menor = B;
		if (C < menor)
			menor = C;
		if (D < menor)
			menor = D;
		if (E < menor)
			menor = E;

		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);

		scan.close();
	}

}
