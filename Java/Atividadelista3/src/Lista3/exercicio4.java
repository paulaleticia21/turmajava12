package Lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
/*2- Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  (imprimindo o novo valor) até que ele seja maior do que 100. Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/
		
		Scanner leitura = new Scanner (System.in);
			
		int i = 0 , numero;
		
		System.out.print( " Digite o Valor Positivo");
		numero = leitura.nextInt();
		
		
		while ( i <= 100){
			
			if ( numero == i) {
				System.out.printf ( i  + " ");
			}
		
	
			i = i * 3;
		System.out.printf( i +" ");
	}
}
}