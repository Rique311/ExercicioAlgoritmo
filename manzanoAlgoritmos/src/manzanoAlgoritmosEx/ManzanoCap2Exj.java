package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exj {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int A, resultado;

System.out.println("Informe o valor do número");
A = scan.nextInt();
resultado = A%2;
if (resultado == 0) { 
	System.out.println("Número par");
	} else {
		System.out.println("Número ímpar");
	}

scan.close();
	}

}
