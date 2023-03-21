package clase_7;

import java.util.ArrayList;
public class clase_7{
public class ItemCarrito {
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
    
    public ArrayList<Producto> getProductos() {
        return productos;
    }
}

public class Descuento {
    private double porcentaje;
    private double descuentoFijo;
    private double porcentajeMaximo;
    
    public Descuento(double porcentaje, double descuentoFijo, double porcentajeMaximo) {
        this.porcentaje = porcentaje;
        this.descuentoFijo = descuentoFijo;
        this.porcentajeMaximo = porcentajeMaximo;
    }
    
    public double getPorcentaje() {
        return porcentaje;
    }
    
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    
    public double getDescuentoFijo() {
        return descuentoFijo;
    }
    
    public void setDescuentoFijo(double descuentoFijo) {
        this.descuentoFijo = descuentoFijo;
    }
    
    public double getPorcentajeMaximo() {
        return porcentajeMaximo;
    }
    
    public void setPorcentajeMaximo(double porcentajeMaximo) {
        this.porcentajeMaximo = porcentajeMaximo;
    }
    
    public double calcularDescuento(double total) throws Exception {
        if (total == 0) {
            throw new Exception("No se puede aplicar un descuento a un carrito de precio 0.");
        }
        
        double descuento = 0;
        if (porcentaje != 0) {
            descuento = total * (porcentaje / 100);
            if (porcentajeMaximo != 0 && descuento > porcentajeMaximo) {
                descuento = porcentajeMaximo;
            }
        } else if (descuentoFijo != 0) {
            descuento = descuentoFijo;
        }
        
        double totalConDescuento = total - descuento;
        if (totalConDescuento < 0) {
            throw new Exception("El descuento no puede dar un monto negativo.");
        }
        
        return descuento;
    }
    
    public double aplicarDescuento(double total) throws Exception {
        double descuento = calcularDescuento(total);
        return total - descuento;
    }
}
}