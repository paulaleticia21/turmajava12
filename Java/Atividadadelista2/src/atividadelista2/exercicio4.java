package atividadelista2;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

		Scanner leitura = new Scanner ( System.in);
		
		int numerointeiro = 0;
		
		
		System.out.print("Digite um numero ");
		
		numerointeiro = leitura.nextInt();
		
		if (numerointeiro > 0 ) {
			System.out.print("Esse Numero é POSITIVO");
			
			
		}
		else if (numerointeiro < 0 ) {
			System.out.print("Esse Numero é NEGATIVO");
		}
		
		if (numerointeiro % 2 == 0 ) {
			System.out.print("\nPAR");
		}
		
		else if (numerointeiro % 2 != 0) {
			System.out.print("\nIMPAR");
		}
		

	}

	
		
	}


