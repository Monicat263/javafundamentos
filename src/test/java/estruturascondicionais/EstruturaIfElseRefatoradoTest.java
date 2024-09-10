package estruturascondicionais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstruturaIfElseRefatoradoTest {


    @Test
    void testHoraEntre1e11() {
        assertEquals("Good morning !!", EstruturaIfElseRefatorado.getMensagemPorHora(5));
        assertEquals("Good morning !!", EstruturaIfElseRefatorado.getMensagemPorHora(11));
    }
    @Test
    void testHorasEntre12e17(){
        assertEquals("Afternoon",EstruturaIfElseRefatorado.getMensagemPorHora(12));
        assertEquals("Afternoon",EstruturaIfElseRefatorado.getMensagemPorHora(17));
    }

    @Test
    void testHorasAcimaDe17(){
        assertEquals("Good evening", EstruturaIfElseRefatorado.getMensagemPorHora(18));
        assertEquals("Good evening", EstruturaIfElseRefatorado.getMensagemPorHora(23));
    }

}