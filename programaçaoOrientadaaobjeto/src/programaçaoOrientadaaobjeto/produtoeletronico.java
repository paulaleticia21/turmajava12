package programaçaoOrientadaaobjeto;

import java.util.Scanner;

public class produtoeletronico {
	
	//3) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e apresente as informações deste objeto no console.

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	
	Pessoa cliente = new Pessoa ("Bem vindos");
	System.out.println(cliente.nome);
	
	System.out.print("Digite o SEU CPF");
	cliente.cpf = leia.nextInt();

	System.out.println("Digite o NOME DO PRODUTO");
	objetoprodutoeletronico.nomedoproduto = leia.nextLine();
	
	
	System.out.println("Digite O DEFEITO DO PRODUTO");
	objetoprodutoeletronico.defeito = leia.nextLine();
	
	
	System.out.println("Digite O NUMERO DO PROTOCOLO");
	objetoprodutoeletronico.numeroprotocolo =leia.nextInt();
	
	
	System.out.print("Digite O SALDO DEVEDOR");
	objetoprodutoeletronico. valorapagar = leia.nextDouble();
	

	
}
}
