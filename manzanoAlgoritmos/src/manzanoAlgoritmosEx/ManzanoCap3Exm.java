package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exm {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        double somatorio = 0;

	        System.out.println("Digite 10 valores reais:");

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o valor " + i + ": ");
	            double valor = scanner.nextDouble(); // Lê um valor real
	            somatorio += valor; // Adiciona ao somatório
	        }

	        double media = somatorio / 10; // Calcula a média

	        System.out.println("\nSomatório dos valores: " + somatorio);
	        System.out.println("Média dos valores: " + media);

	        scanner.close();
	}
	}