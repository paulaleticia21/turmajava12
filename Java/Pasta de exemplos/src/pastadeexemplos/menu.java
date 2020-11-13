package pastadeexemplos;

public class exercicio2 {

public static void main (String args []) {

	{

	
	Leitura Lt = new Leitura ();
	
	
	
	
	
	System.out.println("\t###Bem vindo ao controle de vistorias de veiculos!###\n");
	
	System.out.println("  *Entre com o tipo de veiculo para cadastrar e pressione enter ->");
	
	int x = Integer.parseInt (Lt.entra ("1- Para veiculos de passeio.\n" + "2- Para veiculos de carga.\n"));
	
	switch (x)
	{
	
		case 1:
			
		
		int a = Integer.parseInt (Lt.entra ("Digite a quantidade de veiculos para cadastrar: "));
		CarroPasseio Cp[] = new CarroPasseio [a];
		
		System.out.println ("Digite os dados dos veiculos de passeio: \n");
		
		for (int i = 0; i < Cp.length; i++)
		{
			
			
			Cp[i] = new CarroPasseio ();
			
			System.out.println ("Veiculo " +(i+1));
			
		
			Cp[i].setmodelo (Lt.entra ("Modelo do carro: "));
			Cp[i].setpotencia (Integer.parseInt (Lt.entra ("Potencia do carro: ")));	
			Cp[i].setpeso (Integer.parseInt (Lt.entra ("Peso do carro: ")));	
			Cp[i].setvelmax (Integer.parseInt (Lt.entra ("Velocidade maxima do carro: ")));
			Cp[i].setprecov (Double.parseDouble (Lt.entra ("Preco do carro: ")));	
			Cp[i].setcor (Lt.entra ("Cor do carro: "));	
			Cp[i].setNumCilindro (Integer.parseInt (Lt.entra ("Numero de cilindros do carro: ")));
	
		}
		
	


