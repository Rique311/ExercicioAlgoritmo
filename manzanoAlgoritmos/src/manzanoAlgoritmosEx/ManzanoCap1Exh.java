package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exh {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double comprimento, largura, altura, volume;
		System.out.println("Informe o comprimento da caixa");
		comprimento = scan.nextInt();
		System.out.println("Informe a largura da caixa");
		largura = scan.nextInt();
		System.out.println("Informe a altura da caixa");
		altura = scan.nextInt();

		volume = comprimento * largura * altura;
		System.out.println("/nO volume da caixa é:" + volume);
		scan.close();
	}
}
