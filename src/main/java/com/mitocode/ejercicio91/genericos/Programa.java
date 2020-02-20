package com.mitocode.ejercicio91.genericos;

import java.util.ArrayList;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();		
		lista.add("Eric");		
		System.out.println(lista.get(0));
		
		//OPERADOR DIAMANTE CON UN ESTEREOTIPOS
		System.out.println("Un Estereotipo");
		ClaseA<String> c1 = new ClaseA<String>("Eric");
		c1.mostrarTipo();		
		ClaseA<Integer> c2 = new ClaseA<Integer>(20);
		c2.mostrarTipo();
		System.out.println();
		
		//OPERADOR DIAMANTE CON VARIOS ESTEREOTIPOS
		System.out.println("Varios Estereotipos");
		ClaseB<String, Integer, String, Double> c3 = new ClaseB<String, Integer, String, Double>("Eric", 30, "PERU", 80.50);
		c3.mostrarTipo();
		
		List<ClaseB<String, Integer, String, Double>> lista2 = new ArrayList<ClaseB<String, Integer, String, Double>>();
		lista2.add(new ClaseB<String, Integer, String, Double>("Eric", 30, "PERU", 80.50));
		System.out.println(lista2);
	}

}
