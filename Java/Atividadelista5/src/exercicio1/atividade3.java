package exercicio1;

import java.util.Scanner;

public class atividade3 {

	public static int main(String[] args) {
		/* 3-  	Escrever um programa que leia uma quantidade desconhecida de números e conte quantos deles estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve terminar quando for lido um número negativo.*/
		
		Scanner leia = new Scanner (System.in);
		
		int num=0;
		int qnt = 0;
		int num00_25 =0 ;
		int num26_50 =0 ;
		int num51_75 =0 ;
		int num76_100 =0 ;
		
		do {
			System.out.println("Entre com um numero");
			num = leia.nextInt();
			qnt++;
			
			if ( num >= 0 && num <=100){
			if (num <= 25) {
				num00_25++;
			}
			else {
				if (num <= 50)

					num26_50++;

					else {

					if (num <= 75)

					num51_75++;

					else

					num76_100++;

					}

					}

					}

					} while (num >= 0);

					
				
					println("\n Lidos &d números, sendo:" ,qnt);

					println("%d intervalo [0,25]\n",num00_25);

					println("%d  intervalo [26,50]\n",num26_50);

					println(" %d  intervalo [51,75]\n",num51_75);

					println("%d  intervalo [76,100]\n",num76_100);

					return(0);

					}

	private static void println(String string, int qnt) {
		// TODO Auto-generated method stub
		
	}

	
	}
			
			
			
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	


