package com.mitocode.ejercicio1;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		//Imprimir mensaje
		System.out.println("Bienveido al curso 2020");
		
		//Capturar valores de la consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu nombre");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
		sc.close();
	}

}
