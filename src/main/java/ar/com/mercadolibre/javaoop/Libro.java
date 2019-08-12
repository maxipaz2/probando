package ar.com.mercadolibre.javaoop;

public abstract class Libro {
    private String editorial = "";
    private String titulo = "";

    protected Libro (String unTitulo, String unaEditorial){
        titulo = unTitulo;
        editorial = unaEditorial;
    }

    public String getTitulo(){
        return titulo;
    }
}
