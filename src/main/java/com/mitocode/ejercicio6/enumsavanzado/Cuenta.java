package com.mitocode.ejercicio6.enumsavanzado;

public abstract class Cuenta {

	// POO: los atributos de una clase deben de ser privados y accesibles por los
	// metodos
	// Toda la clase por defecto tiene un constructor y se definen valor iniciales
	// Todas las clases heredan de la clase object
	private String numeroCuenta;
	private String titular;
	protected double saldo;
	private Estado estado;

	public Cuenta() {
		super();
	}

	public Cuenta(String numeroCuenta, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.estado = Estado.ACTIVA;
	}

	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.estado = Estado.ACTIVA;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void deposito(double monto) {
		saldo = saldo + monto; // saldo += monto
	}

	public void retiro(double monto) {
		saldo -= monto + 5;

	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + ", estado="
				+ estado + "]";
	}

	

}