package atividadelista1;

import java.util.Scanner;

public class exercicio7 {

	
	
	public static void main(String[] args) {
		
		
		//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

		
	  Scanner ler = new Scanner ( System.in);
	  
	  
	  double a, b, c, d ,e, f , x , y ;
	  
	  System.out.println("Digite o valor de A");
	 
	  a = ler.nextDouble();
	  
	  System.out.println("Digite o valor b");
		 
	  b = ler.nextDouble();
	  
	  System.out.println("Digite o valor de C");
		 
	  c = ler.nextDouble();
	  
	  System.out.println("Digite o valor de D");
		 
	  d = ler.nextDouble();
	  
	  System.out.println("Digite o valor de e");
		 
	  e = ler.nextDouble();
	  
	  System.out.println("Digite o valor de F");
		 
	  f = ler.nextDouble();
	  
	  
	  x = ((c*e)) - (b*f) / (a*e)- (b*d);
	  
	  y = (a*f) - (c*d)/(a*e)- (b*d); 
	  
	  
	  System.out.println("Escreva os Resultados");
	  
	  System.out.println("Valor de x"+ x);
	  
	  System.out.println("valor de y" + y);
	  
	  
	  
	    
	  

	  
	}
}
