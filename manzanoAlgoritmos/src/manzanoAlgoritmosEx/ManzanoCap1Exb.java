package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a temperatura em Fahrenheit");
		double fahr = scan.nextDouble();
		double c = (fahr - 32)*(5.0/9.0);
		System.out.println(c);
		scan.close();

			}
	}


