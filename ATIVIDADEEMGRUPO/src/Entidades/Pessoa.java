package Entidades;

public class Pessoa {
	//atributo da classe
	public String nome;
	public char genero;
	public int anoNascimento;
	public String sobrenome;
	public int idade;
	
	
	
	public Pessoa(){
		
	}
	
	
	
	
	public Pessoa(String nome) {
		
		this.nome = nome;
	}
	//construtor
	
	public Pessoa(String nome,String sobrenome) {
		
		this.nome = nome;
		
		this.sobrenome = sobrenome;
	}
		
		public void idade() {
			
			System.out.println ( 2020-this.anoNascimento);
			
		}
		public int pegaidade (int anoAtual) {
			this.idade = anoAtual = this.anoNascimento;
				return this.idade;
		
		
	}
	public String nomeGenero(){
		String nomeGenero = "";
		if (this.genero == 'M') {
			nomeGenero ="Masculino";
		}
		else if ( this.genero == 'F') {
			nomeGenero = " Feminino";
		}
		else if (this.genero == 'O'){
			nomeGenero = " OUTROS";
		}		
		return nomeGenero;
		
		
		
		
		
	}
	
	}

