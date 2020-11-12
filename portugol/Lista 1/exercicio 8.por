programa
{
	
	funcao inicio()
	{
		real preco, pordist, porimposto, total

	// Entrada
		escreva("digite o custo da fabrica:")
		leia (preco)

		//Processadores
		pordist = preco * 0.8
		escreva(pordist)
		porimposto = preco * (45/100)
		total = preco + pordist + porimposto
		escreva(" o Preço Final a Pagar é de :" + total) 2
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 335; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */