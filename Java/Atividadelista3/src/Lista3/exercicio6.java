package Lista3;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		int soma = 0;
		int numero = 0 ;
		
		
		System.out.print( " Digite o numero");
		numero = leitura.nextInt();
		do {
			soma = soma + numero;
			numero = ( numero -1);
		
		}while ( numero >= 0); {
			System.out.print( " " + soma);
		}
	}

}
