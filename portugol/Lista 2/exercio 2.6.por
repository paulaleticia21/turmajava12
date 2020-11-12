programa
{
	
	funcao inicio()
	{



		
		/*Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
*/


// entrada

        inteiro idade

// processo 
	escreva ("idade de um nadador")
	leia (idade)

//
	se ( idade <= 4){
	escreva ( "\n não tem idade suficiente para nadar")
	}

	senao se ( idade >= 5  e idade <= 7 ) 
		
	{
	escreva ("\n Infantil A de 5 a 7 Anos")
	}

	senao se ( idade >= 8  e idade <= 11 ){
	escreva ( "\n Inafntil B de 8 a 11 anos")
	}

	senao se ( idade >= 12  e idade <= 13){
	escreva ( "\n Juvenil A de 12 a 13 ANOS")
	}

	senao se ( idade >=14 e  idade <= 17 ){
	escreva ("\n Juvenil B de 14 a 17 anos")
	}

	senao se ( idade >= 18 ){
	escreva ( "\n Adultos MAIORES DE 18 ANOS" )
	}


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 786; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */