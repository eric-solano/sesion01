package sesion01;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		//Imprimir mensaje
		System.out.println("Bienveido al curso");
		
		//Capturar valores de la consola
		Scanner sc = new Scanner(System.in);
		System.out.println("Cual es tu nombre");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvenido " + nombre);
		sc.close();
	}

}
