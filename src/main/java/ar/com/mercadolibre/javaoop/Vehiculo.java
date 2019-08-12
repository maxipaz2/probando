package ar.com.mercadolibre.javaoop;

public abstract class Vehiculo {

    public void estacionar() {
        PlayaEstacionamiento.getInstance().agregarVehiculoEstacionado(this);
    }
}