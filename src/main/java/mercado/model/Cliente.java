package main.java.mercado.model;

public class Cliente {

	
	private static int idClienteActual = 1;
	
	private int numeroCliente;
	
	public Cliente() {
		this.numeroCliente = idClienteActual++;		
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}
}
