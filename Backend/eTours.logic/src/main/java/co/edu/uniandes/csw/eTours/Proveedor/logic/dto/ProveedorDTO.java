package com.edu.uniandes.scw.eTours.Proveedor.logic.dto;

import co.edu.uniandes.csw.eTours.Paquete.logic.dto.*;
import co.edu.uniandes.csw.eTours.Servicio.logic.entity.ServicioEntity;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ProveedorDTO {
   
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
    
    public ArrayList<ServicioEntity> getServices()
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
