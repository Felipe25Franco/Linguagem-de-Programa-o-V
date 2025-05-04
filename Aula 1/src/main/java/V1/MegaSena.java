package V1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MegaSena {

    public double metodo(List<Integer> numerosApostados, double valorAposta) {
        if (!apostaValida(numerosApostados)) return 0.0;

        Set<Integer> numerosSorteados = sortearNumeros(6);
        int acertos = contarAcertos(numerosApostados, numerosSorteados);

        return calcularPremio(acertos, valorAposta);
    }

    private boolean apostaValida(List<Integer> numeros) {
        Set<Integer> numerosUnicos = new HashSet<>();

        for (Integer numero : numeros) {
            if (numero < 1 || numero > 60 || !numerosUnicos.add(numero)) {
                return false;
            }
        }

        int quantidade = numeros.size();
        return quantidade >= 6 && quantidade <= 15;
    }

    private Set<Integer> sortearNumeros(int quantidade) {
        Set<Integer> sorteados = new HashSet<>();
        Random random = new Random();

        while (sorteados.size() < quantidade) {
            int numero = random.nextInt(60) + 1;
            sorteados.add(numero);
        }

        return sorteados;
    }

    private int contarAcertos(List<Integer> apostados, Set<Integer> sorteados) {
        int acertos = 0;
        for (Integer numero : apostados) {
            if (sorteados.contains(numero)) {
                acertos++;
            }
        }
        return acertos;
    }

    private double calcularPremio(int acertos, double valor) {
        return switch (acertos) {
            case 6 -> valor;
            case 5 -> valor * 0.2;
            case 4 -> valor * 0.05;
            default -> 0.0;
        };
    }
}

