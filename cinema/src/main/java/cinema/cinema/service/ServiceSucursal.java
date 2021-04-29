package cinema.cinema.service;

import cinema.cinema.entity.Sucursal;
import cinema.cinema.execption.Excepcion;
import cinema.cinema.repository.RepositorySucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ServiceSucursal implements RepositorySucursal {

    @Autowired
    RepositorySucursal repositorySucursal;

    @Override
    public void guardarSucursal(Sucursal sucursal) throws Excepcion{

        this.repositorySucursal.guardarSucursal(sucursal);

    }

    @Override
    public List<Sucursal> listaSucursal(Sucursal sucursal) throws Excepcion {
        return repositorySucursal.listaSucursal(sucursal);
    }

}
