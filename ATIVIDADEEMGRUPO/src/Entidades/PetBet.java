package Entidades;

import java.util.Scanner;

public class PetBet {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner (System.in);
		Pessoa cliente = new Pessoa("Leticia", "Silva");
		Pessoa cliente2 = new Pessoa ("Ricardo");
		
		
		Entrega entrega = new Entrega ();
		
		Produto produto1 = new Produto ();
		
		
		
		Cachorro dog1 = new Cachorro ("YASHA");
		Cachorro dog2 = new Cachorro ("PITBULL");
		
		
		
		System.out.println(cliente.nome);
		System.out.println(cliente.sobrenome);
		System.out.print("Digite o Sobrenome");
		cliente.sobrenome = leia.next();
		System.out.print("Digite o Ano de Nascimento");
		cliente.anoNascimento = leia.nextInt();		
		System.out.print(cliente.nome);
		cliente.idade();
		System.out.println(cliente.idade);
		System.out.println(" Informe o ano");
		cliente.pegaidade(2020);
		System.out.println(cliente.idade);
		
		
		
	
		
		
		
		
		
		
		

	}

}
