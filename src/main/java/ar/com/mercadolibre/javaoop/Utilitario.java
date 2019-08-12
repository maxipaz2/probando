package ar.com.mercadolibre.javaoop;

import java.util.ArrayList;

public abstract class Utilitario extends Vehiculo{

    ArrayList<Integer> listaCargas;
    Integer cargaMaxima = 0;
    private Integer cargaActual = 0;

    protected Utilitario(Integer cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public Integer capacidadDisponible(){
        return cargaMaxima - cargaActual;
    }

    public void agregarCarga(Integer carga){
        this.listaCargas.add(carga);
        cargaActual += carga;
    }

}
