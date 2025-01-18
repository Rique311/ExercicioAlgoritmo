package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, resultado;
		System.out.println(" Informe a primeira nota do aluno");
		n1 = scan.nextDouble();
		
		System.out.println(" Informe a segunda nota do aluno");
		n2 = scan.nextDouble();

		System.out.println(" Informe a terceira nota do aluno");
		n3 = scan.nextDouble();

		System.out.println(" Informe a quarta nota do aluno");
		n4 = scan.nextDouble();

		resultado = (n1+n2+n3+n4)/4;

if (resultado > 5) {
	System.out.println("Aluno aprovado" + resultado);
}
else {
System.out.println("Aluno reprovado" + resultado);
}
		scan.close();

	}

}
