package main.java.supermercado.modelo;

public class Caja {

	
	private int idCaja;
	private boolean cerrado;
	
	
	public Caja() {
		this.cerrado = true;
	}
	
	public boolean abrirCaja() {
		if(cerrado) {
			this.cerrado = false;
		}else {
			throw new CajaException("La caja ya estaba abierta");
		}
		return !this.cerrado;
	}
	
	public boolean cerrarCaja() {
		if(!this.cerrado) {
			this.cerrado=true;
		}
		return this.cerrado;
	}
	
	public Caja(int id) {
		this();
		this.idCaja = id;
	}


	public boolean isCerrado() {
		return cerrado;
	}



	public int getIdCaja() {
		return idCaja;
	}


}
