import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public void testDescuentoDel0Porciento() {
    DescuentoPorcentaje descuento = new DescuentoPorcentaje();
    descuento.setValorDesc(0f); // Descuento del 0%
    
    float valorInicial = 100f;
    float valorEsperado = 100f;
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
public void testDescuentoNoSuperaValorInicial() {
    DescuentoPorcentaje descuento = new DescuentoPorcentaje();
    descuento.setValorDesc(0.5f); // Descuento del 50%
    
    float valorInicial = 50f;
    float valorEsperado = 25f; // 50 - (50 * 0.5) = 25
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
public void testDescuentoDel10Porciento() {
    DescuentoPorcentaje descuento = new DescuentoPorcentaje();
    descuento.setValorDesc(0.1f); // Descuento del 10%
    
    float valorInicial = 100f;
    float valorEsperado = 90f; // 100 - (100 * 0.1) = 90
    
    assertEquals(valorEsperado, descuento.valorFinal(valorInicial), 0.01f);
}
