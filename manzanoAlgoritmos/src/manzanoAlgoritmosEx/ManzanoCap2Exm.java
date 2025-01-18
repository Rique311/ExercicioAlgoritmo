package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String nome, sexo;

		System.out.println("Informe o nome do bebê");
		nome = scan.next();

		System.out.println("Informe o sexo do bebê");
		sexo = scan.next();

		if (sexo.equalsIgnoreCase("M")) {
			System.out.println("Ilmo. Sr. " + nome);
		} else if (sexo.equalsIgnoreCase("F")) {
			System.out.println("Ilma. Sra. " + nome);
		} else {
			System.out.println("Sexo informado inválido.");

		}
		scan.close();
	}
}
