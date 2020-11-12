package atividadelista2;

import java.util.Scanner;

public class aexercicio6 {

	public static void main(String[] args) {
		// 6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
		//Infantil A = 5 a 7 anos
				//Infantil B = 8 a 11 anos
				//Juvenil A = 12 a 13 anos
				//Juvenil B = 14 a 17 anos
				//Adultos = Maiores de 18 anos
		
		Scanner ler = new Scanner ( System.in);
		
		int idade;
		
		
		System.out.print(" Leia a Idade do Nadador ");
		idade = ler.nextInt();
		
		
		if (idade <=4 ) {
			System.out.print("\n MENOR DE IDADE , NÃO PODE NADAR ");
		}
			
		
		else if (idade >= 5 || idade == 7 ) {
			
			System.out.print(" Infantil A = 5 a 7 anos ");
		}
		else if (idade >= 8 || idade == 11 ) {
			System.out.print(" Infantil B = 8 a 11 anos ");
		}
		 if (idade >= 12 || idade == 13 ) {
			
			System.out.print("Juvenil A = 12 a 13 anos");
			
		 }
			
			else if (idade >= 14 || idade == 17 ) {
				
				System.out.print("Juvenil B = 14 a 17 anos"); 
		}
		
			else if ( idade >= 18 ) {
				
				System.out.print("Adultos = Maiores de 18 anos"); 
				
			}
		
		
		

	}

}
