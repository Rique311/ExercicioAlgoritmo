package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exa {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

System.out.println("Informa a temperatura em Celsius");
double c = scan.nextDouble();
double fahr = (9*c +160)/5;
System.out.println(fahr);
scan.close();

	}

}
