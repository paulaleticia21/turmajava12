package atividadelista1;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor. 


		
		Scanner ler = new Scanner (System.in);
		
	double preco = 0;
	double pordist ;
	double porimposto;
	double total;
	
	       System.out.println("Custo de Fabrica");
	        
	      preco = ler.nextDouble();
	
	
	        pordist = preco * 0.8 ;
	        
	        
			System.out.println(pordist);
			
			porimposto = preco * (45/100);
			
			total = preco + pordist + porimposto;
			
			System.out.println("O pre�o Total � " + total);
			
	}

}
