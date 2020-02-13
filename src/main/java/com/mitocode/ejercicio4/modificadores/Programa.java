package com.mitocode.ejercicio4.modificadores;

public class Programa {

	public static void main(String[] args) {
			
		CuentaNegocio ng = new CuentaNegocio("10","eric",100,500);
		System.out.println(ng);
		System.out.println(ng.getSaldo());
		System.out.println(ng.getLimitePrestamo());	
				
		double monto = 100.0;
		ng.prestamo(monto);
		System.out.println(ng);
		System.out.println(ng.getSaldo());
		System.out.println(ng.getLimitePrestamo());	
				
	}

}
