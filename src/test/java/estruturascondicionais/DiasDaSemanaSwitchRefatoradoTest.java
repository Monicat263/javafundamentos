package estruturascondicionais;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DiasDaSemanaSwitchRefatoradoTest {
    @DisplayName("Teste de Seleção do Dia da Semana")
    @ParameterizedTest(name = "Dia {0} deve retornar: {1}")
    @MethodSource("selecaoDiaDaSemanaProvider")
    void testSelecaoDiaDaSemana(int dia, String mensagemEsperada) {
        DiasDaSemanaSwitchRefatorado dias = new DiasDaSemanaSwitchRefatorado();
        String resultado = dias.getDiaDaSemana(dia);
        assertEquals(mensagemEsperada,resultado);

    }
    @DisplayName("Teste Seleção do dia da Semana quando recebe um valor inválido")
    @ParameterizedTest(name = "Dia {0} deve retornar: {1}")
    @MethodSource("selecaoDiaDaSemanaInvalidoProvider")
    void testeSelecaoDiaDaSemanaInvalido(int dia, String mensagemEsperada){
        DiasDaSemanaSwitchRefatorado diasInvalido = new DiasDaSemanaSwitchRefatorado();
        String resultado = diasInvalido.getDiaDaSemana(dia);
        assertEquals(mensagemEsperada,resultado);

    }

    // Método que fornece os parâmetros para o teste
    private static Stream<Arguments>selecaoDiaDaSemanaProvider(){
        return Stream.of(
                Arguments.of(1,"Domingo"),
                Arguments.of(2,"Segunda"),
                Arguments.of(3,"Terça"),
                Arguments.of(4,"Quarta"),
                Arguments.of(5,"Quinta"),
                Arguments.of(6,"Sexta"),
                Arguments.of(7,"Sábado")
        );
    }

    private static Stream<Arguments>selecaoDiaDaSemanaInvalidoProvider(){
        return Stream.of(
                Arguments.of(0, "Número inválido"),
                Arguments.of(8, "Número inválido"),
                Arguments.of(100, "Número inválido"),
                Arguments.of(-1, "Número inválido")
        );
    }
}