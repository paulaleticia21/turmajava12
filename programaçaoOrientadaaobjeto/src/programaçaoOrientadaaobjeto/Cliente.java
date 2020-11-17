package programaçaoOrientadaaobjeto;

import java.util.Scanner;

public class Cliente {
	
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.

	
	public static void main(String[] args) {
	
	
		Scanner leia = new Scanner (System.in);
		
		Pessoa cliente = new Pessoa("Olá CLIENTE PAULA LETICIA");
		
		System.out.println(cliente.nome);
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();
		
		System.out.print("Digite o Ano de Nascimento");
		cliente.nascimento = leia.nextInt();
		
		System.out.print("Digite a sua idade");
		cliente.idade = leia.nextInt();
		System.out.println(cliente.idade);
			
		System.out.print("Digite o seu genero");
		cliente.genero = (boolean) leia.nextBoolean();
		
		System.out.println(" Informe o Ano");
		
		cliente.idade(2020);
				
		System.out.print(cliente);
		
		System.out.println(cliente.idade);
		
		
		
	
	}	

}
