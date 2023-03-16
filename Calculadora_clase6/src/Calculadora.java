public class Calculadora {
    
    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }
    
    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }
    
    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }
    
    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            throw new ArithmeticException("No es posible dividir entre cero.");
        }
        return unNumero / otroNumero;
    }
}
