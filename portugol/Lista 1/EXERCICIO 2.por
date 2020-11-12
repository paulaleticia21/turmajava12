programa
{
	
	funcao inicio()
	{
		//Declaração de Variavel
	inteiro idade , anos , meses, dia
	
	
	//Entrada

	
	 escreva ( " IDADE em ano:")
	 leia (anos)
	 escreva (" IDADE EM DIA:")
	 leia (dia)
	 escreva ( " idade em meses :")
	 leia ( meses)
	 
	 

	 	//Processamentos
	 anos = (dia) /365
	 meses = (dia % 365)/30
	 dia = (dia % 365)%30 
	 escreva ( "/n IDADE EM DIAS:" + dia)
	 escreva("---------------------------")
	 escreva (" idade em anos:" + anos)
	 escreva("---------------------------")
	escreva (" idade em meses:"+ meses)
	 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 374; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */