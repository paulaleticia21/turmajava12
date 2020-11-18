package Entidades;

import java.util.Scanner;

public class aplicação2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		Empregado operario = new Empregado("Leticia");
		
		System.out.println("Digite o Codigo do Setor");
		operario.setCodigoSetor(leia.nextInt());
		
		System.out.println("Digite o Salario:");
		operario.setSalarioBase(leia.nextDouble());
		
		System.out.println("Digite o Imposto:");
		operario.setImposto(leia.nextDouble());
		
		System.out.println("Valor do imposto : "+ operario.getCodigoSetor());
		
		
		
		System.out.println("Seu Saldo é :"+ operario.calcularSalario());
		
		
		
	}

}
