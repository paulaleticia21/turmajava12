package atividadelista1;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		
		//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

		
		try (Scanner ler = new Scanner(System.in)) {
			String nome ;
			int ano , mes;
			short dia;
			
			System.out.println ( " Digite o seu nome") ;
			
			nome = ler.nextLine();
			
			System.out.println ( "escreva a sua idade em ano " );
			ano = ler.nextInt();
			
			System.out.println("escreva a sua idade em meses");
			 int meses = ler.nextInt();
					
			System.out.println("escreva a sua idade em dia");
			int dia1 = ler.nextInt();
			
			ano = (dia1) / 385 ;
			
			meses = (dia1 % 365)/30 ;
			
			dia1 = ( dia1 % 365)% 30 ; 
			
			System.out.println ("\nIdade em dias :" + dia1);
			
			System.out.println ("\nIdade em ano :" + ano);
			
			System.out.println ("\nIdade em meses :" + meses);	
			
		}
	}
					
			

}
