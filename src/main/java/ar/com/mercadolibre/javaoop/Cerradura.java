package ar.com.mercadolibre.javaoop;

public class Cerradura {

    Integer clave;
    private boolean cerrada = true;

    public Cerradura() {

    }

    public Cerradura(Integer clave) {
        this.clave = clave;
    }

    public boolean estaCerrada() {
        return cerrada;
    }

    public void abrir(Integer clave){
        if(clave == this.clave)
            cerrada = false;
    }
}
