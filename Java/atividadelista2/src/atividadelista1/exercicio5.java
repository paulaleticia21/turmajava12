package atividadelista1;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		double nota1, nota2, nota3;
		double media;
		
		System.out.println ( "Digite a nota 1 " );
		
		nota1 = ler.nextDouble();
		
		System.out.println ( "Digite a nota " );
		
		nota2 = ler.nextDouble();
		
		System.out.println ( "Digite a nota " );
		
		nota3 = ler.nextDouble();
		
		media = (nota1 * 2 ) + (nota2 * 3) + (nota3 * 5) / 10 ;
		
		System.out.println ( "A media Ponderada é " + media);
		
		

	}

}
