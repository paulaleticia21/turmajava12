package exercicio1;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
/*1-  	Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
Código Condição de pagamento
1 À vista em dinheiro ou cheque, recebe 20% de desconto
2 À vista no cartão de crédito, recebe 15% de desconto
3 Em duas vezes, preço normal de etiqueta sem juros
4 Em três vezes, preço normal de etiqueta mais juros de 10%*/

		
		int quantidade = 1;
		int qnt_total = 0;
		double valorunitario =0;
		double valorproduto = 0;
		double valor , total = 0;
		int esc = 0 ;
		
		
		
		
					
		
									
			System.out.print("\nDIGITE A FORMA DE PAGAMENTO\n");
			
			System.out.print("\nDIGITE Á VISTA , DINHEIRO / CHEQUE");
			System.out.print("\nDIGITE  É VISTA , CARTÃO DE CREDITO");
			System.out.print("\nCREDITO , EM 2X SEM JUROS");
			System.out.print("\nCREDITO , EM 3X COM ACRESCIMO DE 10 %  DE JUROS ");
			esc = leia.nextInt();
			
			if (esc  ==  1) {
			
				System.out.print("\nDIGITE Á VISTA , DINHEIRO / CHEQUE\n" + (total-(total * 20/100)));
			
			}	
			else if  ( esc == 2 ) {
				System.out.print("\nDIGITE  É VISTA , CARTÃO DE CREDITO\n"+(total-(total*15/100)));
				
				
			}
			
						
			if (esc  ==  3) {
				
				System.out.print("\nCREDITO , EM 2X SEM JUROS\n" + total);
			
			}	
			else if  ( esc == 4 ) {
				System.out.print("\nCREDITO , EM 3X COM ACRESCIMO DE 10 %  DE JUROS"+(total-(total*10/100)));
			}

		
		

		}
	}




