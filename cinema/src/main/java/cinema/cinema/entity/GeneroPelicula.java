package cinema.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GeneroPelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idGeneroPelicula;

    private String nombre;

    public GeneroPelicula() {
    }

    public GeneroPelicula(int idGeneroPelicula, String nombre) {
        this.idGeneroPelicula = idGeneroPelicula;
        this.nombre = nombre;
    }

    public int getIdGeneroPelicula() {
        return idGeneroPelicula;
    }

    public void setIdGeneroPelicula(int idGeneroPelicula) {
        this.idGeneroPelicula = idGeneroPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
