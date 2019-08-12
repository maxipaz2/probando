package enviosPostales;

public class Envio {

    Integer cantidadDePaquetes = 0;
    String direccionDeEntrega = "";
    Double costo = 0D;
    Integer pesoTotalEnKg=0;
    Transporte transporteAsociado = null;

    public Envio(Integer cantidadDePaquetes, Double costoEnvio, String direccionDeEntrega, Integer pesoTotalEnKg, Transporte transporte) {
        this.cantidadDePaquetes = cantidadDePaquetes;
        this.costo = costoEnvio;
        this.direccionDeEntrega = direccionDeEntrega;
        this.pesoTotalEnKg = pesoTotalEnKg;
        this.transporteAsociado = transporte;
    }

    public Integer getCantidadDePaquetes() {
        return cantidadDePaquetes;
    }

    public Double getCosto() {
        return costo;
    }
}
