package Baches;

public class CriterioEjeX extends Criterio{

	protected int valor;
	
	public CriterioEjeX(int valor) {
		this.valor = valor;
	}

	public boolean seCumple(Registro r) {
		return r.x > valor;
	}

}
