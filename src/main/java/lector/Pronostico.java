package lector;

public class Pronostico 
{
	public int equipo1IdP;
	public int equipo2IdP;
	public String gana1P;
	public String gana2P;
	public String empataP;
	public int puntos;
	
	public Partido partidoReal;
	//public Equipo equipoGanador;  //Tal ves..
	public EstadoDeLosPartidos resultadoReal;
	
	public Pronostico(int nIdEquipo1P, int nIdEquipo2P, String nGana1P, String nGana2P, String nEmpataP, Partido nuevoPartido, EstadoDeLosPartidos nResultadoReal)
	{
		equipo1IdP = nIdEquipo1P;
		equipo2IdP = nIdEquipo2P;
		gana1P = nGana1P;
		gana2P = nGana2P;
		empataP = nEmpataP;
		
		partidoReal = nuevoPartido;
		//equipoGanador = nEquipoGanador; //Tal ves..
		resultadoReal = nResultadoReal;	
		//Print
		System.out.println("Pronostico creado");
		System.out.println("	Id Equipo1: " + getEquipo1IdP());
		System.out.println("	Id Equipo2: " + getEquipo2IdP());
		System.out.println("	Gana Equipo1: " + gana1P);
		System.out.println("	Gana Equipo2: " + gana2P);
		System.out.println("	Empatan: " + empataP);
		System.out.println("	PartidoId: " + partidoReal.getPartidoId());
		
		if (empataP.equals("x"))
		{
			System.out.println("	Resultado Real: Empate ");
			System.out.println(" ");
			if (resultadoReal.empate == true)
			{
				System.out.println(" El pronostico Coincide para Empate ");
				puntos = puntos + 1;
				System.out.println(" +1 punto");
			}
		}

		if(gana1P.equals("x"))
		{
			if(resultadoReal.getGanador().getId() == getEquipo1IdP())
			{
				System.out.println(" El pronostico coincide para Equipo 1 ");
				puntos = puntos + 1;
				System.out.println(" +1 punto");
			}

		}
		
		if (gana2P.equals("x"))
		{
			if(resultadoReal.getGanador().getId() == getEquipo2IdP())
			{
				System.out.println(" El pronostico coincide para Equipo 2 ");
				puntos = puntos + 1;
				System.out.println(" +1 punto");
			}
		}
		System.out.println(" ");
	}

	public int getEquipo1IdP() {
		return equipo1IdP;
	}

	public void setEquipo1IdP(int equipo1IdP) {
		this.equipo1IdP = equipo1IdP;
	}

	public int getEquipo2IdP() {
		return equipo2IdP;
	}

	public void setEquipo2IdP(int equipo2IdP) {
		this.equipo2IdP = equipo2IdP;
	}

	public String getGana1P() {
		return gana1P;
	}

	public void setGana1P(String gana1p) {
		gana1P = gana1p;
	}

	public String getGana2P() {
		return gana2P;
	}

	public void setGana2P(String gana2p) {
		gana2P = gana2p;
	}

	public String getEmpataP() {
		return empataP;
	}

	public void setEmpataP(String empataP) {
		this.empataP = empataP;
	}

	public Partido getPartidoReal() {
		return partidoReal;
	}

	public void setPartidoReal(Partido partidoReal) {
		this.partidoReal = partidoReal;
	}

	public EstadoDeLosPartidos getResultadoReal() {
		return resultadoReal;
	}

	public void setResultadoReal(EstadoDeLosPartidos resultadoReal) {
		this.resultadoReal = resultadoReal;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
}
