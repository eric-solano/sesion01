package com.mitocode.ejercicio91.genericos;

public class ClaseA<T> {
	private T objetoT;

	public ClaseA(T objetoT) {
		super();
		this.objetoT = objetoT;
	}

	public T getObjetoT() {
		return objetoT;
	}

	public void setObjetoT(T objetoT) {
		this.objetoT = objetoT;
	}

	public void mostrarTipo() {
		System.out.println("T es una clase. " + objetoT.getClass());
	}

}
