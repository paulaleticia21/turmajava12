programa
{
	
	funcao inicio()
	{
		/*
		 * Faça um Sistema que leia o tempo de duração de um evento em uma Fabrica expressa em segundos e mostre-o expresso em horas, muitos e segundos 
		 */
		
		inteiro tempoSegundo
	     inteiro Minutos
		inteiro  Segundo
		inteiro Horas

		//Entrada
		escreva (" o tempo de duração do segundo:")
		leia (tempoSegundo)

		//processamento
		Horas = tempoSegundo / 3600
		Minutos = (tempoSegundo % 3600)/160
		Segundo = ( tempoSegundo % 3600)% 60

		escreva ("-----------")
		escreva ( "Horas:" + Horas)
		escreva ( " minutos:" + Minutos)
		escreva  ( " Segundos " + Segundo)
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */