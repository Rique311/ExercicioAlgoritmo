package manzanoAlgoritmosEx;

public class ManzanoCap3Exk {

	public static void main(String[] args) {
	        long graosNoQuadro = 1; // Número de grãos no primeiro quadro
	        long somatorio = 0;    // Soma total dos grãos

	        System.out.println("Quadro\tGrãos no quadro\tSomatório");

	        for (int quadro = 1; quadro <= 64; quadro++) {
	            somatorio += graosNoQuadro; // Atualiza o somatório com os grãos do quadro atual

	            // Exibe os valores
	            System.out.println(quadro + "\t" + graosNoQuadro + "\t\t" + somatorio);

	            graosNoQuadro *= 2; // Dobra o número de grãos para o próximo quadro
	        }
	        }
		}
