package main.java.mercado.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Almacen {

	public static final int NUMERO_MAXIMO_CAJAS = 20;
	private List<Caja> cajas;
	
	public Almacen() {
		cajas = new ArrayList<>();
		
		for(int i=1; i<=NUMERO_MAXIMO_CAJAS; i++ ) {
			cajas.add(new Caja(i));
		}
		
	}
	
	public Caja obtenerCajaPrioritaria() {
		cajas.sort(new ComparadorCajaPorIdYNumeroClientes());
		cajas.sort(new ComparadorCajaPorNumeroClientes().thenComparing(new ComparadorCajaPorID()));
		return cajas.get(0);
	}

	
	
	public String asignarClienteACaja(Cliente cliente) {
		Caja caja = obtenerCajaPrioritaria();
		caja.asignarCliente(cliente);
		return "El cliente "+ cliente.getNumeroCliente()+ " se ha asignado a la caja "+ caja.getIdCaja();
	}
	
	
	public String atenderCliente(int idCaja) {
		
		Caja cajaLocalizada = null;
		String mensaje = "";
		
		Iterator iterator = cajas.iterator();
		while(iterator.hasNext() && cajaLocalizada==null) {
			Caja c = (Caja) iterator.next();
			if(c.getIdCaja()==idCaja) {
				cajaLocalizada = c;
				mensaje = cajaLocalizada.atenderCliente();
			}
		}
		
		return mensaje;
		
	}
	
	
	
}
