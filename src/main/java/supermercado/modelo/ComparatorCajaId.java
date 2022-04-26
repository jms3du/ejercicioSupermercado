package main.java.supermercado.modelo;

import java.util.Comparator;

public class ComparatorCajaId implements Comparator<Caja> {

	public ComparatorCajaId() {
	}

	@Override
	public int compare(Caja o1, Caja o2) {
		return o1.getIdCaja()-o2.getIdCaja();
	}

}
