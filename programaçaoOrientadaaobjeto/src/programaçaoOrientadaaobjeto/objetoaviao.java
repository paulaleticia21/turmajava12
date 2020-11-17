package programaçaoOrientadaaobjeto;

public class objetoaviao {
	
	public String nome;
	public static double horario;
	public static int numeropassageiro;
	public static int numeropoutrona;
	public  static String nomeacento;

	
	public void Pessoa (String nome , String nomeacento) {
		this.nome = nome;
		this.nomeacento = nomeacento;
		
		
	}
	public void Pessoa (int numeropassageiro , int numeropoutrona) {
		this.numeropassageiro = numeropassageiro;
		this.numeropoutrona = numeropoutrona;
		
		
	}
	public void Pessoa (double horario) {
		this.horario = horario;
		
		
		
	}
	

}
