package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Exf {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int va, vb;
System.out.println("Informe o valor da variável A");
va = scan.nextInt();
System.out.println("Informe o valor da variável B");
vb=scan.nextInt();
System.out.println("A = " + va);
System.out.println("B = " + vb);
int troca = va;
va = vb;
vb = troca;
System.out.println("A = " + va);
System.out.println("B = " + vb);
scan.close();

	}

}
