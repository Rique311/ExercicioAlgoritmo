package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exo {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        long somatorio = 0;

	        System.out.println("Digite 15 valores inteiros:");

	        for (int i = 1; i <= 10; i++) {
	        	
	            System.out.print("Digite o valor " + i + ": ");
	            int valor = scanner.nextInt();

	            long fatorial = calcularFatorial(valor);
	            somatorio += fatorial;
	            
	            if( fatorial/2 == 1) {

	            System.out.println("Fatorial de " + valor + " é " + fatorial);
	        } }

	        System.out.println("\nSomatório dos fatoriais: " + somatorio);
	        scanner.close();
	    }

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


