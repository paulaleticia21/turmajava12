import java.util.Scanner;

public class exemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leitura = new Scanner ( System.in);
		
		int idade;
		String Nome ;
		
		System.out.printf ( " entre com a sua Idade:");
		
		idade = leitura.nextInt();
		
		leitura .nextLine();//fAZENDO A LIMPEZA 
		
		
		System.out.printf("Entre com o Seu Nome :");
		
		Nome = leitura.nextLine();
		
		System.out.printf("\n seu Nome %s ", Nome);
		
		System.out.printf("\nSua idade %d" , idade);
		
		if ( idade >= 19) {
			System.out.println ( "\n Voce é maior de idade");
			
			
		}
		else if ( idade >= 1 &&  idade >18)
			System.out.println ( "\n Voce é maior de idade");
		
		
		else {
			System.out.println ( " Voce entrou com a idade invalida");
		}
	}

}
