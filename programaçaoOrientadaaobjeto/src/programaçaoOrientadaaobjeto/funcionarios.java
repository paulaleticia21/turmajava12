package programa�aoOrientadaaobjeto;

import java.util.Scanner;

public class funcionarios {

	public static void main(String[] args) {
		// 4) Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.


		Scanner leia = new Scanner (System.in);
		Pessoa cliente = new Pessoa ("Boa tarde ADMINISTRADOR");
		
		System.out.println(cliente.nome);

		System.out.print("Digite O NOME DO FUNCIONARIO");
		objetofuncionario.nomefuncionario = leia.next();
		
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();
		
		
		System.out.print("Digite a quantidade de funcionario");
		objetofuncionario.qntfuncionario = leia.nextInt();
		
		System.out.print(" O salario de cada funcionario � de :");
		
		System.out.println(objetofuncionario.salariofuncionario);
		
		
		
	}

}
