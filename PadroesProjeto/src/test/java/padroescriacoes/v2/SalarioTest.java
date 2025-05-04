package padroescriacoes.v2;

import org.junit.jupiter.api.Test;
import padorescriacao.v2.Cargo;
import padorescriacao.v2.Escolaridade;
import padorescriacao.v2.Salario;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalarioTest {

    @Test
    public void deveMostrarSalarioGerenteFundamental(){
        Salario salario = new Salario(new Cargo("gerente"), new Escolaridade("fundamental"));
        assertEquals(5250.0, salario.calcularSalarioFinal());
    }
    @Test
    public void deveMostrarSalarioGerenteMedio(){
        Salario salario = new Salario(new Cargo("gerente"), new Escolaridade("medio"));
        assertEquals(5500.0, salario.calcularSalarioFinal());
    }
    @Test
    public void deveMostrarSalarioGerenteGraducao(){
        Salario salario = new Salario(new Cargo("gerente"), new Escolaridade("graduacao"));
        assertEquals(6000.0, salario.calcularSalarioFinal());
    }

    @Test
    void deveMostrarSalarioAnalistaFundamental(){

    }

    @Test
    void deveMostrarSalarioAnalistaMedio(){

    }

    @Test
    void deveMostrarSalarioAnalistaGraducao(){

    }

    @Test
    void deveMostrarSalarioOperadorFundamental(){

    }

    @Test
    void deveMostrarSalarioOperadorMedio(){

    }

    @Test
    void deveMostrarSalarioOperadorGraducao(){

    }


}
