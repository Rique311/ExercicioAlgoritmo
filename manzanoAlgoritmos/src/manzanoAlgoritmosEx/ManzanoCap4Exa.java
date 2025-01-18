package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap4Exa {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

 String [] nome = new String[10];

 System.out.println("Informe os nomes");
for (int i=0; i<nome.length; i++) {
	
nome[i] = scan.next();
}


System.out.println("Nomes informados:");
for (int i = 0; i < nome.length; i++) {
System.out.println(nome[i]);
	}
scan.close();
}
	}
