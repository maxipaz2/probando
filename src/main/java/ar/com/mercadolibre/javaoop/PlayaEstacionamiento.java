package ar.com.mercadolibre.javaoop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayaEstacionamiento {
    private ArrayList<Vehiculo> vehiculosEstacionados = new ArrayList<Vehiculo>();
    private static PlayaEstacionamiento playaEstacionamiento = new PlayaEstacionamiento();

    public static PlayaEstacionamiento getInstance() {
        return playaEstacionamiento;
    }

    public ArrayList<Vehiculo> getVehiculosEstacionados() {
        return vehiculosEstacionados;
    }

    public void agregarVehiculoEstacionado(Vehiculo unVehiculo){
        if(!vehiculosEstacionados.contains(unVehiculo))
            vehiculosEstacionados.add(unVehiculo);
    }

    public void vaciarVehiculosDePlaya() {
        vehiculosEstacionados.clear();
    }
}
