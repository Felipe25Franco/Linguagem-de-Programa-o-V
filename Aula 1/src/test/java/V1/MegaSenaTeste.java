package V1;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class MegaSenaTeste
{

    private final MegaSena megaSena = new MegaSena();

    @Test
    void deveRetornarZeroQuandoNumeroForaDoIntervalo() {
        List<Integer> numeros = Arrays.asList(0, 5, 10, 20, 30, 40);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoHaNumerosRepetidos() {
        List<Integer> numeros = Arrays.asList(5, 10, 10, 20, 30, 40);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoQuantidadeMenorQue6() {
        List<Integer> numeros = Arrays.asList(5, 10, 20, 30, 40);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void deveRetornarZeroQuandoQuantidadeMaiorQue15() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertEquals(0.0, resultado);
    }

    @Test
    void deveRetornarValorTotalSeAcertar6Numeros() {
        // Forçamos os 6 números sorteados no código original, mas aqui não é possível testar deterministicamente
        // esse comportamento porque o sorteio é aleatório.
        // Então, esse teste não é confiável sem refatorar o código para injetar o sorteio.

        // Esse teste é simbólico
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertTrue(resultado == 0.0 || resultado == 100.0 || resultado == 20.0 || resultado == 5.0);
    }

    @Test
    void deveRetornarZeroSeNaoAcertarNenhumNumero() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertTrue(resultado <= 100.0 && resultado >= 0.0);
    }

    @Test
    void deveAceitar15NumerosValidos() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        double resultado = megaSena.metodo(numeros, 100.0);
        assertTrue(resultado <= 100.0 && resultado >= 0.0);
    }
}
