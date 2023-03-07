package _Clase4;

import java.util.Scanner;

public class Ej4_1_a {

	public static void main(String[] args) {
		String letra = "A";
		int numeros[] = new int[3];
		int variable;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese su " + (i + 1) + "° número");
			
			numeros[i] = sc.nextInt();
			
		}
		System.out.println("Ingrese el orden deseado: A / D (Ascendente/Descendente");
		letra=sc.next();
		if (letra.equals("D")) {

			
			
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
			if (numeros[0] < numeros[1]) {
				variable = numeros[0];
				numeros[0] = numeros[1];
				numeros[1] = variable;
			}for (int i = 0; i < numeros.length; i++) {
				System.out.print(numeros[i] + " ");
			}
			
		}else if (letra.equals("A")) {
			
			if (numeros[0] > numeros[1]) {
				variable = numeros[0];
				numeros[0] = numeros[1];
				numeros[1] = variable;
			}
			if (numeros[1] > numeros[2]) {
				variable = numeros[1];
				numeros[1] = numeros[2];
				numeros[2] = variable;
			}
			if (numeros[0] > numeros[2]) {
				variable = numeros[0];
				numeros[0] = numeros[2];
				numeros[2] = variable;
			}
			if (numeros[0] > numeros[1]) {
				variable = numeros[0];
				numeros[0] = numeros[1];
				numeros[1] = variable;
			}
			
		}else {
			System.out.print("opción incorrecta");
			
		}
		
		System.out.println();

	}

}
