programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{


		/*4-  	Faça um programa que calcula e escreve a seguinte soma: soma = 1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50 */



		// Variavel
		inteiro x = 1 
		real y = 1.0
		real soma
		real resultado = 0.0 
	


		//Processo

		enquanto (x <= 99 ) {

		 soma  = x / y

		 
		 x = x + 2
		 
		 y = y + 1

		escreva ( "\n O valor é :")
		 
				 
		 escreva ("\n" , x , "/" , y, " = " ,soma, " +\n") 
		 
		
		 
		   resultado = resultado + soma 
		   
		   
		   escreva ( " valor do resultado:", resultado) 
		 
	}

		 
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */