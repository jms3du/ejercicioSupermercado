package main.java.supermercado;

import main.java.supermercado.modelo.CajaException;
import main.java.supermercado.modelo.Cliente;
import main.java.supermercado.modelo.GestionCola;

public class MainApp {



	public static void main(String[] args) {
		GestionCola gc = new GestionCola();
		try {
			gc.abrirCaja(2);
			gc.cerrarCaja(2);
			gc.abrirCaja(3);
			gc.abrirCaja(20);
			
			for(int i =0; i<80; i++) {
				System.out.println(gc.asignarCliente(new Cliente()));
			}
			
			System.out.println(gc.atenderCaja(4));
			System.out.println(gc.atenderCaja(4));
			System.out.println(gc.atenderCaja(2));
			System.out.println(gc.atenderCaja(18));

			System.out.println(gc.asignarCliente(new Cliente()));
			System.out.println(gc.asignarCliente(new Cliente()));
			System.out.println(gc.asignarCliente(new Cliente()));

			
			
		}catch(CajaException ce) {
			System.out.println(ce.getLocalizedMessage());
		}
		System.out.println(gc);

	}

}
