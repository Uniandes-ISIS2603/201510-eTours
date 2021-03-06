package co.edu.uniandes.csw.eTours.Proveedor.entity;

import co.edu.uniandes.csw.eTours.Paquete.entity.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import co.edu.uniandes.csw.eTours.Servicio.logic.entity.ServicioEntity;
@Entity
public class ProveedorEntity {

    @Id
    @GeneratedValue(generator = "Paquete")
    private Long id;
    private Double descount;
    private ArrayList<ServicioEntity> servicios = new ArrayList<ServicioEntity>();

     
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDescuento() {
        return descount;
    }

    public void setDescuento(Double descuento) {
        this.descount = descuento;
    }
    
    public ArrayList<ServicioEntity>  getServices()
    {
        return servicios;
    }
    
    public void setServices(ArrayList<ServicioEntity> pServicios)
    {
    
        this.servicios =pServicios; 
    }
    
    public void addServices(ServicioEntity pServicio)
    {
    
        servicios.add(pServicio);
    }
    
}
