package futbol;

public class Pronostico {
	
	private Participante participante;
	private Partido partido;
	private Equipo equipo;
	private String gana1;
	private String gana2;
	private String empate;
	private ResultadoEnum resultado;
	
	public Pronostico(Participante participante, Partido partido, Equipo equipo, String gana1, String gana2, String empate) {
		super();
		this.participante = participante;
		this.partido = partido;
		this.equipo = equipo;
		this.gana1 = gana1;
		this.gana2 = gana2;
		this.empate = empate;
//		this.resultado = resultado;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}

	public ResultadoEnum getResultado() {
		return resultado;
	}

	public void setResultado() {
//		Equipo equipo = null;
//		ResultadoEnum resultado = null;
		if("x".equals(gana1)) {
			//equipo = this.equipo;
			resultado = ResultadoEnum.GANADOR;
		}
		if("x".equals(empate)) {
			//equipo = this.equipo;
			resultado = ResultadoEnum.EMPATE;
		}
		if("x".equals(gana2)) {
			//equipo = this.equipo;
			resultado = ResultadoEnum.PERDEDOR;
		}
	}
	
	public void puntos() { //Se suman puntos si el resultado del partido es igual al del pronostico.
		ResultadoEnum resultadoReal = this.partido.resultado(this.equipo);
		if (this.resultado.equals(resultadoReal)) {
			this.participante.setPuntos(this.participante.getPuntos() + 1);
		}
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
		return empate;
	}

	public void setEmpata(String empata) {
		this.empate = empata;
	}
}