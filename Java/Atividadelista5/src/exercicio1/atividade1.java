package exercicio1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
/*1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o pre�o normal de etiqueta e a escolha da condi��o de pagamento. Utilize os c�digos da tabela a seguir para ler qual a condi��o de pagamento escolhida e efetuar o c�lculo adequado.
C�digo Condi��o de pagamento
1 � vista em dinheiro ou cheque, recebe 20% de desconto
2 � vista no cart�o de cr�dito, recebe 15% de desconto
3 Em duas vezes, pre�o normal de etiqueta sem juros
4 Em tr�s vezes, pre�o normal de etiqueta mais juros de 10%*/

		
		int quantidade = 1;
		int qnt_total = 0;
		double valorunitario =0;
		double valorproduto = 0;
		double valor , total = 0;
		int esc = 0 ;
		
		
		
		
					
		
									
			System.out.print("\nDIGITE A FORMA DE PAGAMENTO\n");
			
			System.out.print("\nDIGITE � VISTA , DINHEIRO / CHEQUE");
			System.out.print("\nDIGITE  � VISTA , CART�O DE CREDITO");
			System.out.print("\nCREDITO , EM 2X SEM JUROS");
			System.out.print("\nCREDITO , EM 3X COM ACRESCIMO DE 10 %  DE JUROS ");
			esc = leia.nextInt();
			
			if (esc  ==  1) {
			
				System.out.print("\nDIGITE � VISTA , DINHEIRO / CHEQUE\n" + (total-(total * 20/100)));
			
			}	
			else if  ( esc == 2 ) {
				System.out.print("\nDIGITE  � VISTA , CART�O DE CREDITO\n"+(total-(total*15/100)));
				
				
			}
			
						
			if (esc  ==  3) {
				
				System.out.print("\nCREDITO , EM 2X SEM JUROS\n" + total);
			
			}	
			else if  ( esc == 4 ) {
				System.out.print("\nCREDITO , EM 3X COM ACRESCIMO DE 10 %  DE JUROS"+(total-(total*10/100)));
			}

		
		

		}
	}




