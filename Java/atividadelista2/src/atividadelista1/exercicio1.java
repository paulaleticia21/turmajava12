package atividadelista1;


import java.io.InputStream;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		
		
		
		//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 

		
		try (Scanner ler = new Scanner(System.in)) {
			
			String nome ;
			int ano , mes , dia ;
			
			
			System.out.println ( " Digite o seu nome") ;
			
			nome = ler.nextLine();
			
			System.out.println ( "escreva a sua idade em ano " );
			ano = ler.nextInt();
			
			System.out.println("escreva a sua idade em meses");
			 int meses = ler.nextInt();
					
			System.out.println("escreva a sua idade em dia");
			int dia1 = ler.nextInt();
			 
			dia1 = (dia1 + (ano * 365 ))+ (meses * 30);
			
			 System.out.println("Seu dia é " + dia1);
		}
			
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}

				 

