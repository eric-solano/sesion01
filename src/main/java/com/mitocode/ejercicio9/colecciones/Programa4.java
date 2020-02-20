package com.mitocode.ejercicio9.colecciones;

import java.util.Arrays;
import java.util.LinkedList;

public class Programa4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.- FORMA DE AGREGAR VALORES
		String[] colores = {"negro","azul","amarillo"};
		LinkedList<String> lista1 = new LinkedList<String>(Arrays.asList(colores));
		System.out.print("Forma 1: ");
		for (String elemento : lista1) {
			System.out.print(elemento + " ");
		}
		
		System.out.println("");
		System.out.print("Forma 1 con nuevos valores: ");
		lista1.add(2,"verde");
		lista1.addFirst("rosado");
		lista1.addLast("cyan");
		for (String elemento : lista1) {
			System.out.print(elemento + " ");
		}
		
		//2.- FORMA DE AGREGAR VALORES
		LinkedList<String> lista2 = new LinkedList<String>();
		lista2.add("negro");
		lista2.add("azul");
		lista2.add("amarillo");
		System.out.println("");
		System.out.print("Forma 2: ");
		for (String elemento : lista2) {
			System.out.print(elemento + " ");
		}
	}

}
