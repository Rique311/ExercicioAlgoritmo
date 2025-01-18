package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exn {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite os valores positivos");
		long valor = scanner.nextLong();

		for (int i = 0; i <= valor; i++) {
			if (i < 0) {
				System.out.println(valor);

			}

		}

		scanner.close();
	}

}
