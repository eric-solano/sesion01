package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Programa7 {

	public static void main(String[] args) {
		Character[] letras = { 'P', 'C', 'M' };
		List<Character> lista = Arrays.asList(letras);
		System.out.println("Lista: ");
		Imprimir(lista);
		
		//LISTA INVERTIDA
		Collections.reverse(lista);
		System.out.println("Lista invertida: ");
		Imprimir(lista);
		
		//COPIAR LISTA
		Character[] listaCopia = new Character[lista.size()];
		List<Character> copialista = Arrays.asList(listaCopia);
		Collections.copy(copialista, lista);
		System.out.println("Lista copiada: ");
		Imprimir(copialista);
		
		//FILL
		Collections.fill(lista, 'R');
		System.out.println("Lista reemplazada con R: ");
		Imprimir(lista);
		
		//MAX Y MIN
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(10);
		numeros.add(100);
		numeros.add(40);
		numeros.add(30);
		System.out.println("El valor maximo y minimo: ");
		System.out.println("El maximo es: " + Collections.max(numeros));
		System.out.println("El minimo es: " + Collections.min(numeros));
		
		//UNIR LISTA
		List<Character> listaextendida = new ArrayList<Character>();
		listaextendida.add('A');
		listaextendida.add('B');
		listaextendida.add('C');
		Collections.addAll(listaextendida, letras);
		System.out.println("Lista extendida: ");
		Imprimir(listaextendida);
	}

	public static void Imprimir(List<Character> lista) {
		for (Character character : lista) {
			System.out.print(character + " ");
		}
		System.out.println("");
	}
}
