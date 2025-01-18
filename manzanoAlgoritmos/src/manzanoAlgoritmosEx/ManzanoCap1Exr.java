package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exr {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	        int candA, candB, candC, vtNulo, vtBranco;

	        System.out.println("Informe a quantidade de votos do candidato A");
	        candA = scan.nextInt();
	        System.out.println("Informe a quantidade de votos do candidato B");
	        candB = scan.nextInt();
	        System.out.println("Informe a quantidade de votos do candidato C");
	        candC = scan.nextInt();
	        System.out.println("Informe a quantidade de votos nulos");
	        vtNulo = scan.nextInt();
	        System.out.println("Informe a quantidade de votos em branco");
	        vtBranco = scan.nextInt();

	        // Cálculo do número total de eleitores
	        int totalEleitores = candA + candB + candC + vtNulo + vtBranco;

	        // Cálculo dos percentuais
	        double percVotosValidos = ((candA + candB + candC) / (double) totalEleitores) * 100;
	        double percCandA = (candA / (double) totalEleitores) * 100;
	        double percCandB = (candB / (double) totalEleitores) * 100;
	        double percCandC = (candC / (double) totalEleitores) * 100;
	        double percNulos = (vtNulo / (double) totalEleitores) * 100;
	        double percBranco = (vtBranco / (double) totalEleitores) * 100;

	        // Exibição dos resultados
	        System.out.println("\nResultado da eleição sindical:");
	        System.out.println("Total de eleitores: " + totalEleitores);
	        System.out.printf("Percentual de votos válidos: %.2f%%\n", percVotosValidos);
	        System.out.printf("Percentual de votos do candidato A: %.2f%%\n", percCandA);
	        System.out.printf("Percentual de votos do candidato B: %.2f%%\n", percCandB);
	        System.out.printf("Percentual de votos do candidato C: %.2f%%\n", percCandC);
	        System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
	        System.out.printf("Percentual de votos em branco: %.2f%%\n", percBranco);

	        scan.close();
	    }
	
}


