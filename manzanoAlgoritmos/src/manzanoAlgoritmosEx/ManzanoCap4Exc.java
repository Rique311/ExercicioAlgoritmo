package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap4Exc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A[] = new int[15];
		int B[] = new int[15];
		System.out.println("Informe os 15 números");
		for (int i = 0; i < 15; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			A[i] = scan.nextInt();
			B[i] = A[i] * (A[i] - 1);
			System.out.println(B[i]);
		}
		scan.close();
	}
}
