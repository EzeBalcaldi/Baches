package Baches;

public class CriterioAnd extends Criterio{

	private Criterio c1;
	private Criterio c2;
	
	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	@Override
	public boolean seCumple(Registro r) {
		return c1.seCumple(r) && c2.seCumple(r);
	}

}
