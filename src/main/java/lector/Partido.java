package lector;



public class Partido 
{	//Atributos de la clase.
	public Equipo equipo1;
	public Equipo equipo2;
	public int partidoId;
	public int golesEquipo1;
	public int golesEquipo2;
	public Resultados estadoEquipo1;
	public Resultados estadoEquipo2;
	//Constructor de la clase.
	public Partido(Equipo nuevoEquipo1, Equipo nuevoEquipo2, int nGolesEquipo1, int nGolesEquipo2) 
	{
		equipo1 = nuevoEquipo1;
		equipo2 = nuevoEquipo2;
		golesEquipo1 = nGolesEquipo1;
		golesEquipo2 = nGolesEquipo2;
		partidoId = equipo1.getId() + equipo2.getId();
		//print
		System.out.println("Partido Creado: ");
		System.out.println("	Id del Partido: " + partidoId);
		System.out.println("	Equipo 1: " + equipo1.getNombre());
		System.out.println("	Equipo 2: " + equipo2.getNombre());
		System.out.println("	Goles Equipo 1: " + getGolesEquipo1());
		System.out.println("	Goles Equipo 2: " + getGolesEquipo2());
		
		System.out.println(equipo1.getNombre()+' '+ estadoEquipo1());
		System.out.println(equipo2.getNombre()+' '+ estadoEquipo2());
		System.out.println(" ");

		
	}
	//Falta metodo que devuelva el resultado(Equipo) a la Clase resultadoEnum.
	//Metodo para conseguir el equipo1.
	public Equipo getEquipo1() 
	{
		return equipo1;
	}
	//Metodo para asignar el equipo1.
	public void setEquipo1(Equipo equipo1) 
	{
		this.equipo1 = equipo1;
	}
	//Metodo para conseguir el equipo2.
	public Equipo getEquipo2() 
	{
		return equipo2;
	}
	//Metodo para asignar el equipo2.
	public void setEquipo2(Equipo equipo2) 
	{
		this.equipo2 = equipo2;
	}
	//Metodo para conseguir los goles del equipo 1.
	public int getGolesEquipo1() 
	{
		return golesEquipo1;
	}
	//Metodo para asignar los goles del equipo 1.
	public void setGolesEquipo1(int golesEquipo1) 
	{
		this.golesEquipo1 = golesEquipo1;
	}
	//Metodo para conseguir los goles del equipo 2.
	public int getGolesEquipo2() 
	{
		return golesEquipo2;
	}
	//Metodo para asignar los goles del equipo 2.
	public void setGolesEquipo2(int golesEquipo2) 
	{
		this.golesEquipo2 = golesEquipo2;
	}
	
	public int getPartidoId() 
	{
		return partidoId;
	}
	
	public void setPartidoId(int partidoId) 
	{
		this.partidoId = partidoId;
	}
	
public Resultados estadoEquipo1() {
		
		if(getGolesEquipo1()>getGolesEquipo2()) {
			estadoEquipo1 = Resultados.GANADOR;
			}
		if(getGolesEquipo1()<getGolesEquipo2()) {
		    estadoEquipo1 = Resultados.PERDEDOR;
			}
		if(getGolesEquipo1()==getGolesEquipo2()) {
			 estadoEquipo1 = Resultados.EMPATE;	
		    }
		return estadoEquipo1;
		
		}

	public Resultados estadoEquipo2() {
		
		if(getGolesEquipo1()>getGolesEquipo2()) {
			estadoEquipo2 = Resultados.PERDEDOR;
			}
		if(getGolesEquipo1()<getGolesEquipo2()) {
		    estadoEquipo2 = Resultados.GANADOR;
			}
		if(getGolesEquipo1()==getGolesEquipo2()) {
			 estadoEquipo2 = Resultados.EMPATE;
			}
		return estadoEquipo2;
		
		}
}