package ar.com.mercadolibre.javaoop;

import java.time.LocalDateTime;

public abstract class Alquilable extends Libro {

    private Boolean estaAlquilado = false;
    private LocalDateTime fechaDevolucion;

    protected Alquilable(String unTitulo, String unaEditorial) {
        super(unTitulo, unaEditorial);
    }

    public void alquilar() {
        estaAlquilado = true;
    }

    public void devolver() {
        estaAlquilado = false;
        fechaDevolucion = LocalDateTime.now();
    }

    public boolean estaAlquilado(){
        return estaAlquilado;
    }
}
