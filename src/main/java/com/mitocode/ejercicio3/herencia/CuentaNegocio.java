package com.mitocode.ejercicio3.herencia;

public class CuentaNegocio extends Cuenta {
	
	private double limitePrestamo;
	
	public CuentaNegocio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CuentaNegocio(String numeroCuenta, String titular, double saldo, double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		this.limitePrestamo = limitePrestamo;
		// TODO Auto-generated constructor stub
	}

	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo = " + limitePrestamo + ", NumeroCuenta = " + getNumeroCuenta()
				+ ", Titular = " + getTitular() + ", Saldo = " + getSaldo() + "]";
	}

	
}
