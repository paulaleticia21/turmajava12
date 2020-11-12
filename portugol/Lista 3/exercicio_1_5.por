programa
{
	/*Elabore um programa que calcule o que deve ser pago por um produto, 
	 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
	 * Utilize os códigos da tabela a seguir para ler qual a condição de pagamento escolhida e efetuar o cálculo adequado.
	 * Código Condição de pagamento
	 *1 À vista em dinheiro ou cheque, recebe 20% de desconto
	 *2 À vista no cartão de crédito, recebe 15% de desconto
	 *3 Em duas vezes, preço normal de etiqueta sem juros
	 *4 Em três vezes, preço normal de etiqueta mais juros de 10%
 	*/
	funcao inicio()
	{
		real valor, somafinal
		inteiro esc


		//entrada
		escreva("DIGITE O VALOR DO PRODUTO:R$ ")
		leia(somafinal) 
		escreva(" ")
 		escreva("DIGITE A FORMA DE PAGAMENTO: ")
 		escreva("\n1 - À VISTA, DINHEIRO/CHEQUE")
 		escreva("\n2 - À VISTA, CARTÃO DE CRÉDITO")
 		escreva("\n3 - CRÉDITO, EM 2X SEM JUROS")
 		escreva("\n4 - CRÉDITO, EM 3X COM ACRESCIMO DE 10% DE JUROS\n")
 		leia(esc)


 		se (esc==1)
 		{
 			escreva("PAGAMENTO A VISTA: R$",(somafinal-(somafinal*20/100)))

 			
 		}
 		senao se (esc==2)
 		{
 			
 			
 			escreva("PAGAMENTO NO CRÉDITO À VISTA: R$ ",somafinal-(somafinal*15/100)))

 			
 		}
 		
 		se (esc==3)
 		{
 			escreva("PAGAMENTO NO CRÉDITO EM DUAS VEZES SEM JUROS: R$ ",somafinal)
 		}
 		
 		
 		senao se(esc==4)
 		{
 			escreva("PAGAMENTO NO CRÉDITO EM TRÊS VEZES COM ACRESCIMO DE 10% DE JUROS: R$ ",somafinal+(somafinal*10/100)))
 		}

		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */