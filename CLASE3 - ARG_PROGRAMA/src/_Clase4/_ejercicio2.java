//Haga una main donde por parámetro envíe la ruta de un archivo. Ese archivo debe
//contener números. El programa debe escribir por consola la suma de esos números
//a. Al programa anterior agreguele un parámetro para que la operación pueda ser
//suma o multiplicación.





package _Clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class _ejercicio2 {

	public static void main(String[] args) {
		String operacion;
		System.out.println("Ingrese su la operación que desea realizar: (1) SUMAR / (2) MULTIPLICAR");
		Scanner sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		if (opcion==1) {
			operacion="SUMA";
		}else {
			operacion="MULTIPLICACION";
		};
		
		
		
		
		calcular("C:\\Users\\COAN\\Documents\\ZAN\\clase4_manejo_de_archivos.txt", 	operacion);

	}
public static void calcular(String ruta, String operacion) {
	int total=0;
	
	List<String> numeros = null;
	try {
		numeros = Files.readAllLines(Paths.get(ruta));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if (operacion.equals("SUMA")) {
		for (String numero :  numeros) {
			total=total + Integer.parseInt(numero);
		}	
	} else if (operacion.equals("MULTIPLICACION")) {
		total=1;
		for (String numero :  numeros) {
			System.out.println(numero);
			
			total=total * (Integer.parseInt(numero));
		}}else {
			System.out.println("error en la operación seleccionada");
			}	
	System.out.println("La "+ operacion + " de los números contenidos en el archivo indicado es de: " + total);
		}
	
	
	
}

