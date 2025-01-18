package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o número");
		int numero = scan.nextInt();
		int antecessor = numero - 1;
		System.out.println("O antecessor é:" + antecessor);
		int sucessor = numero + 1;
		System.out.println("O sucessoor é:" + sucessor);

		scan.close();

	}

}
