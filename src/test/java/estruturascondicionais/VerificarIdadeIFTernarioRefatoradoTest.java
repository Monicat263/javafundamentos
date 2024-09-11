package estruturascondicionais;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VerificarIdadeIFTernarioRefatoradoTest {
//    @Test
//    public void testMenordeIdade(){
//        assertEquals("Menor de idade",VerificarIdadeIFTernarioRefatorado.getverificaIdade(17));
//    }
//    @Test
//    public void testMaiordeIdade(){
//        assertEquals("Maior de idade",VerificarIdadeIFTernarioRefatorado.getverificaIdade(18));
//        assertEquals("Maior de idade",VerificarIdadeIFTernarioRefatorado.getverificaIdade(20));
//    }
//    @Test
//    public void testIdadeInvalida(){
//        assertEquals("Idade inválida",VerificarIdadeIFTernarioRefatorado.getverificaIdade(-1));
//    }
//
    // teste parametrizados
    @DisplayName("Testar Verificação de Idade com Operador Ternário")
    @ParameterizedTest(name = "idade {0} deve retoranar: {1}")
    @MethodSource("idadeInformadaProvider")
    void testeIdades(int idade,String idadeEsperada){
        // Chama o método estático diretamente da classe refatorada
        String resultado = VerificarIdadeIFTernarioRefatorado.getverificaIdade(idade);

        // Verifica se o resultado é o esperado
        assertEquals(idadeEsperada, resultado);
    }

    private static Stream<Arguments> idadeInformadaProvider(){
        return Stream.of(
               Arguments.of(-1,"Idade inválida"),
               Arguments.of(17,"Menor de idade"),
               Arguments.of(18,"Maior de idade")
        );

    }

}