import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculadoraTest {

    private Calculadora calc;

    @BeforeEach
    public void inicializar(){
        this.calc = new Calculadora();
    }
    @ParameterizedTest
    @CsvSource({"2, 3, 5", "3, 3, 6", "0,0,0", "5,5,10"})
     @DisplayName("Teste Fiap")
    public void testSomar(int a, int b, int resultadoEsperado) {
        //Calculadora calculadora = new Calculadora();
        int resultado = calc.somar(a,b);
        assertEquals(resultadoEsperado, resultado);
    }
        @RepeatedTest(10)
    public void testSomar2() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5,5);
        assertEquals(10, resultado);
    }
}
