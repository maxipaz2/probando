package tragamonedas;

import org.assertj.core.api.Assertions;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TragamonedasTest {

    private static Tragamonedas tragamonedas;

    @BeforeClass
    public static void inicializar(){
        List<Tambor> tambores = new ArrayList<>();

        tambores.add(new TamborReal());
        tambores.add(new TamborReal());
        tambores.add(new TamborReal());

        tragamonedas = new Tragamonedas(tambores);
    }


    @Test
    public void crearTragamonedas() {
        Assertions.assertThat(tragamonedas).isNotNull();
    }

    @Test
    public void accionarTragamonedas(){
        tragamonedas.girarTambores();

        List<Tambor> tambores = tragamonedas.obtenerTambores();
        tambores.stream().forEach(tamborReal -> tamborReal.girarYObtenerPosicion());

        //Assertions.assertThat(.girarYObtenerPosicion()).isBetween(1,8);

    }

    @Test
    public void cuandoElTragamonedasTieneSusTamboresEnLaMismaPosicionOtorgaPremio(){

        List<Tambor> tambores = new ArrayList<>();

        tambores.add(new TamborFake());
        tambores.add(new TamborFake());
        tambores.add(new TamborFake());

        Tragamonedas tragamonedasFake = new Tragamonedas(tambores);
        tragamonedasFake.girarTambores();

        Assertions.assertThat(tragamonedasFake.daPremio()).isTrue();
    }
}
