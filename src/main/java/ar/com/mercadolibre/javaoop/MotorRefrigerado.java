package ar.com.mercadolibre.javaoop;

public class MotorRefrigerado extends Motor {

    protected MotorRefrigerado(){
        super();
    }

    protected MotorRefrigerado(Double temperatura, Integer potencia){
        super(temperatura, potencia);
    }

    public void refrigerar(){
        setTemperatura(this.getTemperatura() * 0.80);
    }
}
