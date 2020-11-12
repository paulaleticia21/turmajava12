programa
{
	
	funcao inicio()


	
	{
		/*Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.
*/

		 // variaveis 
		 
		inteiro valor = 1
		inteiro  c1= 0 , c2 = 0 , c3 = 0 , c4 = 0 



				//processo
		
		
		       

			escreva ( " digite o valor :")
			leia (valor)
		      

			 se (valor >= 0 e valor <= 25 ) {
			
				c1++
			}
			
			  senao se ( valor >= 26 e valor <= 50 ){
			  	c2++
			 	
			 }
			   senao se ( valor >= 51 e valor <= 75 ){
			  	 c3++
			  	
			  }
			   senao se ( valor >= 76 e valor <= 100 ){
			   	 
			   	 c4++
			     
			   }

			 
		        	 escreva ( "\nnumero digitado no inetrvalo  1:" ,c1)
			      escreva ( "\n numero digitado no intervalo 2:" ,c2)
				 escreva ( "\n numero digitado no intervalo 3:" ,c3)
				 escreva ( "\n numero digitado no intervalo 4:" ,c4)

				enquanto (valor <= 1) {
				
				
			}

		}
		
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1028; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */