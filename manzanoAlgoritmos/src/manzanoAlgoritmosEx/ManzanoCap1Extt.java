package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap1Extt {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double velocidade, distancia, tempo; 

System.out.println("Informe a distância percorrida em kilometros");
distancia = scan.nextDouble();
System.out.println("Informe o tempo percorrida em hora");
tempo = scan.nextDouble();

velocidade =  (distancia* 1000) /(tempo* 60);
System.out.println("A velocidade média foi" + velocidade);

scan.close();
	}

}
