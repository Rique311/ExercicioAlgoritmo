package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A, B, C, resultado;

		System.out.println("Informe o valor de A");
		A = scan.nextInt();

		System.out.println("Informe o valor de B");
		B = scan.nextInt();

		System.out.println("Informe o valor de C");
		C = scan.nextInt();

		resultado = A + B + C;
		
		if (resultado >= 100) {
System.out.println("O valor da soma é" + resultado);
		} else {
			System.out.println("Valor da soma não informado");
		}
		scan.close();
	}

}
