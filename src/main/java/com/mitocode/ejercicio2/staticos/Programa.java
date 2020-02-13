package com.mitocode.ejercicio2.staticos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cual es el precio del dolar?");
		double precioDolar = sc.nextDouble();
		
		System.out.println("Cuantos dolares se compraran?");
		double monto = sc.nextDouble();
		
		//Sin clases abstractas
		//ConvertidorMoneda c = new ConvertidorMoneda(); 
		//double resultado = c.dolarNuevoSol(monto, precioDolar);
		//System.out.println("El monto a pagar en soles es: " + resultado);		
		//sc.close();
		
		//Con clases abstractas
		double resultado = ConvertidorMoneda.dolarNuevoSol(monto, precioDolar);
		System.out.println("El monto a pagar en soles es: " + resultado);
		
		sc.close();
	}

}
