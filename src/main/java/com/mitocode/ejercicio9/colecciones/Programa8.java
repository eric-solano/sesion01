package com.mitocode.ejercicio9.colecciones;

import java.util.HashMap;
import java.util.Map;

public class Programa8 {
	public static void main(String[] args) {
		Map<String, String> paises = new HashMap<String, String>();
		
		paises.put("PE", "PERU");
		paises.put("CO", "COLOMBIA");
		paises.put("CH", "CHILE");
		paises.put("EC", "ECUADOR");
		
		//VALIDAR SI ES VACIO
		System.out.println("Map vacio: " + paises.isEmpty());
		
		//OBTENER VALORES
		System.out.println("Valores son: " + paises.values());
		
		//OBTENER LLAVES
		System.out.println("Llaves son: " + paises.keySet());
		
		//OBTENER UN VALOR
		String llave = "PE";
		System.out.println("La llave es: " + llave + ", Valor es: " + paises.get(llave));
		
		//ELIMINAR ELEMENTO
		paises.remove(llave);
		System.out.println("Se elimino la llave: " + llave);
		System.out.println(paises);
		
		//ELIMINAR TODO
		paises.clear();
		System.out.println("Se elimino todo el map");
		System.out.println(paises);
	}
}
