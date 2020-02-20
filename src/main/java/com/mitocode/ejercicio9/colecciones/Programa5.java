package com.mitocode.ejercicio9.colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Programa5 {
	
	private static int ELEMENTOS = 50000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista1 = new ArrayList<String>();		
		LinkedList<String> lista2 = new LinkedList<String>();
		
		System.out.println("***************************");
		System.out.println("**********Agregar**********");
		System.out.println("***************************");
		//Array
		long start1 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista1.add("Elemento: " + i);
		}
		long tiempo1 = System.currentTimeMillis() - start1;
		System.out.println("Arraylist: " + tiempo1 + " ms");
		
		//Linkedlist
		long start2 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista2.add("Elemento: " + i);
		}
		long tiempo2 = System.currentTimeMillis() - start2;
		System.out.println("Linkedlist: " + tiempo2 + " ms");
		
		System.out.println("***************************");
		System.out.println("**********Obtener**********");
		System.out.println("***************************");
		//Array
		long start3 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista1.get(i);
		}
		long tiempo3 = System.currentTimeMillis() - start3;
		System.out.println("Arraylist: " + tiempo3 + " ms");
		
		//Linkedlist
		long start4 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista2.get(i);
		}
		long tiempo4 = System.currentTimeMillis() - start4;
		System.out.println("Linkedlist: " + tiempo4 + " ms");
		
		System.out.println("***************************");
		System.out.println("*********Modificar*********");
		System.out.println("***************************");
		//Array
		long start5 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista1.set(i, "elemento " + i);
		}
		long tiempo5 = System.currentTimeMillis() - start5;
		System.out.println("Arraylist: " + tiempo5 + " ms");
		
		//Linkedlist
		long start6 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista2.set(i, "elemento " + i);
		}
		long tiempo6 = System.currentTimeMillis() - start6;
		System.out.println("Linkedlist: " + tiempo6 + " ms");
		
		System.out.println("***************************");
		System.out.println("*********Eliminar*********");
		System.out.println("***************************");
		//Array
		long start7 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista1.remove(0);
		}
		long tiempo7 = System.currentTimeMillis() - start7;
		System.out.println("Arraylist: " + tiempo7 + " ms");
		
		//Linkedlist
		long start8 = System.currentTimeMillis();		
		for (int i = 0; i < ELEMENTOS; i++) {
			lista2.remove(0);
		}
		long tiempo8 = System.currentTimeMillis() - start8;
		System.out.println("Linkedlist: " + tiempo8 + " ms");
	}

}
