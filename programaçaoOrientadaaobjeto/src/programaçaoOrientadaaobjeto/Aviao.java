package programa�aoOrientadaaobjeto;

import java.util.Scanner;

public class Aviao {
	
	
	//2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente as informa��es deste objeto no console.

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Pessoa cliente = new Pessoa ("Boa tarde Passageiros");
		
		System.out.println(cliente.nome);
		
		System.out.print("Digite o SEU CPF");
		cliente.cpf = leia.nextInt();
		
		System.out.print("Digite o horario do embaraque");
		objetoaviao.horario = leia.nextDouble();
		
		System.out.print("Digite o numero do passageiro");
		objetoaviao.numeropassageiro = leia.nextInt();
		
		System.out.print("Digite o numero da poutrona");
		objetoaviao.numeropoutrona = leia.nextInt();
		
		System.out.print("Digite o numero do acento");
		objetoaviao.nomeacento = leia.next();
		
	}
}
