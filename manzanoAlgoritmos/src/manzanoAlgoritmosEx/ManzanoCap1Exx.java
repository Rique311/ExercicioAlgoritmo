package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exx {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double base, indice, resultado;

System.out.println("Informe a base da raíz");
base = scan.nextDouble();
System.out.println("Informe o indice da raíz");
indice = scan.nextDouble();

resultado = Math.pow(base, 1.0 / indice);
System.out.println("O resultado é" + resultado);

scan.close();
	}

}
