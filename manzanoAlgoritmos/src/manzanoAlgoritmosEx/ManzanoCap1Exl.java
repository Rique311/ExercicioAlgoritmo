package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exl {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double dolar, real, cotacao;
		
		System.out.println("Informe a quantidade reais");
		dolar = scan.nextDouble();
		
		System.out.println("Informe a cotação do dólar");
		cotacao = scan.nextDouble();
		
		real = dolar/ cotacao;
		
		System.out.println("O valor em reais é" + real);

		scan.close();
	}

}
