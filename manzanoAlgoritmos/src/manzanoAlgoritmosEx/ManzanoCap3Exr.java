package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        System.out.println("Informe valores positivos inteiros (ou um número negativo para encerrar):");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE || menor == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi informado.");
        } else {
            System.out.printf("Maior valor informado: %d%n", maior);
            System.out.printf("Menor valor informado: %d%n", menor);
        }

        scanner.close();
    }

	}


