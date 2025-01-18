package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exl {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int N;
System.out.println("Informe o valor do número");
N = scan.nextInt();
if (!(N > 3)) {
	System.out.println(" O valor informado é" + N);
	
} else {
	System.out.println("Valor não reconhecido");
}
scan.close();
	}

}
