package Baches;

public class CriterioEjeY extends Criterio{
	protected int valor;
	@Override
	
	public boolean seCumple(Registro r) {
		return r.y  > valor;
	}
	public CriterioEjeY(int valor) {
		super();
		this.valor = valor;
	}
	
}
