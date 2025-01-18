package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tempo de viagem");
		double tempo = scan.nextDouble();

		System.out.println("Informe a velocidade da viagem");
		double velocidade = scan.nextDouble();
		
		double distancia = tempo * velocidade;
		double litros = distancia / 12;
		
		System.out.println(litros);
		scan.close(); 
	}

}
