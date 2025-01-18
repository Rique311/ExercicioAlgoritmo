package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap3Exb {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Informe um número");
int a = scan.nextInt();
for(int i=1;  i<11; i++) {
	  System.out.println(a + " x " + i + " = " + (a * i));
}
scan.close();
	}

}
