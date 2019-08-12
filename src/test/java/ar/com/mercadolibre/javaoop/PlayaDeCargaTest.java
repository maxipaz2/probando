package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class PlayaDeCargaTest {

    @Before
    public void prepararPlayaDeCarga() {
        ArrayList<Integer> cargas = new ArrayList<Integer>();
        PlayaDeCarga.getInstance().vaciarPlaya();
    }

    @Test
    public void laPlayaDeCargaExiste(){
        Assertions.assertThat(PlayaDeCarga.getInstance()).isNotNull();
    }

    @Test
    public void crearUtilitarioCamioneta(){
        //Camioneta camioneta = new Camioneta();
        //Assertions.assertThat(camioneta).isNotNull();
    }

    @Test
    public void laPlayaDeCargaComienzaVacia(){
        Assertions.assertThat(PlayaDeCarga.getInstance().hayCargaDisponible()).isFalse();
    }

    @Test
    public void utilitarioPuedeCargar(){
        Camion camion = new Camion(1000);

        PlayaDeCarga.getInstance();
    }

}
