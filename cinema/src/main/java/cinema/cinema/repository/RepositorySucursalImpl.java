package cinema.cinema.repository;

import cinema.cinema.entity.Sucursal;
import cinema.cinema.execption.Excepcion;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class RepositorySucursalImpl implements RepositorySucursal{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void guardarSucursal(Sucursal sucursal) throws Excepcion {
        try {
            em.persist(sucursal);

        }catch(Exception e) {

        }
    }

    @Override
    public List<Sucursal> listaSucursal(Sucursal sucursal) throws Excepcion {

        List<Sucursal> lista = (List<Sucursal>)em.createQuery("select idSucursal,nombreSucursal, direccion, idCiudad, idAdministrador from sucursal").getResultList();
        return lista;
    }
}
