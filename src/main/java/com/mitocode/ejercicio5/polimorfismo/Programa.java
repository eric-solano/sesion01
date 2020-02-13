package com.mitocode.ejercicio5.polimorfismo;

public class Programa {

	public static void main(String[] args) {
			
		Cuenta cuenta1 = new Cuenta("10","Eric1",0.0);
		System.out.println(cuenta1);
		
		//Upcasting, cuenta va a contener los atributos de la subclase CuentaNegocio
		//Del lado de la izq debe de estar la superclase y la derecha la subclase
		Cuenta cuenta2 = new CuentaNegocio("11","Eric2",100.0,500);
		System.out.println(cuenta2);
		
		//Esto no esta permitido
		//CuentaNegocio cuenta3 = new Cuenta("11","Eric2",100.0,500);
		//System.out.println(cuenta3);
		
		//Asignacion ordinaria
		CuentaNegocio cuentaNegocio = new CuentaNegocio("12","Eric3",0.0,500);
		Cuenta cuenta4 = cuentaNegocio;
		System.out.println(cuenta4);
	}

}
