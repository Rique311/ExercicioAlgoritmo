package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exq {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double a, raio;
System.out.println("Informe o valor do raio da circunferência");
raio = scan.nextDouble();
a = 3.14159265*raio*raio;
System.out.println("O valor da circunferência é" + a);
scan.close();
}
}

