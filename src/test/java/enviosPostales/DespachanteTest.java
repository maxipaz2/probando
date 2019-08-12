package enviosPostales;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DespachanteTest {


    private Despachante despachante;

    @Mock CalculadorDeCostos calculadorDeCostosMock;
    @Mock AsignadorDeTransporte asignadorDeTransporte;


    @Before
    public void cargarDespachante() {
        despachante = new Despachante(calculadorDeCostosMock,asignadorDeTransporte);
    }

    @Test
    public void despachanteDespachaCorrectamenteUnEnvio() throws NoSePuedeDistribuirException {

        when(calculadorDeCostosMock.calcular(Mockito.anyInt())).thenReturn(300D);

        Envio unEnvio = despachante.despachar(20, "Av siempre viva 123", 10);

        Assertions.assertThat(unEnvio.getCosto()).isEqualTo(270D);

    }

    @Test
    public void despachanteDespachaCorrectamenteUnEnvioYAplicaDescuentosHastaElDecimo() throws NoSePuedeDistribuirException {

        when(calculadorDeCostosMock.calcular(Mockito.eq(20))).thenReturn(300D);

        Envio unEnvio = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio1 = despachante.despachar(20, "Av siempre viva 123", 10);

        Envio envio2 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio3 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio4 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio5 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio6 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio7 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio8 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio9 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio10 = despachante.despachar(20, "Av siempre viva 123", 10);
        Envio envio11 = despachante.despachar(20, "Av siempre viva 123", 10);




        Assertions.assertThat(despachante.getCostoTotal()).isEqualTo(3300D);

    }

}
