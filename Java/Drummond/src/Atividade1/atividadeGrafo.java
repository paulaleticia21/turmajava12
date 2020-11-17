package Atividade1;

import java.util.ArrayList;
import java.util.List;

public class atividadeGrafo {
	

	/* 	Casa = C1, Ponto de onibus = C2,  = C3, Trabalho = C4, 
		Metro Tatuapé = C5, Metro Carrão = C6, Faculdade = C7
		C1 => C2, 50 min, ônibus => C3, 15 min, ônibus
		C2 => C1, 50 min, ônibus => C4, 30 min, trem => C6, 10 min, metro
		C3 => C1, 15 min, ônibus => C4, 50 min, trem => C5, 35 min, trem
		C4 => C2, 30 min, trem => C3, 50 min, trem => C5, 25 min, trem
		C5 => C3, 35 min, trem => C4, 25 min, trem => C7, 18 min, ônibus
		C6 => C2, 10 min, metro => C7, 13 min, ônibus
		C7 => C5, 18 min, ônibus => C6, 13 min, ônibus
	*/

	
	public static void main(String[] args) {
		
		// Gerar a classe vertice (V1 a Vn)
		
		Vertice c1 = new Vertice(1);
		Vertice c2 = new Vertice(2);
		Vertice c3 = new Vertice(3);
		Vertice c4 = new Vertice(4);
		Vertice c5 = new Vertice(5);
		Vertice c6 = new Vertice(6);
		Vertice c7 = new Vertice(7);
	
		// Criar a classe Adjacente para conter o Vertice e as Arestas
		
				Adjacente adj1 = new Adjacente(c1);
				
				List<Aresta> arestas1 = new ArrayList<Aresta>();
				
					arestas1.add(new Aresta(c2, 50, "Ônibus"));
					arestas1.add(new Aresta(c3, 15, "Ônibus"));
				
				Adjacente adj2 = new Adjacente(c2);
				
				List<Aresta> arestas2 = new ArrayList<Aresta>();
				
					arestas2.add(new Aresta(c1, 50, "Ônibus"));
					arestas2.add(new Aresta(c4, 30, "Trem"));
					arestas2.add(new Aresta(c6, 10, "Metro"));
				
				Adjacente adj3 = new Adjacente(c3);
				List<Aresta> arestas3 = new ArrayList<Aresta>();
					arestas3.add(new Aresta(c1, 15, "Ônibus"));
					arestas3.add(new Aresta(c4, 50, "Trem"));
					arestas3.add(new Aresta(c5, 35, "Trem"));
				
				Adjacente adj4 = new Adjacente(c4);
				List<Aresta> arestas4 = new ArrayList<Aresta>();
				arestas4.add(new Aresta(c2, 30, "Trem"));
				arestas4.add(new Aresta(c3, 50, "Trem"));
				arestas4.add(new Aresta(c5, 25, "Trem"));
				
				Adjacente adj5 = new Adjacente(c5);
				List<Aresta> arestas5 = new ArrayList<Aresta>();
				arestas5.add(new Aresta(c3, 35, "Trêm"));
				arestas5.add(new Aresta(c4, 25, "Trem"));
				arestas5.add(new Aresta(c7, 18, "Ônibus"));
				
				Adjacente adj6 = new Adjacente(c6);
				List<Aresta> arestas6 = new ArrayList<Aresta>();
				arestas6.add(new Aresta(c2, 10, "Metro"));
				arestas6.add(new Aresta(c7, 13, "Ônibus"));
				
				Adjacente adj7 = new Adjacente(c7);
				List<Aresta> arestas7 = new ArrayList<Aresta>();
				arestas7.add(new Aresta(c5, 18, "Ônibus"));
				arestas7.add(new Aresta(c6, 13, "Ônibus"));
				
				
				//Criar uma lista de adjacências (List<Adjacente) todos os Vertices e suas respectivas arestas
				
				List<Adjacente> lista = new ArrayList<Adjacente>();
				
				lista.add(adj1);
				lista.add(adj2);
				lista.add(adj3);
				lista.add(adj4);
				lista.add(adj5);
				lista.add(adj6);
				lista.add(adj7);
				
			}

		}


	


