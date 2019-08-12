package ar.com.mercadolibre.javaoop;

public class LibroInfantil extends Libro {
    private Integer edadDesde;
    private Integer edadHasta;

    protected LibroInfantil(String unTitulo, String unaEditorial, Integer edadDesde, Integer edadHasta) {
        super(unTitulo, unaEditorial);
        this.edadDesde = edadDesde;
        this.edadHasta = edadHasta;
    }
}
