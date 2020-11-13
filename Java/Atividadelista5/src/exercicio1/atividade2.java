package exercicio1;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
/*2-  	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta.
A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso*/
	
		Scanner leia = new Scanner (System.in);
		
		double peso , altura , imc;
		String nome ;
		int idade;
		
		
		System.out.println( "Digite o seu nome");
		nome = leia.nextLine();
		
		System.out.println( "Digite a sua idade ");
		idade = leia.nextInt();
		
		System.out.println( "Digite o seu peso  ");
		peso = leia.nextDouble();
		
		System.out.println( "Digite a sua Altura  ");
		altura = leia.nextDouble();
		
		
		imc = peso / altura *2;
		
		
		if ( imc <= 18.5) {
			System.out.println( "abaixo do peso");
		}
		else if (imc <= 25) {
			System.out.println( "Peso normal ");
		}
		
		else if (imc <= 30) {
			System.out.println( "acima do peso ");
		}
		else {
			System.out.println( "Fora do peso");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
