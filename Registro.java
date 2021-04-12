package Baches;

import java.util.ArrayList;
import java.util.Comparator;

public class Registro extends Abs{
	protected int x;
	protected int y;
	protected int z;
	protected int timestamp;
	public Registro(int x, int y, int z, int timestamp, int inicio, int fin) {
		super(inicio, fin);
		inicio = fin;
		this.x = x;
		this.y = y;
		this.z = z;
		this.timestamp = timestamp;
	}
	@Override
	public int getRegistros() {
		return 1;
	}
	@Override
	public int getRegistrosPorBache(Criterio c) {
		if(c.seCumple(this)) {
			return 1;
		}
		return 0;
	}

	
	
	
	
	
	
	
}
