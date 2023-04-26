package futbol;

public class Fase {
	
	private int nro;
	private Ronda ronda1;
	private Ronda ronda2;
	
	public Fase(int nro, Ronda ronda1, Ronda ronda2) {
		super();
		this.nro = nro;
		this.ronda1 = ronda1;
		this.ronda2 = ronda2;
	}

	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	
	public int puntosExtra() {//Se suman puntos extra cuando se aciertan todos los resultados de una fase.
		int puntosExtras = 3; //Falta implementar.
		return puntosExtras;
	}

	public Ronda getRonda1() {
		return ronda1;
	}

	public void setRonda1(Ronda ronda1) {
		this.ronda1 = ronda1;
	}

	public Ronda getRonda2() {
		return ronda2;
	}

	public void setRonda2(Ronda ronda2) {
		this.ronda2 = ronda2;
	}
}