package Baches;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Abs {
	protected int coordInicio;
	protected int coordFinal;
	protected int porcentajeBaches;
	public Abs(int coordInicio, int coordFinal) {
		super();
		this.coordInicio = coordInicio;
		this.coordFinal = coordFinal;
		porcentajeBaches = 0;
	}
	public abstract int getRegistros();
	public abstract int getRegistrosPorBache(Criterio c);
	protected void setPorcentajeBaches(int x) {
		this.porcentajeBaches = x;
	}
	protected int getPorcentajeBaches() {
		return porcentajeBaches;
	}
	public int getCoordInicio() {
		return coordInicio;
	}

	public int getCoordFinal() {
		return coordFinal;
	}
	
//	public abstract ArrayList<Abs> getRegistros(Criterio c, int porcentaje, Comparator<Abs> comp);

}
