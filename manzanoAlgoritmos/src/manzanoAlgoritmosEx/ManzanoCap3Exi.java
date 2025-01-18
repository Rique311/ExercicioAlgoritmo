package manzanoAlgoritmosEx;

public class ManzanoCap3Exi {

	public static void main(String[] args) {
		int atual= 0, anterior = 0, proximo =0;

		for (int i = 0; i < 15; i++) {
			atual = anterior + i;
			anterior = atual;
			anterior = i + anterior;
			atual = proximo;
			proximo = atual + anterior;
			System.out.println(proximo);
		}
	}

}
