package lector;

public class Ronda 
{
	public String nro;
	public Partido partido1;
	public Partido partido2;
	public Pronostico pronostico1;
	public Pronostico pronostico2;
	public int puntosFinales;
	
	public Ronda (Partido nPartido1, Partido nPartido2, Pronostico nPronostico1, Pronostico nPronostico2) 
	{
		nro = "Uno";
		partido1 = nPartido1;
		partido2 = nPartido2;
		pronostico1 = nPronostico1;
		pronostico2 = nPronostico2;
		puntosFinales = pronostico1.getPuntos() + pronostico2.getPuntos();
		
		System.out.println("Ronda Creada:");
		System.out.println("	Ronda Nro: " + nro);
		System.out.println("	Primer Partido Id: " + partido1.getPartidoId());
		System.out.println("	Segundo Partido Id: " + partido2.getPartidoId());
		System.out.println(" ");
		System.out.println("	Puntos totales de Maria: " + puntosFinales);
		System.out.println(" ");
		
	}
	
}
