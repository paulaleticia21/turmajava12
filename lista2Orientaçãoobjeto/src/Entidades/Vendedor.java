package Entidades;

public class Vendedor extends Pessoa {
	
	
	//6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor tem como atributos da classe Pessoa e também os atributos próprios como valorVendas (correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado ao vencimento base do Vendedor). 

	
	public double valorVendas;
	public double comissao;
	
	public Vendedor(double valorVendas, double comissao) {
		super();
		this.valorVendas = valorVendas;
		this.comissao = comissao;
	}
	
	

}
