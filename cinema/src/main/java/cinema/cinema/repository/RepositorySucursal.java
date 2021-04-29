package cinema.cinema.repository;

import cinema.cinema.entity.Sucursal;
import cinema.cinema.execption.Excepcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface RepositorySucursal  {

    void guardarSucursal(Sucursal sucursal) throws Excepcion;
    List<Sucursal> listaSucursal(Sucursal sucursal) throws Excepcion;

}
