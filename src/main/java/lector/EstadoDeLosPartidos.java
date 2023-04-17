package lector;

public class EstadoDeLosPartidos 
{	//Atributos.
	public Partido partido;
	public Equipo ganador;
	public Equipo perdedor;
	public boolean empate;
	//Constructor.
	public EstadoDeLosPartidos (Partido nuevoPartido)
	{
		partido = nuevoPartido;
		
		if (partido.getGolesEquipo1() > partido.getGolesEquipo2()) 
		{
			
			Equipo ganadorA = partido.getEquipo1();
			Equipo perdedorA = partido.getEquipo2();
			boolean empateA = false;
			ganador = ganadorA;
			perdedor = perdedorA;
			empate = empateA;
			//Print
			System.out.println("Resultado del Partido Creado.");
			System.out.println("	El id del partido es: " + partido.getPartidoId());
			System.out.println("	El nombre del equipo ganador es: " + ganador.getNombre() + " Y su id es: " + ganador.getId());
			System.out.println("	El nombre del equipo perdedor es: " + perdedor.getNombre() + " Y su id es: " + perdedor.getId());
			System.out.println("	Es empate: " + empate);
			System.out.println(" ");
		}
		if (partido.getGolesEquipo2() > partido.getGolesEquipo1())
		{
			Equipo ganadorA = partido.getEquipo2();
			Equipo perdedorA = partido.getEquipo1();
			boolean empateA = false;
			ganador = ganadorA;
			perdedor = perdedorA;
			empate = empateA;
			System.out.println("Resultado del Partido Creado.");
			System.out.println("	El id del equipo ganador es: " + ganador.getNombre() + " Y su id es: " + ganador.getId());
			System.out.println("	El id del equipo perdedor es: " + perdedor.getNombre() + " Y su id es: " + perdedor.getId());
			System.out.println("	Es empate: " + empate);
			System.out.println(" ");
		}
		if (partido.getGolesEquipo1() == partido.getGolesEquipo2())
		{
			boolean empateA = true;
			empate = empateA;
			System.out.println("Resultado del Partido Creado.");
			System.out.println("	Es empate: " + empate);
			System.out.println(" ");
		}
	}
	
	public Partido getPartido() 
	{
		return partido;
	}
	public void setPartido(Partido partido) 
	{
		this.partido = partido;
	}
	
	public Equipo getGanador() 
	{
		return ganador;
	}
	
	public void setGanador(Equipo ganador) 
	{
		this.ganador = ganador;
	}
	
	public Equipo getPerdedor() 
	{
		return perdedor;
	}
	
	public void setPerdedor(Equipo perdedor) 
	{
		this.perdedor = perdedor;
	}
	
	public boolean isEmpate() 
	{
		return empate;
	}
	
	public void setEmpate(boolean empate) 
	{
		this.empate = empate;
	}
}