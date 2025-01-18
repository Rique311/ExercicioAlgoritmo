package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exs {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double a,b,resultado1,resultado2,resultado3,resultado4;

System.out.println("Informe o valor do primeiro número A");	
a = scan.nextDouble();

System.out.println("Informe o valor do segundo número B");
b= scan.nextDouble();
resultado1 = a+b;
resultado2 = a-b;
resultado3 = a*b;
resultado4 = a/b;
System.out.println("O valor das quatro operações básicas entre os números são:" + resultado1 + resultado2 + resultado3 + resultado4);


scan.close();

}
	}
