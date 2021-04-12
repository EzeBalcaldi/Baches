package Baches;

public class CriterioEjeZ extends Criterio {
	protected int valor;
	public CriterioEjeZ(int valor) {
		this.valor = valor;
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean seCumple(Registro r) {
		return r.z > valor;
	}

	
}
