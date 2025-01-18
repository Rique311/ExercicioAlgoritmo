package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exg {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int a,b,c,d;
System.out.println("Informe o valor de A");
a = scan.nextInt();
System.out.println("Informe o valor de B");
b = scan.nextInt();
System.out.println("Informe o valor de C");
c = scan.nextInt();
System.out.println("Informe o valor de D");
d = scan.nextInt();

System.out.println("\nResultados das adições:");
System.out.println("A + B = " + (a + b));
System.out.println("A + C = " + (a + c));
System.out.println("A + D = " + (a + d));
System.out.println("B + C = " + (b + c));
System.out.println("B + D = " + (b + d));
System.out.println("C + D = " + (c + d));

System.out.println("\nResultados das multiplicações:");
System.out.println("A * B = " + (a* b));
System.out.println("A * C = " + (a * c));
System.out.println("A * D = " + (a * d));
System.out.println("B * C = " + (b * c));
System.out.println("B * D = " + (b * d));
System.out.println("C * D = " + (c * d));
scan.close();
	}

}
