package Baches;

import java.util.Comparator;

public class ComparatorAntiguedad implements Comparator<Abs> {

	public int compare(Abs recorrido1, Abs recorrido2) {
		
		if (recorrido1.getCoordInicio() < recorrido2.getCoordFinal()) 
			return -1;
		else if (recorrido1.getCoordInicio() == recorrido2.getCoordInicio()) 
			return 0;
		else
			return 1;
	}
}
