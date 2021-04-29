package cinema.cinema.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoSala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int idTipoSala ;
   private String nombre;

    public TipoSala() {
    }

    public TipoSala(int idTipoSala, String nombre) {
        this.idTipoSala = idTipoSala;
        this.nombre = nombre;
    }

    public int getIdTipoSala() {
        return idTipoSala;
    }

    public void setIdTipoSala(int idTipoSala) {
        this.idTipoSala = idTipoSala;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
