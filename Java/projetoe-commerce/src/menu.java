import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);
		
		String produtos[] = {"leite","biscoito","Veja","revista","cloro","refrigerante","parafuso","lâmpada","papel-toalha","papel higiênico"};
		String unidadeProdutos[] = {"litro","pacote","unidade","unidade","litro","unidade","pacote","unidade","pacote","pacote"};
		
		String codigos[] = new String [10];
		int esc = 0;
		
		int quantidade=0;
	
		
		for 
		(int x = 0; x < 1; x++) {
		
		
		
		
		System.out.println("COD \t\t NOME DO PRODUTO" ); 
		
		System.out.printf("\n 1 \t\t LEITE \n");
		System.out.printf("\n 2 \t\t BISCOITO \n" );
		System.out.printf("\n 3 \t\t VEJA  \n" );
		System.out.printf("\n 4 \t\t REVISTA \n" );
		System.out.printf("\n 5 \t\t CLORO \n" );
		System.out.printf("\n 6 \t\t REFRIGERANTE \n" );
		System.out.printf("\n 7 \t\t PARAFUSO \n");
		System.out.printf("\n 8 \t\t LAMPADA \n");
		System.out.printf("\n 9 \t\t PAPEL-TOALHA\n" );
		System.out.printf("\n 10\t\t PAPAL-HIGIENICO \n");
		
		esc = leia.nextInt();
		
		while (esc) {
			
		
		
		if (esc  ==  1) {
			
			
			System.out.printf("\nl LEITE \n"  );
		
			
		}
		
		else if ( esc == 2) {
			System.out.printf("\nl BISCOITO \n" );
		}
			
			
	
		else if ( esc == 3) {
			System.out.printf("\nl VEJA \n" );
		}
			
		else if ( esc == 4) {
			System.out.printf("\nl REVISTA \n");
		}
			
			
		else if ( esc == 5) {
			System.out.printf("\nl CLORO \n");
		}
			
		else if ( esc == 6) {
			System.out.printf("\nl REFRIGERANTE \n" );
		}
			
		else if ( esc == 7) {
			System.out.printf("\nl PARAFUSO \n" );
		}
			
		else if ( esc == 8) {
			System.out.printf("\nl LAMPADA\n" );
		}
			
		else if ( esc == 9) {
			System.out.printf("\nl PAPEL TOALHA \n" );
		}
			
		else if ( esc == 10) {
			System.out.printf("\nl PAPEL HIGIENICO \n" );
			
		}
				System.out.println(" Valor invalido");

		}
		
		}	
		}
	}






