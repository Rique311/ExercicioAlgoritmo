package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exb {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int N;
System.out.println("Informe o valor do número N");
N = scan.nextInt();
if (N < 0) {
    N = N * -1; 
}
System.out.println("O valor positivo é: " + N);
scan.close();
	}

}
