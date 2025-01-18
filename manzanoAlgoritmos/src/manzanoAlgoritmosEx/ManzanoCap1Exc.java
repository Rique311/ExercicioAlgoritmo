package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura da lata de óleo");
		double altura = scan.nextDouble();
		System.out.println("Informe o raio da lata de óleo");
		double r = scan.nextDouble();
		double volume = 3.14159 * r * r * altura;
		System.out.println(volume);

		scan.close();
	}

}
