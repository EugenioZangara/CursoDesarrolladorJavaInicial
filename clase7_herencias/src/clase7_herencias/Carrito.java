package clase7_herencias;

public class Carrito {

	public double totalCarrito(double[] subtotales) {
		double total = 0;
		for (double subtotal : subtotales) {
			total = total + subtotal;
		}
		return total;
	}
	public double descuento(double total, double porcentaje) {
		return total - (total*porcentaje)/100;
	}
	
	
}