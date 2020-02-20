package com.mitocode.ejercicio9.colecciones;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] colores = { "negro", "amarillo", "verde", "azul", "violeta" };

		List<String> lista = Arrays.asList(colores);
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		Collections.sort(lista,Collections.reverseOrder());
		System.out.println(lista);
//		for (String string : lista) {
//			System.out.println(string);
//		}
	}

}
