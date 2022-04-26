package main.java.mercado.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Caja {

	private int idCaja;
	private boolean abierta = true;
	
	private List<Cliente> clientes;
	
	public Caja(int id) {
		idCaja = id;
		clientes = new ArrayList<Cliente>();

	}
	
	public boolean asignarCliente(Cliente cl) {
		if(abierta) {
			clientes.add(cl);
		}
		return abierta;
	}
	
	public String atenderCliente() {
		String resultado="";
		if(abierta && !clientes.isEmpty()) {
			Cliente cl = clientes.remove(0);
			resultado = String.format("Se ha atendido al cliente con número %d", cl.getNumeroCliente());
		}else {
			throw new CajaException("No se puede atender clientes en esta caja.");
		}
		return resultado;
	}

	public int getNumeroClientes() {
		return clientes.size();
	}

	public int getIdCaja() {
		return idCaja;
	}
	
}
