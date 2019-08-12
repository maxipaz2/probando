package ar.com.mercadolibre.javaoop;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Libreria {

    private static Libreria libreria = new Libreria();
    private List<Alquiler> listaDeAlquileres = new ArrayList<Alquiler>();

    public static Libreria getInstance(){
        return libreria;
    }

    public void agregarAlquiler(Alquiler unAlquiler){
        listaDeAlquileres.add(unAlquiler);
    }

    public List<Alquiler> obtenerAlquileres() {
        return listaDeAlquileres;
    }

    public void vaciarLibreria() {
        listaDeAlquileres.clear();
    }

    public Alquiler buscarAlquilerde(Alquilable libroAlquilable) throws NoExisteElAlquilerDelLibroException {
        List<Alquiler> librosAlquiladosConEseNombre = listaDeAlquileres.stream()
                .filter(unAlquiler -> unAlquiler.getLibroAlquilado().equals(libroAlquilable))
                .collect(Collectors.toList());
        if(librosAlquiladosConEseNombre.size() > 0)
            return librosAlquiladosConEseNombre.get(0);
        throw new NoExisteElAlquilerDelLibroException(libroAlquilable);
    }

    public Map<String, LocalDateTime> listarAlquileres() {
        Map<String,LocalDateTime> mapAlquileres = new HashMap<String, LocalDateTime>();

        listaDeAlquileres.stream().forEach(unAlquier -> {
            mapAlquileres.put(unAlquier.obtenerNombreLibroAlquilado(),unAlquier.obtenerFechaAlquiler());
        });

        return mapAlquileres;
    }

    public List<Alquiler> listaDeAlquileresSinDevolver(){
        return listaDeAlquileres.stream()
                .filter(unAlquiler -> unAlquiler.getLibroAlquilado().estaAlquilado() == true)
                .collect(Collectors.toList());
    }

}
