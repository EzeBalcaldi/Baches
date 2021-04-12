package Baches;

import java.util.Comparator;

public class ComparatorPorcentaje implements Comparator<Abs>{

	@Override
	public int compare(Abs recorrido1, Abs recorrido2) {
		// TODO Auto-generated method stub
		if (recorrido1.getPorcentajeBaches()  < recorrido2.getPorcentajeBaches()) 
			return 1;
		else if (recorrido1.getPorcentajeBaches() == recorrido2.getPorcentajeBaches())
			return 0;
		else 
			return -1;
	}

}
