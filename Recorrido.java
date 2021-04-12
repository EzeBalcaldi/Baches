package Baches;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Recorrido extends Abs{
	protected int coordInicio;
	protected int coordFin;
	protected ArrayList<Abs> registros;
	public Recorrido(int coordInicio, int coordFinal, int coordInicio2, int coordFin) {
		super(coordInicio, coordFinal);
		coordInicio = coordInicio2;
		this.coordFin = coordFin;
		registros = new ArrayList<Abs>();
	}
	
	
	
	public void add(Abs registro) {
		if(registro.coordInicio >= this.coordInicio && registro.coordFinal <= this.coordFin) {
			registros.add(registro);
		}
	}
	
	
	public ArrayList<Abs> getRegistros(Criterio c, int porcentaje, Comparator<Abs> comp){
		ArrayList<Abs> aux = new ArrayList<Abs>();
		for(Abs r : registros) {
			int resultado = r.getRegistrosPorBache(c) / r.getRegistros() * 100;
			if(resultado > porcentaje) {
				aux.add(r);
				r.setPorcentajeBaches(resultado);
			}
		}
		Collections.sort(aux, comp);
		return aux;
	}



	@Override
	public int getRegistros() {
		int aux = 0;
		for(Abs a: registros) {
			aux += a.getRegistros();
		}
		return aux;
	}



	@Override
	public int getRegistrosPorBache(Criterio c) {
		int aux = 0;
		for(Abs a: registros) {
			aux += a.getRegistrosPorBache(c);
		}
		return aux;
	}
	
	

	


	

}
