package clase7_herencias;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class CarritoDeCompras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto [] compras=new Producto[3];
		double subtotales[]= new double[3];
		Scanner sc=new Scanner(System.in);
		String listaCompras = "C:\\Users\\Zangara\\Documents\\01-ARG_PROGRAMA - JAVA\\CursoDesarrolladorJavaInicial-\\05 - CLASE 5 - INTODUCCION POO\\listaCompras.txt" ;
		try {
			int i=0;
			ItemCarrito itemEnCarrito=new ItemCarrito();
			for (String linea : Files.readAllLines(Paths.get(listaCompras))){
				String item=String.join("", linea);
				String[] itemArray = item.split(",");			
				itemEnCarrito.setCantidad(Integer.parseInt(itemArray[0]));
				System.out.println("Cantidad del producto: " + i +"= "+ itemArray[0]);
				itemEnCarrito.setPrecio(Double.parseDouble(itemArray[1]));
				System.out.println("Precio del producto: " + i +":= "+itemArray[1]);
				itemEnCarrito.setNombre(itemArray[2]);
				System.out.println("Nombre del producto: " + i +"= "+itemArray[2]);
				subtotales[i]=itemEnCarrito.subtotalProducto(itemEnCarrito);
				compras[i]=itemEnCarrito;
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Carrito carrito=new Carrito();
		double totalAPagar = carrito.totalCarrito(subtotales);
		System.out.println("TOTAL A PAGAR: $ " + totalAPagar);
		System.out.println("aplicar descuento?: Ingrese valor... ");
		
		double descuento=sc.nextDouble();
		double nuevoTotal=carrito.descuento(totalAPagar, descuento);
		
		System.out.println("TOTAL A PAGAR (con descuento): $ "+nuevoTotal);
		
	}

}
