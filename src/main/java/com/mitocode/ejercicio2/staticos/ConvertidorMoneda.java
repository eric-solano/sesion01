package com.mitocode.ejercicio2.staticos;

public abstract class ConvertidorMoneda {
	
	private static double COMISION = 0.06;
	
	public static double dolarNuevoSol(double monto, double precioDolar)
	{
		return monto * precioDolar * (1.0 + COMISION);
	}
}
