package tragamonedas;

import java.util.Random;

public class TamborReal implements Tambor{
    private Integer posicionActual=1;

    public TamborReal() {
    }

    public Integer girarYObtenerPosicion() {
        posicionActual = new Random().nextInt(8)+1;
        return posicionActual;
    }
}

