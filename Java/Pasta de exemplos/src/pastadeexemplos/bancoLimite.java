package pastadeexemplos;

import java.util.Scanner;

public class bancoLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		String Limite;
		double emprestimo;
		double totalemprestimo = 100.00;
		String confirma;
		double valor = 0;
		double saldo = 0;
			
		
		
		System.out.println("DESEJA FAZER O EMPRESTIMO ?");
		confirma = leia.next();

		if (confirma.equals("sim")) {

			System.out.println("O SEU LIMITE DE EMPRESTIMO É DE R$:" + totalemprestimo);

			System.out.println("QUAL O VALOR DO EMPRESTIMO DESEJADO:");

			emprestimo = leia.nextInt();

			if (emprestimo > totalemprestimo) {

				System.out.println(" O limite de emprestimo Ultrapassou:");
				System.out.println(" Seu limite é de R$:" + totalemprestimo);

			} else if (emprestimo <= 0) {
				System.out.println(" Valor invalido");

			} else {
				totalemprestimo = totalemprestimo - emprestimo;

				saldo = saldo + emprestimo;

				System.out.println(" Saldo atual R$: " + saldo);
				System.out.println("Limite de emprestimo atual R$:" + totalemprestimo);

			}
			//MOVDIA --;
		}

		else if (confirma.equals("nao")) {
			System.out.print("O BANCO AGRADECE");

		}
		
	}
	

}
