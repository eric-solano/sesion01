package com.mitocode.ejercicio6.enumsavanzado;

public class Programa {

	public static void main(String[] args) {

		CuentaAhorros cuenta = new CuentaAhorros("15","Eric",5,4);
		System.out.println(cuenta);
		
		System.out.println("Retiro: " + 50);
		cuenta.retiro(50);
		System.out.println(cuenta);
		
		System.out.println("Deposito: " + 150);
		cuenta.deposito(150);
		System.out.println(cuenta);
		
		//System.out.println("Interes ganado: " + 0.05);
		//cuenta.ac(50);
		//System.out.println(cuenta);
		
		//Fraude
		for (int i = 0; i < 5; i++) {
			cuenta.retiro(100);
		}
		if (cuenta.getEstado().equals(Estado.ACTIVA)) {
			cuenta.setEstado(Estado.BLOQUEADA);
		}
		System.out.println(cuenta);
		System.out.println(cuenta.getEstado().getCodigo());
	}

}
