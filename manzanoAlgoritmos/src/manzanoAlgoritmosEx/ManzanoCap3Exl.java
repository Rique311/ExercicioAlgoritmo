package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exl {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        long somatorio = 0;

	        System.out.println("Digite 15 valores inteiros:");

	        for (int i = 1; i <= 15; i++) {
	            System.out.print("Digite o valor " + i + ": ");
	            int valor = scanner.nextInt();

	            long fatorial = calcularFatorial(valor); // Calcula o fatorial do valor lido
	            somatorio += fatorial; // Adiciona o fatorial ao somatório

	            System.out.println("Fatorial de " + valor + " é " + fatorial);
	        }

	        System.out.println("\nSomatório dos fatoriais: " + somatorio);
	        scanner.close();
	    }

	    // Método para calcular o fatorial de um número
	    public static long calcularFatorial(int numero) {
	        if (numero < 0) {
	            System.out.println("Fatorial não definido para números negativos. Considerando 0.");
	            return 0;
	        }

	        long fatorial = 1;
	        for (int i = 1; i <= numero; i++) {
	            fatorial *= i;
	        }
	        return fatorial;
	    }
	}