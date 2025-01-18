package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap4Exb {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
 int A [] = new int[8];
 int B [] = new int[8];
 System.out.println("Informe os 8 números");
 for(int i=0; i<8; i++) {
	 System.out.print("Número " + (i + 1) + ": ");
	 B[i] = scan.nextInt(); 
	 A[i] = B[i] * 5;
	 }
 for (int i = 0; i < 8; i++) {
     System.out.println("A[" + i + "] = " + A[i]);
 
 scan.close();
 }
}
	}
