package programaçaoOrientadaaobjeto;

public class Pessoa {
	
	public String nome;
	public int cpf;
	public int nascimento;
	public boolean genero;
	public int idade;

	
	public Pessoa (String nome) {
		this.nome = nome;
	}

	public Pessoa (int cpf, int nascimento , int idade) {
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.idade = idade;
	}
	
		
	public String genero(){
		String nomeGenero = "";
		if (this.genero == 'M') {
			nomeGenero ="Masculino";
		}
		else if (this.genero == 'F') {
			nomeGenero = " Feminino";
		}
		else if (this.genero == 'O'){
			nomeGenero = " OUTROS";
		}		
		return nomeGenero;
}

	public void idade( int i ) {
	
		
	}	
}
