package estruturascondicionais;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EstruturaIfElseRefatoradoTest {

    @ParameterizedTest
    @MethodSource("mensagemPorHoraProvider")
    void  testMensagemPorHora(int hora, String mensageEsperada){
        assertEquals(mensageEsperada,EstruturaIfElseRefatorado.getMensagemPorHora(hora));

    }
    // Método que fornece os parâmetros para o teste
    private static Stream<Arguments> mensagemPorHoraProvider(){
        return Stream.of(
                Arguments.of(1,"Good Morning!!"),
                Arguments.of(2,"Good Morning!!"),
                Arguments.of(3,"Good Morning!!"),
                Arguments.of(4,"Good Morning!!"),
                Arguments.of(5,"Good Morning!!"),
                Arguments.of(6,"Good Morning!!"),
                Arguments.of(7,"Good Morning!!"),
                Arguments.of(8,"Good Morning!!"),
                Arguments.of(9,"Good Morning!!"),
                Arguments.of(10,"Good Morning!!"),
                Arguments.of(11,"Good Morning!!"),
                Arguments.of(12,"Good afternoon!"),
                Arguments.of(13,"Good afternoon!"),
                Arguments.of(14,"Good afternoon!"),
                Arguments.of(15,"Good afternoon!"),
                Arguments.of(16,"Good afternoon!"),
                Arguments.of(17,"Good afternoon!"),
                Arguments.of(18,"Good evening"),
                Arguments.of(19,"Good evening"),
                Arguments.of(20,"Good evening"),
                Arguments.of(21,"Good evening"),
                Arguments.of(22,"Good evening"),
                Arguments.of(23,"Good evening"),
                Arguments.of(00,"Good evening")
        );

    }

}