package tragamonedas;

import java.util.List;
import java.util.Optional;

public class Tragamonedas {

    public Tragamonedas(List<Tambor> tambores) {
        this.listaTambores = tambores;
    }

    private List<Tambor> listaTambores;

    public void girarTambores() {
        listaTambores.stream().forEach(unTambor -> unTambor.girarYObtenerPosicion());
    }

    public List<Tambor> obtenerTambores() {
        return listaTambores;
    }

    public boolean daPremio() {
        Tambor primerTamborDeLaListaDeTambores = listaTambores.get(0);
        return listaTambores.stream()
                .allMatch(unTambor -> unTambor.girarYObtenerPosicion() == primerTamborDeLaListaDeTambores.girarYObtenerPosicion());
    }
}
