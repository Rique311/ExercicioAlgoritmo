package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exu {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double volume, raio;
System.out.println("Informe o valor do raio  da circunferência");
raio = scan.nextDouble();
volume = (4 / 3) * 3.14159 * (raio*raio*raio);
System.out.println("O volume total é da esfera é:" + volume);


scan.close();
	}

}
