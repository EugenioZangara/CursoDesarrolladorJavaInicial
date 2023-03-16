import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void testMultiplicar() {
        Calculadora miCalculadora = new Calculadora();
        double resultado = miCalculadora.multiplicar(80, 3);
        Assertions.assertEquals(240, resultado);
    }
    
    @Test
    public void testSumarYDividir() {
        Calculadora miCalculadora = new Calculadora();
        double resultado = miCalculadora.sumar(150, 180) / 3;
        Assertions.assertEquals(110, resultado);
    }
    
    @Test
    public void testRestarYMultiplicar() {
        Calculadora miCalculadora = new Calculadora();
        double resultado = miCalculadora.restar(90, 50) * 15;
        Assertions.assertNotEquals(605, resultado);
    }
    
    @Test
    public void testSumarYMultiplicar() {
        Calculadora miCalculadora = new Calculadora();
        double resultado = miCalculadora.sumar(70, 40) * 25;
        Assertions.assertNotEquals(2700, resultado);
    }
}
