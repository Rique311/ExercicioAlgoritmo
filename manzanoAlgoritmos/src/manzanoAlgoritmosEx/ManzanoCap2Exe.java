package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Informe o valor de A");
		a = scan.nextDouble();
		System.out.println("Informe o valor de B");
		b = scan.nextDouble();
		System.out.println("Informe o valor de C");
		c = scan.nextDouble();

		delta = (b * b) + (-4 * (a * c));
		
		if (delta <= 0) {
			System.out.println("Não há solução real");
		}
		if (delta >= 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta = " + delta + ". Há duas soluções reais:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else  if( delta == 0) {
			double x = -b / (2 * a);
			System.out.println("A única solução é" + x);
		} 
		
			scan.close();
		}
	}
