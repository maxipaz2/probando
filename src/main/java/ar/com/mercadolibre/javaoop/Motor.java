package ar.com.mercadolibre.javaoop;

public abstract class Motor {

    private Integer potencia;
    private Double temperatura;

    protected Motor() {
        setPotencia(0);
        setTemperatura(0D);
    }

    protected Motor(Double temperatura, Integer potencia){
        setPotencia(potencia);
        setTemperatura(temperatura);
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia < 0 ? 0 : potencia;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public void modificarPotencia(Integer _potencia){
        setPotencia(this.potencia + _potencia);
        setTemperatura(this.temperatura + _potencia);
    };
}
