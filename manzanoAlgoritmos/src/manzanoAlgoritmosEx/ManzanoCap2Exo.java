package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exo {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int N, resultado;
System.out.println("Informe o número");
N = scan.nextInt();

resultado = N*2;
if (resultado > 30) {
	System.out.println("O resultado da multiplicação é" + resultado);
} else {
	System.out.println("Valor não informado");
}
scan.close();
	}

}
