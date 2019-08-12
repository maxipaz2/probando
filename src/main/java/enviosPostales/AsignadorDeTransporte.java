package enviosPostales;

public class AsignadorDeTransporte {

    public Transporte asignar(Integer pesoEnKilogramos) throws NoSePuedeDistribuirException {

        if(pesoEnKilogramos < 5)
            return Transporte.BICICLETA;
        else if(pesoEnKilogramos <= 50)
            return Transporte.AUTO;
        else if(pesoEnKilogramos <= 150)
            return Transporte.CAMIONETA;
        else if(pesoEnKilogramos >150)
            throw new NoSePuedeDistribuirException();
        return null;
    }
}
