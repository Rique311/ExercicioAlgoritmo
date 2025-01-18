package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exw {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

double pes,valorpes= 0.3048, resultado;

System.out.println("Informe o valor em pés");
pes = scan.nextDouble();
resultado = pes*valorpes;
System.out.println("O número em metros é:" + resultado);
scan.close();
	}

}
