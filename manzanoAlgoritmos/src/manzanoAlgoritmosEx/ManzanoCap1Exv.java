package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exv {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int base,expoente, resultado;
	System.out.println("Informe o valor da base da potência");
	base = scan.nextInt();
	System.out.println("Informe o valor do expoente da potência");
	expoente = scan.nextInt();
	
	resultado = (int) Math.pow(base, expoente);
	
	System.out.println("O resultado é:" + resultado);
	
	scan.close();

	}

}
