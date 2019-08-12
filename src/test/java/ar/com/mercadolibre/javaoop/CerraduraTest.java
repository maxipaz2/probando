package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

    @Test
    public void crearCerradura(){
        Cerradura cerradura = new Cerradura();
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClaveNumerica(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
    }

    @Test
    public void crearCerraduraConClaveNumericaYLoGuarde() {
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1234);
    }

    @Test
    public void crearCerraduraConOtraClaveNumericaYLoGuarde() {
        Cerradura cerradura = new Cerradura(1235);
        Assertions.assertThat(cerradura).isNotNull();
        Assertions.assertThat(cerradura.clave).isEqualTo(1235);
    }

    @Test
    public void unaCerraduraSeCreaCerrada(){
        Cerradura cerradura = new Cerradura(1234);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
    }

    @Test
    public void abrirCerraduraConClave() {
        Cerradura cerradura = new Cerradura (1235);

        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

        cerradura.abrir(1235);

        Assertions.assertThat(cerradura.estaCerrada()).isFalse();

    }

    @Test
    public void abrirCerrauraConClaveIncorrecta(){

        Cerradura cerradura = new Cerradura (1235);
        Assertions.assertThat(cerradura.estaCerrada()).isTrue();

        cerradura.abrir(1234);

        Assertions.assertThat(cerradura.estaCerrada()).isTrue();
    }
}
