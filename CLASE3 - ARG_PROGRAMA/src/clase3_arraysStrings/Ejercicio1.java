package clase3_arraysStrings;

import java.util.Scanner;

public class Ejercicio1 {
	public String palabra;
	public String letra;
	public int sumador;
	
	

	///////EJERCICIO1///////////

	public int LetraEnPalabra() {
		System.out.println("Ingrese su palabra: ");
		Scanner sc = new Scanner(System.in);
		String palabra = sc.nextLine();
		System.out.println("Ingrese su letra: ");
		char letra = sc.next().charAt(0);
		for (int i = 0; i < palabra.length(); i++) {
			char letras = palabra.charAt(i);
			if (letra == letras)
				sumador++;
		}

		return sumador;
	}
	public static void main(String[] args) {
		Ejercicio1 ejemplo=new Ejercicio1();
		int cantidadLetras=ejemplo.LetraEnPalabra();
		System.out.println("La letra está presente "+cantidadLetras + " veces en la palabra");
	}
}