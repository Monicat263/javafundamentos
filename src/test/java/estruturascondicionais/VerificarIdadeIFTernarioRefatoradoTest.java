package estruturascondicionais;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificarIdadeIFTernarioRefatoradoTest {
    @Test
    public void testMenordeIdade(){
        assertEquals("Menor de idade",VerificarIdadeIFTernarioRefatorado.verificaIdade(17));
    }
    @Test
    public void testMaiordeIdade(){
        assertEquals("Maior de idade",VerificarIdadeIFTernarioRefatorado.verificaIdade(18));
        assertEquals("Maior de idade",VerificarIdadeIFTernarioRefatorado.verificaIdade(20));
    }
    @Test
    public void testIdadeInvalida(){
        assertEquals("Idade inválida",VerificarIdadeIFTernarioRefatorado.verificaIdade(-1));
    }

}