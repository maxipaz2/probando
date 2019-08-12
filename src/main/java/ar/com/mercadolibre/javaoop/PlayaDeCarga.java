package ar.com.mercadolibre.javaoop;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PlayaDeCarga {
    private ArrayList<Utilitario> listaDeUtilitariosEstacionados = new ArrayList<Utilitario>();
    private ArrayList<Integer> cargasDisponibles = new ArrayList<Integer>();
    private ArrayList<Integer> cargasDespachadas = new ArrayList<Integer>();
    private static PlayaDeCarga playaDeCarga = new PlayaDeCarga();

    public static PlayaDeCarga getInstance() {
        return playaDeCarga;
    }

    public ArrayList<Utilitario> getListaDeUtilitariosEstacionados() {
        return listaDeUtilitariosEstacionados;
    }

    public ArrayList<Integer> getCargasDisponibles() {
        return cargasDisponibles;
    }

    public ArrayList<Integer> getCargasDespachadas() {
        return cargasDespachadas;
    }

    public void vaciarPlaya() {
        listaDeUtilitariosEstacionados.clear();
        cargasDisponibles.clear();
        cargasDespachadas.clear();
    }

    public boolean hayCargaDisponible(){
        return cargasDisponibles.size() > 0;
    }

    public void cargar(Utilitario unUtilitario) {
        boolean elUtilitarioPudoCargar = false;
        if(hayCargaDisponible()){
            for(Integer carga : cargasDisponibles) {
                if (carga < unUtilitario.capacidadDisponible()) {
                    cargasDisponibles.remove(carga);
                    cargasDespachadas.add(carga);
                    unUtilitario.agregarCarga(carga);
                    elUtilitarioPudoCargar = true;
                }
            }
            if(elUtilitarioPudoCargar)
                listaDeUtilitariosEstacionados.add(unUtilitario);
        }
    }

    public void recibirContainerParaTesting(ArrayList<Integer> cargas) {
        this.cargasDisponibles = cargas;
    }

}
