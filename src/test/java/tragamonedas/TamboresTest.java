package tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TamboresTest {


    @Test
    public void crearTambor(){
        TamborReal tamborReal = new TamborReal();

        Assertions.assertThat(tamborReal).isNotNull();
    }

    @Test
    public void alInicializarUnTamborSuPosicionEsUno(){
        TamborReal tamborReal = new TamborReal();
        Assertions.assertThat(tamborReal.girarYObtenerPosicion()).isEqualTo(1);
    }

    @Test
    public void obtenerPosicionDeUnTamborDevuelveUnEnteroEntreUnoYOcho(){
        TamborReal tamborReal = new TamborReal();

        Assertions.assertThat(tamborReal.girarYObtenerPosicion()).isBetween(1,8);
    }




}
