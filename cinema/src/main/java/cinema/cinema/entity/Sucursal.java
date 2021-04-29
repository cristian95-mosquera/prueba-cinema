package cinema.cinema.entity;

import javax.persistence.*;

@Entity
public class Sucursal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSucursal;
    private String nombreSucursal;
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "idCiudad")
    private Ciudad ciudad;

    @ManyToOne
    @JoinColumn(name = "idAdministrador")
    private Administrador administrador;

    public Sucursal() {
    }

    public Sucursal(int idSucursal, String nombreSucursal, String direccion, Ciudad ciudad, Administrador administrador) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.administrador = administrador;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
