package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double taxa = 1;
		System.out.println("Informe o valor da prestação atrasada");
		double valor = scan.nextDouble();
		System.out.println("informe o tempo de atraso da prestação");
		double tempo = scan.nextDouble();

		double prestacao = valor + (valor * (taxa / 100) * tempo);

		System.out.println(prestacao);
		scan.close();
	}

}
