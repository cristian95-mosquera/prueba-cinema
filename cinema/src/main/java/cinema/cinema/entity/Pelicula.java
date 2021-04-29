package cinema.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPelicula;

    @ManyToOne
    @JoinColumn(name = "idGeneroPelicula")
    private GeneroPelicula generoPelicula;

    @ManyToOne
    @JoinColumn(name = "idAdministrador")
    private Administrador administrador;

    private String nombreOriginalPelicula;
    private String nombreTraducidoPelicula;
    private Date fechaEstrenoPelicula;
    private String imagenPelicula;
    private Date fechaCarteleraFin;
    private Date fechaTiempoEnCartelera;
    private String sinopsis;
    private String formatoPelicula;
    private String duracionEnMinutos;

    public Pelicula() {
    }

    public Pelicula(int idPelicula, GeneroPelicula generoPelicula, Administrador administrador, String nombreOriginalPelicula, String nombreTraducidoPelicula, Date fechaEstrenoPelicula, String imagenPelicula, Date fechaCarteleraFin, Date fechaTiempoEnCartelera, String sinopsis, String formatoPelicula, String duracionEnMinutos) {
        this.idPelicula = idPelicula;
        this.generoPelicula = generoPelicula;
        this.administrador = administrador;
        this.nombreOriginalPelicula = nombreOriginalPelicula;
        this.nombreTraducidoPelicula = nombreTraducidoPelicula;
        this.fechaEstrenoPelicula = fechaEstrenoPelicula;
        this.imagenPelicula = imagenPelicula;
        this.fechaCarteleraFin = fechaCarteleraFin;
        this.fechaTiempoEnCartelera = fechaTiempoEnCartelera;
        this.sinopsis = sinopsis;
        this.formatoPelicula = formatoPelicula;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public GeneroPelicula getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getNombreOriginalPelicula() {
        return nombreOriginalPelicula;
    }

    public void setNombreOriginalPelicula(String nombreOriginalPelicula) {
        this.nombreOriginalPelicula = nombreOriginalPelicula;
    }

    public String getNombreTraducidoPelicula() {
        return nombreTraducidoPelicula;
    }

    public void setNombreTraducidoPelicula(String nombreTraducidoPelicula) {
        this.nombreTraducidoPelicula = nombreTraducidoPelicula;
    }

    public Date getFechaEstrenoPelicula() {
        return fechaEstrenoPelicula;
    }

    public void setFechaEstrenoPelicula(Date fechaEstrenoPelicula) {
        this.fechaEstrenoPelicula = fechaEstrenoPelicula;
    }

    public String getImagenPelicula() {
        return imagenPelicula;
    }

    public void setImagenPelicula(String imagenPelicula) {
        this.imagenPelicula = imagenPelicula;
    }

    public Date getFechaCarteleraFin() {
        return fechaCarteleraFin;
    }

    public void setFechaCarteleraFin(Date fechaCarteleraFin) {
        this.fechaCarteleraFin = fechaCarteleraFin;
    }

    public Date getFechaTiempoEnCartelera() {
        return fechaTiempoEnCartelera;
    }

    public void setFechaTiempoEnCartelera(Date fechaTiempoEnCartelera) {
        this.fechaTiempoEnCartelera = fechaTiempoEnCartelera;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getFormatoPelicula() {
        return formatoPelicula;
    }

    public void setFormatoPelicula(String formatoPelicula) {
        this.formatoPelicula = formatoPelicula;
    }

    public String getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(String duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }
}
