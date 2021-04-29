package cinema.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class AgendarPelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgendarPelicula;

    @ManyToOne
    @JoinColumn(name= "idSala")
    private Sala sala;

   private String formatoPelicula;
   private Date fechaPelicula;
   private String horarioPelicula;

    public AgendarPelicula() {
    }

    public AgendarPelicula(int idAgendarPelicula, Sala sala, String formatoPelicula, Date fechaPelicula, String horarioPelicula) {
        this.idAgendarPelicula = idAgendarPelicula;
        this.sala = sala;
        this.formatoPelicula = formatoPelicula;
        this.fechaPelicula = fechaPelicula;
        this.horarioPelicula = horarioPelicula;
    }

    public int getIdAgendarPelicula() {
        return idAgendarPelicula;
    }

    public void setIdAgendarPelicula(int idAgendarPelicula) {
        this.idAgendarPelicula = idAgendarPelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getFormatoPelicula() {
        return formatoPelicula;
    }

    public void setFormatoPelicula(String formatoPelicula) {
        this.formatoPelicula = formatoPelicula;
    }

    public Date getFechaPelicula() {
        return fechaPelicula;
    }

    public void setFechaPelicula(Date fechaPelicula) {
        this.fechaPelicula = fechaPelicula;
    }

    public String getHorarioPelicula() {
        return horarioPelicula;
    }

    public void setHorarioPelicula(String horarioPelicula) {
        this.horarioPelicula = horarioPelicula;
    }
}
