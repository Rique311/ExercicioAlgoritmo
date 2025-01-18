package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, resultado;
		
		System.out.println("Informe o valor do número A");
		a = scan.nextInt();

		System.out.println("Informe o valor do número B");
		b = scan.nextInt();

		System.out.println("Informe o valor do número C");
		c = scan.nextInt();
		
		resultado = (a + b + c)^2;
		System.out.println("O resultado da operção é" + resultado);
		scan.close();
	}

}
