package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Programa3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista = new ArrayList<String>();
		lista.add("MAGENTA");
		lista.add("ROJO");
		lista.add("BLANCO");
		lista.add("AZUL");
		lista.add("CYAN");
		
		System.out.print("Colores: ");
		for (String elemento : lista) {
			System.out.print(elemento + " ");
		}
		
		List<String> listaEliminar = new ArrayList<String>();
		listaEliminar.add("ROJO");
		listaEliminar.add("BLANCO");
		listaEliminar.add("AZUL");
		
		System.out.println("");
		System.out.print("Elementos a eliminar: ");
		for (String elemento : listaEliminar) {
			System.out.print(elemento + " ");
		}
		System.out.println("");
		
		eliminar(lista, listaEliminar);	
	}
	
	public static void eliminar(Collection<String> lista1, Collection<String> lista2)
	{
		Iterator<String> iterator = lista1.iterator();
		while(iterator.hasNext())
		{
			if(lista2.contains(iterator.next()))
			{
				iterator.remove();
			}			
		}	
		System.out.println("");
		System.out.print("Lista final: ");
		for (String elemento : lista1) {
			System.out.print(elemento + " ");
		}
		
		System.out.println("");
		System.out.print("Elementos eliminados: ");
		for (String elemento : lista2) {
			System.out.print(elemento + " ");
		}
	}

}
