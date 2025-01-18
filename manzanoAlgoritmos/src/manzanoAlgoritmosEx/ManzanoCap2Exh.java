package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, D;

		System.out.println("Informe o valor de A");
		A = scan.nextInt();
		System.out.println("Informe o valor de  B");
		B = scan.nextInt();
		System.out.println("Informe o valor de C");
		C = scan.nextInt();
		System.out.println("Informe o valor de D");
		D = scan.nextInt();

		if (A % 2 == 0 && A % 3 == 0) {
			System.out.println("A = " + A);
		}
		if (B % 2 == 0 && B % 3 == 0) {
			System.out.println("B = " + B);
		}
		if (C % 2 == 0 && C % 3 == 0) {
			System.out.println("C = " + C);
		}
		if (D % 2 == 0 && D % 3 == 0) {
			System.out.println("A = " + D);
		}
		if ((A % 2 != 0 || A % 3 != 0) && (B % 2 != 0 || B % 3 != 0) && (C % 2 != 0 || C % 3 != 0)
				&& (D % 2 != 0 || D % 3 != 0)) {
			System.out.println("Nenhum valor é divisível por 2 e 3.");
		}
		scan.close();
	}
	}


