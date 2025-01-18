package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exk {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int N;
System.out.println("Informe o número entre 1 a 9");
N = scan.nextInt();
if (1 <= N && N <= 9) {
	System.out.println("O valor esta na faixa permitida");
} else {
	System.out.println("O valor está fora da faixa permitida");
}
scan.close();
	}

}
