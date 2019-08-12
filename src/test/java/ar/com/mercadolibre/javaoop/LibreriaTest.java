package ar.com.mercadolibre.javaoop;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LibreriaTest {

    @Before
    public void prepararLibreria() {
        Libreria.getInstance().vaciarLibreria();

        List<Alquilable> listaDeAlquilables = new ArrayList<Alquilable>();
        listaDeAlquilables.add(new LibroEstudio("HarryPotter","mundo"));
        listaDeAlquilables.add(new LibroNovela("Principito","Asd"));

        listaDeAlquilables.stream()
                .forEach(unAlquilable -> Libreria.getInstance().agregarAlquiler(new Alquiler(unAlquilable,LocalDateTime.now())));

    }

    @Test
    public void agregoAlquilerALibreriaYVerifoQueSeAgrego(){
        Alquiler alquiler = new Alquiler(new LibroEstudio("Harry Potter", "Mundo"), LocalDateTime.now());
        Libreria.getInstance().agregarAlquiler(alquiler);
        Assertions.assertThat(Libreria.getInstance().obtenerAlquileres().contains(alquiler)).isTrue();
    }

    @Test
    public void creoAlquilerYVerificoQueLibroEsteAlquilado(){
        LibroEstudio harryPotter = new LibroEstudio("HarryPotter", "Mundo");
        Alquiler alquiler = new Alquiler(harryPotter, LocalDateTime.now());

        Assertions.assertThat(harryPotter.estaAlquilado()).isTrue();
    }

    @Test
    public void creoAlquilerLuegoDevuelvoElLibroYVerificoQueElAlquilerTieneFechaDeDevolucion(){
        LibroEstudio harryPotter = new LibroEstudio("HarryPotter", "Mundo");
        Alquiler alquiler = new Alquiler(harryPotter, LocalDateTime.now());

        alquiler.devolver();

        Assertions.assertThat(alquiler.getFechaDevolucion()).isNotNull();
    }

    @Test
    public void creoAlquilerLuegoDevuelvoLibroYVerificoQueElLibroNoEstaAlquilado(){
        LibroEstudio harryPotter = new LibroEstudio("HarryPotter", "Mundo");
        Alquiler alquiler = new Alquiler(harryPotter, LocalDateTime.now());

        alquiler.devolver();

        Assertions.assertThat(harryPotter.estaAlquilado()).isFalse();
    }

    @Test
    public void crearNovelaAlquilarlaYVerificarQueAlquileresDeLibreriaSeanCorrectos(){
        LibroNovela novela = new LibroNovela("Harry Potter","Mundo");
        Alquiler alquilerNovela = new Alquiler(novela, LocalDateTime.now());

        Libreria.getInstance().agregarAlquiler(alquilerNovela);

        Assertions.assertThat(novela.estaAlquilado()).isTrue();

        Integer cantidadDeAlquileresSinDevolver = Libreria.getInstance().listaDeAlquileresSinDevolver().size();
        Assertions.assertThat(cantidadDeAlquileresSinDevolver).isEqualTo(3);
    }

    @Test
    public void testPuntoB() {
        LibroEstudio estudioPractico = new LibroEstudio("Manual Practico", "CEIT");
        LibroEstudio estudioTeorico = new LibroEstudio("Manual Teorico", "CEIT");

        Alquiler alquilerPractico = new Alquiler(estudioPractico, LocalDateTime.now());
        Alquiler alquilerTeorico = new Alquiler(estudioTeorico, LocalDateTime.now());

        Libreria.getInstance().agregarAlquiler(alquilerPractico);
        Libreria.getInstance().agregarAlquiler(alquilerTeorico);

    }
}
