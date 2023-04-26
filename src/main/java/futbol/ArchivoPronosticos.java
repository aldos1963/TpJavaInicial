package futbol;

import java.util.Objects;

public class ArchivoPronosticos {
	
	private String idpronostico;
	private String participante;
	private String equipo1;
	private String equipo2;
	private String gana1;
	private String gana2;
	private String empata;
	
	public ArchivoPronosticos() {
		
	}
	
	public Participante crearParticipante() {
		Participante participanteI = new Participante(participante);
		return participanteI;
	}
	
	public Pronostico crearPronostico(Participante participante, Partido partido, Equipo equipo, String gana1, String gana2, String empate) {
		Pronostico pronosticoI = new Pronostico(participante, partido, equipo, gana1, gana2, empate);
		pronosticoI.setResultado();
		pronosticoI.puntos();
		return pronosticoI;
	}
	
	public String getIdPronostico() {
		return idpronostico;
	}
	
	public void setIdPronostico(String idpronosticos) {
		this.idpronostico = idpronosticos;
	}
	
	public String getParticipante() {
		return participante;
	}
	
	public void setParticipante(String participante) {
		this.participante = participante;
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
	
	public String getGana1() {
		return gana1;
	}
	
	public void setGana1(String gana1) {
		this.gana1 = gana1;
	}
	
	public String getGana2() {
		return gana2;
	}
	
	public void setGana2(String gana2) {
		this.gana2 = gana2;
	}
	
	public String getEmpata() {
		return empata;
	}
	
	public void setEmpata(String empata) {
		this.empata = empata;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empata, equipo1, equipo2, gana1, gana2, idpronostico, participante);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ArchivoPronosticos other = (ArchivoPronosticos) obj;
		return Objects.equals(empata, other.empata) && Objects.equals(equipo1, other.equipo1)
				&& Objects.equals(equipo2, other.equipo2) && Objects.equals(gana1, other.gana1)
				&& Objects.equals(gana2, other.gana2) && Objects.equals(idpronostico, other.idpronostico)
				&& Objects.equals(participante, other.participante);
	}
}