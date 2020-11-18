package programaçaoOrientadaaobjeto;

import java.util.Scanner;

public class Aluno {
	
	
	public static void main (String []args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
	matrialuno aluno = new matrialuno ();
	System.out.println(aluno.getMatricula());
	
	System.out.println("DIGITE O NOME DO ALUNO");
	System.out.println(aluno.nome());
	
	System.out.println("DIGITE O ANO DE NASCIMENTO DO ALUNO");
	System.out.println(aluno.anoNascimento);
	
	System.out.println("DIGITE O GENERO DO ALUNO");
	System.out.println(aluno.genero);
	
	
	
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
