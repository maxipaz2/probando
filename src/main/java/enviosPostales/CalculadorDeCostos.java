package enviosPostales;

public class CalculadorDeCostos {
    public Double calcular(Integer cantidadDePaquetes){
        if(cantidadDePaquetes < 5) {
            return 50D;
        } else if (cantidadDePaquetes < 10) {
            return 80D;
        } else {
            return cantidadDePaquetes * 15D;
        }
    }
}
