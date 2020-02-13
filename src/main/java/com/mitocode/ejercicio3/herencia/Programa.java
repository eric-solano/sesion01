package com.mitocode.ejercicio3.herencia;

public class Programa {

	public static void main(String[] args) {
			
		CuentaNegocio ng = new CuentaNegocio("10","eric",100,500);
		System.out.println(ng);
		System.out.println(ng.getSaldo());
		System.out.println(ng.getLimitePrestamo());			
	}

}
