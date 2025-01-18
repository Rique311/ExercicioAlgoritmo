package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exo {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		int a,b,c,d,produto1,produto2;

System.out.println("Informe o valor de A");
a = scan.nextInt();
System.out.println("Informe o valor de B");
b = scan.nextInt();
System.out.println("Informe o valor de C");
c = scan.nextInt();
System.out.println("Informe o valor de D");
d = scan.nextInt();

produto1 = a + c;
System.out.println("A soma de A + C é:" + produto1);

produto2 = b + d;
System.out.println("A soma de B + D é:" + produto2);

scan.close();
	}

}
