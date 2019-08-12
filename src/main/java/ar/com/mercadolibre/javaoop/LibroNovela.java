package ar.com.mercadolibre.javaoop;

public class LibroNovela extends Alquilable {

    private String autor;
    private String editor;

    protected LibroNovela(String unTitulo, String unaEditorial) {
        super(unTitulo, unaEditorial);
    }
}
