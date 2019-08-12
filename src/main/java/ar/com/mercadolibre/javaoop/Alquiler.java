package ar.com.mercadolibre.javaoop;

import java.time.LocalDateTime;

public class Alquiler {
    private Alquilable libroAlquilado;
    private LocalDateTime fechaAlquiler;
    private LocalDateTime fechaDevolucion;

    public Alquiler(Alquilable libroAlquilado, LocalDateTime fechaAlquiler){
        this.libroAlquilado = libroAlquilado;
        this.fechaAlquiler = fechaAlquiler;
        libroAlquilado.alquilar();
    }

    public Alquilable getLibroAlquilado() {
        return libroAlquilado;
    }

    public String obtenerNombreLibroAlquilado(){
        return libroAlquilado.getTitulo();
    }

    public LocalDateTime obtenerFechaAlquiler() {
        return this.fechaAlquiler;
    }

    public LocalDateTime getFechaDevolucion(){
        return fechaDevolucion;
    }

    public void devolver(){
        libroAlquilado.devolver();
        fechaDevolucion = LocalDateTime.now();
    }
}
