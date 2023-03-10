package clase5;

public class ItemCarrito extends Producto {
	private int cantidad;

	public double subtotalProducto(Producto producto) {

		return (this.cantidad * producto.getPrecio());
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}