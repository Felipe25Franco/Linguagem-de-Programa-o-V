package V2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio implements ISorteio {

    private static final int MAIOR_NUMERO_SORTEIO = 59;

    private List<Integer> numeros;

    public Sorteio(int qtdeNumeros) {
        this.numeros = sortear(qtdeNumeros);
    }

    public void setNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    @Override
    public List<Integer> getNumeros() {
        return this.numeros;
    }

    private List<Integer> sortear(int qtdeNumeros) {
        List<Integer> sorteados = new ArrayList<>();
        Random random = new Random();
        while (sorteados.size() < qtdeNumeros) {
            int numeroSorteado = random.nextInt(MAIOR_NUMERO_SORTEIO) + 1;
            if (!sorteados.contains(numeroSorteado)) {
                sorteados.add(numeroSorteado);
            }
        }
        return sorteados;
    }
}
