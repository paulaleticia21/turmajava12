programa
{
	
	funcao inicio()
	{
		inteiro Ano, dia , meses


		escreva (" Escreva com a sua idade somente  ano ")
		leia (Ano)
		escreva (" Escreva com a sua idade o mes ")
		leia (meses)
		escreva (" escreva com sua idade somente o dia")
		leia (dia)
		
		// Processamento 
		
		dia =(dia+(Ano*365)+(meses*30))
		
		escreva ( " Seu dia ", + dia)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */