package estruturascondicionais;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularFaturaTelefoniaRefatoradaTest {
    @Test
    @DisplayName("Testa utilização dentro da franquia com minutos abaixo da franquia")
    void testDentroDaFranquia() {
        CalcularFaturaTelefoniaRefatorada calculadora = new CalcularFaturaTelefoniaRefatorada();
        double resultado = calculadora.calcularTotalPagar(80);
        assertEquals(50.00, resultado);
    }
    @Test
    @DisplayName("Testa utilização acima da franquia com cobrança adicional")
    void testExcedeuFranquia() {
        CalcularFaturaTelefoniaRefatorada calculadora = new CalcularFaturaTelefoniaRefatorada();
        double resultado = calculadora.calcularTotalPagar(150);
        assertEquals(150,resultado);
    }
    @Test
    @DisplayName("Testa utilização igual a quantidade de minutos da franquia")
    void testMinutosUtilizadosIgualValorDaFranquia(){
        CalcularFaturaTelefoniaRefatorada calculadora = new CalcularFaturaTelefoniaRefatorada();
        double resultado = calculadora.calcularTotalPagar(100);
        assertEquals(50,resultado);
    }

}