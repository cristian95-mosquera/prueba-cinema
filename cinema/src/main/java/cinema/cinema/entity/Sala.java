package cinema.cinema.entity;

import javax.persistence.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSala;

    @ManyToOne
    @JoinColumn(name = "idTipoSala")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "idSucursal")
    private Sucursal sucursal;

    private int numeroDeFilas;
    private int numeroMaximoSillasPorFila;

    public Sala() {
    }

    public Sala(int idSala, Sala sala, Sucursal sucursal, int numeroDeFilas, int numeroMaximoSillasPorFila) {
        this.idSala = idSala;
        this.sala = sala;
        this.sucursal = sucursal;
        this.numeroDeFilas = numeroDeFilas;
        this.numeroMaximoSillasPorFila = numeroMaximoSillasPorFila;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public int getNumeroDeFilas() {
        return numeroDeFilas;
    }

    public void setNumeroDeFilas(int numeroDeFilas) {
        this.numeroDeFilas = numeroDeFilas;
    }

    public int getNumeroMaximoSillasPorFila() {
        return numeroMaximoSillasPorFila;
    }

    public void setNumeroMaximoSillasPorFila(int numeroMaximoSillasPorFila) {
        this.numeroMaximoSillasPorFila = numeroMaximoSillasPorFila;
    }
}
