
//Tome el ejercicio B de la clase 3 y que por parámetro se pueda elegir si es una
//codificación o decodificación, el valor del desplazo, y 2 archivos, uno para la entrada y
//otro para la salida. Que por pantalla solo indique si terminó o no correctamente, los
//resultados deben estar en el archivo de salida

package _Clase4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Clase4_Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Desea: \n (1)- CODIFICAR \n (2)-DECODIFICAR");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		System.out.println("Ingrese Desplazamiento: ");
		int desplazamiento = sc.nextInt();
		System.out.println("Ingrese ruta del archivo ORIGEN: ");
		String pathOrigen = sc.next();
		System.out.println("Ingrese ruta del archivo DESTINO: ");
		String pathDestino = sc.next();

		String palabra = leerPalabra(pathOrigen);
		if (opcion == 1) {
			escribirPalabra(pathDestino, encriptar(palabra, desplazamiento));
		} else {
			escribirPalabra(pathDestino, desencriptar(palabra, desplazamiento));
		}
	}

	public static String leerPalabra(String rutaArchivoOrigen) {

		try {
			List<String> palabra = Files.readAllLines(Paths.get(rutaArchivoOrigen));
			System.out.println("Archivo origen leido correctamente");
			return String.join(" ", palabra);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error al leer el archivo de origen";
		}

	}

	public static void escribirPalabra(String rutaArchivoDestino, String mensaje) {
		if (Files.exists((Paths.get(rutaArchivoDestino)))){
			try {
				Files.write(Paths.get(rutaArchivoDestino), mensaje.getBytes());
				System.out.println("Archivo escrito correctamente");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}else {
			File archivoDestino=new File (rutaArchivoDestino);
			System.out.println("Archivo escrito correctamente");
			try {
				Files.write(Paths.get(rutaArchivoDestino), mensaje.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
	}

	public static String encriptar(String palabra, int desplazamiento) {
		String palabraEncriptada = "";
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String abecArray[] = abecedario.split("");
		char nuevaLetra;
		char palabraArray[] = palabra.toCharArray();

		// recorremos la palabra original
		for (char letra : palabraArray) {
			System.out.println(letra);
			int indice = abecedario.indexOf(letra);
			int nuevoIndice = indice + desplazamiento;
			if (nuevoIndice > abecedario.length()) {
				nuevoIndice = nuevoIndice - abecedario.length();
			}
			if (letra != ' ') {
				nuevaLetra = abecedario.charAt(nuevoIndice);			
			}else {
				nuevaLetra =' ';
			}
			
			palabraEncriptada = palabraEncriptada + nuevaLetra;

		}
		System.out.println(palabraEncriptada);
		return palabraEncriptada;
	}

	public static String desencriptar(String palabra, int desplazamiento) {
		String palabraDesencriptada = "";
		String abecedario = "abcdefghijklmnñopqrstuvwxyz";
		String abecArray[] = abecedario.split("");
		char nuevaLetra;
		char palabraArray[] = palabra.toCharArray();

		// recorremos la palabra original
		for (char letra : palabraArray) {
			int indice = abecedario.indexOf(letra);
			int nuevoIndice = indice - desplazamiento;
			if (nuevoIndice < 0) {
				nuevoIndice = abecedario.length() - nuevoIndice;
			}
			if (letra != ' ') {
				nuevaLetra = abecedario.charAt(nuevoIndice);
				
			}else {
				nuevaLetra =' ';
			}
			palabraDesencriptada = palabraDesencriptada + nuevaLetra;
		}

		return palabraDesencriptada;
	}
}
