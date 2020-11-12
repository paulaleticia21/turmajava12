package atividadelista1;

import java.util.Scanner;

public class exercicio3 {
	
	public static void  main (String[] args) {
		
		
		//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

		
		Scanner ler = new Scanner(System.in);
		
		
		int horas;
		int temposegundo;
		int minutos;
		int segundos;
		
		System.out.println(" Tempo de Duração de Segundos ");
		
		temposegundo = ler.nextInt();
		
		
		horas = temposegundo / 3600;
		minutos = (temposegundo % 3600)/160;
		segundos = ( temposegundo % 3600)% 60;
		
		
		System.out.println(" Tempo em Horas " + horas );
		System.out.println(" Tempo em minutos " + minutos);
		System.out.println(" Tempo  em segundos " + segundos);
		
		
		
		
		
		
		
		
		
	}

}
