package test.java.mercado;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import main.java.mercado.model.Almacen;
import main.java.mercado.model.CajaException;
import main.java.mercado.model.Cliente;

class AlmacenTest {

	@Test
	void testObtenerCajaPrioritaria() {
		Almacen almacen = new Almacen();
		assertEquals(almacen.obtenerCajaPrioritaria().getIdCaja(), 1);
	}

	@Test
	void testObtenerCajaTrasAsignarCliente() {
		Almacen almacen = new Almacen();
		almacen.asignarClienteACaja(new Cliente());
		almacen.asignarClienteACaja(new Cliente());
		assertEquals(almacen.obtenerCajaPrioritaria().getIdCaja(), 3);
	}
	
	@Test
	void testAtenderClienteSiNoExisten() {
		try {
			Almacen almacen = new Almacen();
			almacen.atenderCliente(2);
			assert(false);
		}catch(CajaException ce) {
			assert(true);
		}catch(Exception e) {
			assert(false);
		}
	}
	
	@Test
	void testAtenderCliente() {
		Almacen almacen = new Almacen();
		almacen.asignarClienteACaja(new Cliente());
		almacen.asignarClienteACaja(new Cliente());
		assertTrue(!almacen.atenderCliente(1).isBlank());
	}
	
	
	@Test
	void testAtenderClienteOtraCaja() {
		Almacen almacen = new Almacen();
		almacen.asignarClienteACaja(new Cliente());
		almacen.asignarClienteACaja(new Cliente());
		try {
			almacen.atenderCliente(5);
			assert(false);
		}catch(CajaException ce) {
			assert(true);
		}catch(Exception e) {
			assert(false);
		}
	}
}
