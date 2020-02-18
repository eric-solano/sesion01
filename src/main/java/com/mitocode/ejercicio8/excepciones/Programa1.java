package com.mitocode.ejercicio8.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		//FORMA 1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ingrese numerador: ");
//		int numerador = sc.nextInt();
//
//		System.out.println("Ingrese denominador: ");
//		int denominador = sc.nextInt();
//
//		try {
//			int resultado = numerador / denominador;
//			System.out.println("Resultado: " + resultado);
//		} catch (ArithmeticException e) {
//			System.out.println("Cero es un denominador invalido");
//		} catch (InputMismatchException e) {
//			System.out.println("Denominador formato invalido");
//		} finally {
//			System.out.println("Se ejecuta siempre");
//		}
//
//		sc.close();

		//FORMA 2
		//int resultado = dividir(5, 1);
		//System.out.println("Resultado: " + resultado);
		
		//FORMA 3 - THROWS
		try {
			int resultado = dividir2(5,0);
			System.out.println("Resultado: " + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Denominador formato invalido");
		} 
		
	}

	public static int dividir(int numerador, int denominador) {
		try {
			return numerador / denominador;
		} catch (Exception e) {
			System.out.println("Cero es un denominador invalido");
			return -1;
		} finally {
			System.out.println("Se ejecuta siempre");
		}
	}

	public static int dividir2(int numerador, int denominador) throws ArithmeticException {
		return numerador / denominador;
	}

}
