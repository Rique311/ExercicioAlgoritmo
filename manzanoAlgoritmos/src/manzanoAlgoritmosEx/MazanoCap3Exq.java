package manzanoAlgoritmosEx;

import java.util.Scanner;

public class MazanoCap3Exq {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double areaTotal = 0.0;
        String continuar;

        do {
            System.out.print("Informe o nome do cômodo: ");
            String comodo = scanner.nextLine();

            System.out.print("Informe a largura do cômodo (em metros): ");
            double largura = scanner.nextDouble();

            System.out.print("Informe o comprimento do cômodo (em metros): ");
            double comprimento = scanner.nextDouble();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("A área do cômodo '%s' é: %.2f m²%n", comodo, areaComodo);

            System.out.print("Deseja calcular a área de outro cômodo? (SIM/NÃO): ");
            scanner.nextLine(); 
            continuar = scanner.nextLine().trim().toUpperCase();

        } while (continuar.equals("SIM"));

        System.out.printf("A área total da residência é: %.2f m²%n", areaTotal);

        scanner.close();
    }

	}

