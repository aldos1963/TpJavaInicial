package futbol;

import java.util.Objects;

public class ArchivoResultados {
	
	private int idresultados;
	private int fase;
	private int ronda;
	private String equipo1;
	private String equipo2;
	private int cantgoles1;
	private int cantgoles2;
	
	public ArchivoResultados() {
		
	}
	
	public Equipo crearEquipo1() {
		Equipo equipoI1 = new Equipo(equipo1);
		return equipoI1;
	}
	
	public Equipo crearEquipo2() {
		Equipo equipoI2 = new Equipo(equipo2);
		return equipoI2;
	}
	
	public Partido crearPartido(Equipo equipo1, Equipo equipo2, int cantgoles1, int cantgoles2) {
		Partido partidoI = new Partido(equipo1, equipo2, cantgoles1, cantgoles2);
		return partidoI;
	}
	
	public Ronda crearRonda(int ronda, Partido partido1) {
		Ronda rondaI = new Ronda(ronda, partido1);
		return rondaI;
	}
	
	public Ronda crearRonda(int ronda, Partido partido1, Partido partido2) {
		Ronda rondaI = new Ronda(ronda, partido1, partido2);
		return rondaI;
	}
	
	public Ronda crearRonda(int ronda, Partido partido1, Partido partido2, Partido partido3, Partido partido4) {
		Ronda rondaI = new Ronda(ronda, partido1, partido2, partido3, partido4);
		return rondaI;
	}
	
	public Fase crearFase(int fase, Ronda ronda1, Ronda ronda2) {
		Fase faseI = new Fase(fase, ronda1, ronda2);
		return faseI;	
	}
	
	public int getIdResultados() {
		return idresultados;
	}
	
	public void setIdResultados(int idresultados) {
		this.idresultados = idresultados;
	}
	
	public int getFase() {
		return fase;
	}
	
	public void setFase(int fase) {
		this.fase = fase;
	}
	
	public int getRonda() {
		return ronda;
	}
	
	public void setRonda(int ronda) {
		this.ronda = ronda;
	}
	
	public String getEquipo1() {
		return equipo1;
	}
	
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	
	public String getEquipo2() {
		return equipo2;
	}
	
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	
	public int getCantGoles1() {
		return cantgoles1;
	}
	
	public void setCantGoles1(int cantgoles1) {
		this.cantgoles1 = cantgoles1;
	}
	
	public int getCantGoles2() {
		return cantgoles2;
	}
	
	public void setCantGoles2(int cantgoles2) {
		this.cantgoles2 = cantgoles2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cantgoles1, cantgoles2, equipo1, equipo2, fase, idresultados, ronda);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArchivoResultados other = (ArchivoResultados) obj;
		return Objects.equals(cantgoles1, other.cantgoles1) && Objects.equals(cantgoles2, other.cantgoles2)
				&& Objects.equals(equipo1, other.equipo1) && Objects.equals(equipo2, other.equipo2)
				&& Objects.equals(fase, other.fase) && Objects.equals(idresultados, other.idresultados)
				&& Objects.equals(ronda, other.ronda);
	}
}