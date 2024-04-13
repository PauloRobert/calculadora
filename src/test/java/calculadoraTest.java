import org.br.calculadora.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    // Teste de soma com parâmetros de um arquivo CSV
    //Testando todas as combinações possíveis para uma calculadora
    @ParameterizedTest
    @CsvFileSource(resources = "/dados-soma.csv")
    @DisplayName("Teste de soma com CSV")
    public void testSomarComCSV(int a, int b, int resultadoEsperado) {
        int resultado = calc.somar(a, b);
        assertEquals(resultadoEsperado, resultado);
    }

    // Teste de subtração
    @Test
    @DisplayName("Teste de subtração")
    public void testSubtrair() {
        int resultado = calc.subtrair(10, 5);
        assertEquals(5, resultado);
    }

    // Teste de multiplicação
    @Test
    @DisplayName("Teste de multiplicação")
    public void testMultiplicar() {
        int resultado = calc.multiplicar(5, 5);
        assertEquals(25, resultado);
    }


    // Teste de divisão
    @ParameterizedTest
    @CsvSource({"10, 2, 5", "8, 4, 2", "25, 5, 5"})
    @DisplayName("Teste de divisão")
    public void testDividir(int a, int b, double resultadoEsperado) {
        double resultado = calc.dividir(a, b);
        assertEquals(resultadoEsperado, resultado);
    }
}
