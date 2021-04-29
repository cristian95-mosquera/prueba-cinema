package cinema.cinema.controller;

import cinema.cinema.entity.Sucursal;
import cinema.cinema.execption.Excepcion;
import cinema.cinema.service.ServiceSucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/sucursal")
public class ControllerSucursal {

    @Autowired
    ServiceSucursal serviceSucursal;


    @PostMapping
    public void create(@RequestBody Sucursal sucursal) throws Excepcion {
      this.serviceSucursal.guardarSucursal(sucursal);
    }

    @GetMapping
    public  ResponseEntity<List<Sucursal>> ver(){
        return (new ResponseEntity(ServiceSucursal.class, HttpStatus.OK));
    }
}
