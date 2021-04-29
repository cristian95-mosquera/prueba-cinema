package cinema.cinema.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ReservaPelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @ManyToOne
    @JoinColumn(name = "idSucursal")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "idPelicula")
    private Pelicula pelicula;

    @ManyToOne
    @JoinColumn(name = "idSala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idAgendarPelicula")
    private AgendarPelicula agendarPelicula;

    private String horaInicioPelicula;

    private int cantidadSillas;
    private int pago;

    public ReservaPelicula() {
    }

    public ReservaPelicula(int idReserva, Sucursal sucursal, Pelicula pelicula, Sala sala, Cliente cliente, String horaInicioPelicula, AgendarPelicula agendarPelicula, int cantidadSillas, int pago) {
        this.idReserva = idReserva;
        this.sucursal = sucursal;
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
        this.horaInicioPelicula = horaInicioPelicula;
        this.agendarPelicula = agendarPelicula;
        this.cantidadSillas = cantidadSillas;
        this.pago = pago;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getHoraInicioPelicula() {
        return horaInicioPelicula;
    }

    public void setHoraInicioPelicula(String horaInicioPelicula) {
        this.horaInicioPelicula = horaInicioPelicula;
    }

    public AgendarPelicula getAgendarPelicula() {
        return agendarPelicula;
    }

    public void setAgendarPelicula(AgendarPelicula agendarPelicula) {
        this.agendarPelicula = agendarPelicula;
    }

    public int getCantidadSillas() {
        return cantidadSillas;
    }

    public void setCantidadSillas(int cantidadSillas) {
        this.cantidadSillas = cantidadSillas;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
}
