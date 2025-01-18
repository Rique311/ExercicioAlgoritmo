package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, n5, md1, md2;

		System.out.println(" Informe a primeira nota do aluno");
		n1 = scan.nextDouble();

		System.out.println(" Informe a segunda nota do aluno");
		n2 = scan.nextDouble();

		System.out.println(" Informe a terceira nota do aluno");
		n3 = scan.nextDouble();

		System.out.println(" Informe a quarta nota do aluno");
		n4 = scan.nextDouble();

		md1 = (n1 + n2 + n3 + n4) / 4;

		if (md1 > 7) {
			System.out.println("Aluno aprovado" + md1);
		} else {
			System.out.println("Informe a quinta nota");
			n5 = scan.nextDouble();

			md2 = (md1 + n5) / 2.0;

			if (md2 >= 5.0) {
				System.out.println("Aprovado em exame com média: " + md2);
			} else {
				System.out.println("Reprovado com média: " + md2);
			}
		}
		scan.close();
	}
}
