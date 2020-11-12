programa
{
	
	funcao inicio()
	{
		// variavel
		real a, b, c, d ,ex, f , x , y 

		// Entrada
		escreva ( " valor de a:")
		leia (a)
		escreva ( " valor de b:")
		leia (b)
		escreva ( " valor de c:")
		leia (c)
		escreva ( " valor de d:")
		leia (d)
		escreva ( " valor de e:")
		leia (ex)
		escreva ( " valor de f:")
		leia (f)

		//Processadores
	    x = ((c*ex) - (b*f)) / ((a*ex)-(b*d))
         y = ((a*f)-(c*d))/((a*ex)-(b*d))

         escreva("RESULTADOS:\n")
         escreva ("Valor de X: ", x)
         escreva("\nValor de Y: ", y)
         
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */