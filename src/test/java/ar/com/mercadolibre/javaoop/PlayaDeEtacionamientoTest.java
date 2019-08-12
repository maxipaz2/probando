package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class PlayaDeEtacionamientoTest {

    @Before
    public void limpiarPlayaEstacionamiento() {
        PlayaEstacionamiento.getInstance().vaciarVehiculosDePlaya();
    }

    @Test
    public void crearVehiculoAuto(){
        Auto auto = new Auto();
        Assertions.assertThat(auto).isNotNull();
    }

    @Test
    public void laPlayaDeEstacionamientoExiste(){
        Assertions.assertThat(PlayaEstacionamiento.getInstance()).isNotNull();
    }

    @Test
    public void estacionarAutoAgregaVehiculoEnPlayaDeEstacionados(){

        Auto auto = new Auto();
        auto.estacionar();

        boolean elAutoSeEstacionoCorrectamente = PlayaEstacionamiento.getInstance().getVehiculosEstacionados().contains(auto);
        Assertions.assertThat(elAutoSeEstacionoCorrectamente).isTrue();
        Assertions.assertThat(PlayaEstacionamiento.getInstance().getVehiculosEstacionados().size()).isEqualTo(1);

    }

    @Test
    public void noSePuedeEstacionarDosVecesElMismoAutoEnLaPlayaDeEstacionamient(){
        Auto auto = new Auto();
        auto.estacionar();
        auto.estacionar();

        Assertions.assertThat(PlayaEstacionamiento.getInstance().getVehiculosEstacionados().size()).isEqualTo(1);
    }


}
