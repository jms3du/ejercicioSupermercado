package main.java.mercado.model;

import java.util.Comparator;

public class ComparadorCajaPorID implements Comparator<Caja> {

	public ComparadorCajaPorID() {
	}

	@Override
	public int compare(Caja o1, Caja o2) {
		return o1.getIdCaja()-o2.getIdCaja();
	}

}
