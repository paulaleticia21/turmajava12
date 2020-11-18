package Entidades;

import java.util.Scanner;

public class aplicação1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);
		
		Fornecedor fornecedor1 = new Fornecedor("Leticia");
		
		System.out.println("Digite seu telefone:");
		fornecedor1.setTelefone(leia.next());
		
		System.out.println("Digite o Valor de Credito:");
		fornecedor1.setValorCredito(leia.nextDouble());
		
		System.out.println(" Digite o Valor da Divida:");
		fornecedor1.setValorDivida(leia.nextDouble());
		
		System.out.println("Valor Divida de "+ fornecedor1.getNome());
		System.out.println(fornecedor1.getValorDivida());
		
		System.out.println("Seu Saldo é :"+fornecedor1.obterSaldo());
	}

}
