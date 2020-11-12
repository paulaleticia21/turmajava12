package Lista3;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	
		Scanner leitura = new Scanner (System.in);
		
		
		double salario = 0;
		double maiorsalario = 0;
		double mediasalario =0;
		double numfilhos = 0;
		double mediafilhos =0;
		double totalsalario = 0 ;
		double totalfilho = 0;
		int x = 0;
		int porcentagem = 0;
		int numsalario =0;
		
		
		for ( x = 1 ; x <= 2; x++) {
			
		}
		System.out.print("Qual é o seu salario");
		salario = leitura.nextDouble();
		System.out.print("Quantos filhos vc tem ");
		numfilhos= leitura.nextDouble();
		
		if ( salario > maiorsalario) {
			 maiorsalario = salario;
		}
		totalsalario = totalsalario +salario;
		totalfilho = totalfilho + numfilhos;
		
		
		if ( salario  <= 10) {
			numsalario = numsalario +1;
			System.out.print(numsalario);
			
			System.out.print(" ");
			
			
		
		
		
	}
	
	
	mediasalario = totalsalario / 20;
	int totalfilhos;
	mediafilhos = totalfilho / 20 ;
	porcentagem = (numsalario *100/20);
	
	
	System.out.printf("A media de salario é de :"+ mediasalario+ "\n" + " A media de filhos é de:"+mediafilhos+"\n"+" O Maior salario é de :"+maiorsalario+"\n"+"O NUMERO E A PORCENTAGEM DE SALARIO É IGUAL O MENOR A R$ 100,00 É DE:"+numsalario+ " pessoas"+porcentagem+"\n");
	
	
	}
}
	
	
	
	
	
	
	



