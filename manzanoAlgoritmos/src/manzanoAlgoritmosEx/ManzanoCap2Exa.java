package manzanoAlgoritmosEx;

import java.util.Scanner;

public class ManzanoCap2Exa {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		int a,b, resultado;
System.out.println("Informe o valor do número A");
a = scan.nextInt();
System.out.println("Informe o valor do número B");
b = scan.nextInt();
if (a >b) {
resultado = a-b;

} else {
    resultado = b - a; 
}
System.out.println("A diferençã do maior valor para o menor é:" + resultado);
scan.close();
}

}
