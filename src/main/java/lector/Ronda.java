package lector;

import java.util.ArrayList;

public class Ronda 
{
	public Partido partido1;
	public Partido partido2;
	public Pronostico pronostico1;
	public Pronostico pronostico2;
	public int puntosFinales;
	public String  nro;
	
	public Ronda (Partido partido1, Partido partido2, Pronostico pronostico1, Pronostico pronostico2) 
	{
		nro = "Uno";
		this.partido1 = partido1;
		this.partido2 = partido2;
		this.pronostico1 = pronostico1;
		this.pronostico2 = pronostico2;
		
		puntosFinales = pronostico1.getPuntos() + pronostico2.getPuntos();
		
		System.out.println("Ronda Creada:");
		System.out.println("	Ronda Nro: " + nro);
		System.out.println("	Primer  Partido Id: " + partido1.getPartidoId());
		System.out.println("	Segundo Partido Id: " + partido2.getPartidoId());
		System.out.println(" ");
		System.out.println("	Puntos totales de Maria: " + puntosFinales);
		
	}
	
	public Ronda (Partido partido1, Partido partido2, ArrayList<Pronostico> pronosticosLeidos) 
	{
		nro = "Uno";
		this.partido1 = partido1;
		this.partido2 = partido2;
	    this.pronostico1 = pronosticosLeidos.get(0);
	    this.pronostico2 = pronosticosLeidos.get(1);
		 
		puntosFinales = this.pronostico1.getPuntos() + this.pronostico2.getPuntos();
		
		System.out.println("Ronda Creada:");
		System.out.println("	Ronda Nro: " + nro);
		System.out.println("	Primer  Partido Id: " + partido1.getPartidoId());
		System.out.println("	Segundo Partido Id: " + partido2.getPartidoId());
		System.out.println(" ");
		System.out.println("	Puntos totales de Maria: " + puntosFinales);
	     
    }
	
}
