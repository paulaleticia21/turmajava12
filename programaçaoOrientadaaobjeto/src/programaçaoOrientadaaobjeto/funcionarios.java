package programaçaoOrientadaaobjeto;

import java.util.Scanner;

public class funcionarios {

	public static void main(String[] args) {
		// 4) Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.


		Scanner leia = new Scanner (System.in);
		Pessoa cliente = new Pessoa ("Boa tarde ADMINISTRADOR");
		
		System.out.println(cliente.nome);

		System.out.print("Digite O NOME DO FUNCIONARIO");
		objetofuncionario.nomefuncionario = leia.next();
		
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();
		
		
		System.out.print("Digite a quantidade de funcionario");
		objetofuncionario.qntfuncionario = leia.nextInt();
		
		System.out.print(" O salario de cada funcionario é de :");
		
		System.out.println(objetofuncionario.salariofuncionario);
		
		
		
	}

}
