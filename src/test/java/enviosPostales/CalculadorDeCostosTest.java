package enviosPostales;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CalculadorDeCostosTest {

    private CalculadorDeCostos calculadorDeCostos;

    @Test
    public void unEnvioDeMenosDeCincoPaquetesCuesta50(){
        Assertions.assertThat(calculadorDeCostos.calcular(4)).isEqualTo(50F);
    }

    @Test
    public void unEnvioDeEntre5y10PaquetesCuesta80(){
        Assertions.assertThat(calculadorDeCostos.calcular(4)).isEqualTo(50F);

    }

    @Test
    public void unEnvioDe20PaquetesCuesta300(){
        Assertions.assertThat(calculadorDeCostos.calcular(20)).isEqualTo(50F);
    }
}
