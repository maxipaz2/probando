package enviosPostales;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Despachante {
    CalculadorDeCostos calculadorDeCostos;
    AsignadorDeTransporte asignadorTransporte;
    Integer cantidadDeEnviosDespachados=0;
    List<Envio> enviosDespachados = new ArrayList<Envio>();

    public Despachante(CalculadorDeCostos calculador, AsignadorDeTransporte asignador) {
        this.calculadorDeCostos = calculador;
        this.asignadorTransporte = asignador;
    }

    public Envio despachar(Integer cantidadDePaquetes, String direccionDestino, Integer pesoTotalEnKg) throws NoSePuedeDistribuirException {
        Double costoDelEnvio = calculadorDeCostos.calcular(cantidadDePaquetes);

        if(cantidadDeEnviosDespachados < 10)
            costoDelEnvio = costoDelEnvio * 0.90;

        Transporte transporte = asignadorTransporte.asignar(pesoTotalEnKg);

        Envio unEnvio =  new Envio(cantidadDePaquetes, costoDelEnvio, direccionDestino, pesoTotalEnKg, transporte);
        cantidadDeEnviosDespachados++;
        enviosDespachados.add(unEnvio);
        return unEnvio;

    }

    public Double getCostoTotal(){
        return enviosDespachados.stream().mapToDouble(unEnvio -> unEnvio.getCosto()).sum();
    }


}
