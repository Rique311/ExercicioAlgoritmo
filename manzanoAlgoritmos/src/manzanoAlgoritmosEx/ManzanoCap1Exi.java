package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exi {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int numero;
System.out.println("informe o número");
numero = scan.nextInt();
numero = numero*numero;
System.out.println("\nO número ao quadrado é" + numero);
scan.close();
}
	}
