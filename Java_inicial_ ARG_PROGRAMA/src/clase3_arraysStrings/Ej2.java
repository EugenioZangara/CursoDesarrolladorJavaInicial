package clase3_arraysStrings;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabraEncriptada = "";
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String abecArray[] = abecedario.split("");
		int desplazamiento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su palabra: ");
		String palabra = sc.nextLine();
		char palabraArray[] = palabra.toCharArray();
		System.out.println("Ingrese el desplazamiento: ");
		desplazamiento = sc.nextInt();

		// recorremos la palabra original
		for (char letra : palabraArray) {
			int indice = abecedario.indexOf(letra);
			int nuevoIndice = indice + desplazamiento;
			if (nuevoIndice > abecedario.length()) {
				nuevoIndice = nuevoIndice - abecedario.length();
			}
			char nuevaLetra = abecedario.charAt(nuevoIndice);
			palabraEncriptada = palabraEncriptada + nuevaLetra;
		}

		System.out.println("Su palabra Encriptada es: " + palabraEncriptada);
	}
}