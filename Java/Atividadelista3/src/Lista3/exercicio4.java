package Lista3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
/*2- Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  (imprimindo o novo valor) at� que ele seja maior do que 100. Ex.: se o usu�rio digita 5,  deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
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