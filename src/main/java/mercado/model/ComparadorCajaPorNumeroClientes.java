package main.java.mercado.model;

import java.util.Comparator;

public class ComparadorCajaPorNumeroClientes implements Comparator<Caja> {

	public ComparadorCajaPorNumeroClientes() {
	}

	@Override
	public int compare(Caja o1, Caja o2) {
		return o1.getNumeroClientes()-o2.getNumeroClientes();
	}

}
