package clase3_arraysStrings;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		LetraEnPalabra();
	//ordenaNumeros();	
	//SumaMayores();	
	}
	
	
	
	public String palabra;
	public String letra;
	public static int sumador;
	
	

	///////EJERCICIO1///////////

	public static void  LetraEnPalabra() {
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

		System.out.println("la letra "+letra+" aparece " +sumador +" veces en " + palabra.toString()); 
	}
	
	
		//////EJERCICIO 2//////
	public static void ordenaNumeros() {

		int numeros[] = new int[3];
		int variable;
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese su " + (i + 1) + "° número");
			Scanner sc = new Scanner(System.in);
			numeros[i] = sc.nextInt();
		}
		if (numeros[0] < numeros[1]) {
			variable = numeros[0];
			numeros[0] = numeros[1];
			numeros[1] = variable;
		}
		if (numeros[1] < numeros[2]) {
			variable = numeros[1];
			numeros[1] = numeros[2];
			numeros[2] = variable;
		}
		if (numeros[0] < numeros[2]) {
			variable = numeros[0];
			numeros[0] = numeros[2];
			numeros[2] = variable;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println();

	}
	//////////////EJERCICIO 3////////////
	public static void SumaMayores() {
		System.out.println("Ingrese su el número de elementos del arreglo");
		Scanner sc = new Scanner(System.in);
		int tamanio=sc.nextInt();
		double suma=0;
		double arreglo[] = new double[tamanio];
		for (int i = 0; i < tamanio; i++) {
			System.out.println("Ingrese su " + (i + 1) + "° número");
			//Scanner sc = new Scanner(System.in);
			arreglo[i] = sc.nextDouble();
		}
		Arrays.sort(arreglo);
		System.out.println("Ingrese el número límite \"X\" ");
		double x = sc.nextDouble();
		for(double num : arreglo) {
			if(num>x) {
				suma = suma+num;
			}
			
		}
		System.out.println("La suma de todos los números mayores que: " + x + " es de = "+suma);
	}
}
