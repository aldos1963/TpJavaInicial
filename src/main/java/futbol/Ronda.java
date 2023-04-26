package futbol;

public class Ronda {
	
	private int nro;
	private Partido partido1;
	private Partido partido2;
	private Partido partido3;
	private Partido partido4;
	
	public Ronda(int nro, Partido partido1) {
		super();
		this.nro = nro;
		this.partido1 = partido1;
	}
	
	public Ronda(int nro, Partido partido1, Partido partido2) {
		super();
		this.nro = nro;
		this.partido1 = partido1;
		this.partido2 = partido2;
	}
	
	public Ronda(int nro, Partido partido1, Partido partido2, Partido partido3) {
		super();
		this.nro = nro;
		this.partido1 = partido1;
		this.partido2 = partido2;
		this.partido3 = partido3;
	}
	
	public Ronda(int nro, Partido partido1, Partido partido2, Partido partido3, Partido partido4) {
		super();
		this.nro = nro;
		this.partido1 = partido1;
		this.partido2 = partido2;
		this.partido3 = partido3;
		this.partido4 = partido4;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	
	public int puntosExtras() {//Se suman puntos extra cuando se aciertan todos los resultados de una ronda.
		int puntosExtras = 2;  //Falta implementar.
		return puntosExtras;
	}

	public Partido getPartido1() {
		return partido1;
	}

	public void setPartido1(Partido partido1) {
		this.partido1 = partido1;
	}

	public Partido getPartido2() {
		return partido2;
	}

	public void setPartido2(Partido partido2) {
		this.partido2 = partido2;
	}

	public Partido getPartido3() {
		return partido3;
	}

	public void setPartido3(Partido partido3) {
		this.partido3 = partido3;
	}

	public Partido getPartido4() {
		return partido4;
	}

	public void setPartido4(Partido partido4) {
		this.partido4 = partido4;
	}
}