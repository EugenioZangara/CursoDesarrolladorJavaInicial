import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public void testDescuentoNoSuperaTope() {
    DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope();
    descuento.setValorDesc(0.3f); // Descuento del 30%
    descuento.setTope(50f); // Tope de 50 euros
    
    float valorInicial = 80f;
    float valorEsperado = 56f; // 80 - (80 * 0.3) = 56, pero como es mayor que el tope, se aplica el tope y el resultado es 50
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
public void testDescuentoSuperiorAlTope() {
    DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope();
    descuento.setValorDesc(0.2f); // Descuento del 20%
    descuento.setTope(50f); // Tope de 50 euros
    
    float valorInicial = 300f;
    float valorEsperado = 250f; // 300 - 50 = 250
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
public void testDescuentoInferiorAlTope() {
    DescuentoPorcentajeConTope descuento = new DescuentoPorcentajeConTope();
    descuento.setValorDesc(0.2f); // Descuento del 20%
    descuento.setTope(50f); // Tope de 50 euros
    
    float valorInicial = 100f;
    float valorEsperado = 80f; // 100 - (100 * 0.2) = 80
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
