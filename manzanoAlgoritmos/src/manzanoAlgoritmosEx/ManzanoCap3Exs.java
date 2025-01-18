package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.print("Informe o divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        }

        int quociente = 0;
        int resto = dividendo;

        while (resto >= divisor) {
            resto -= divisor; 
            quociente++;     
        }

        System.out.printf("Quociente: %d%n", quociente);
        System.out.printf("Resto: %d%n", resto);

        scanner.close();
    }

	}


