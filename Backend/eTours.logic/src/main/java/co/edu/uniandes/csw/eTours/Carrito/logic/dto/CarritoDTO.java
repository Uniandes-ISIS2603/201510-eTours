/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.eTours.Carrito.logic.dto;

/**
 *
 * @author estudiante
 */
public class CarritoDTO 
{
 private Long id;
    
    private int cantidad;
    
    private String servicios;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    
       public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int pcantidad){
        this.cantidad = pcantidad;
    }
    
    public String getServices()
    {
        return servicios;
    }
    
    public void setServices(String pServicios)
    {
    
        this.servicios =pServicios; 
    }
    
    public void addServices(String pServicio)
    {
    
        servicios +=("|" +pServicio);
    }
}
