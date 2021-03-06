/* ========================================================================
 * Copyright 2014 SportGroup
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 SportGroup
  
 Permission is hereby granted, free of charge, to any person obtaining a copy
 of this software and associated documentation files (the "Software"), to deal
 in the Software without restriction, including without limitation the rights
 to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the Software is
 furnished to do so, subject to the following conditions:
  
 The above copyright notice and this permission notice shall be included in
 all copies or substantial portions of the Software.
  
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 THE SOFTWARE.
 * ========================================================================
  
  
 Source generated by CrudMaker version 1.0.0.201411201032*/
package co.edu.uniandes.csw.eTours.Servicio.logic.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import co.edu.uniandes.csw.eTours.Servicio.logic.api.IServicioLogic;
import co.edu.uniandes.csw.eTours.Servicio.logic.dto.ServicioDTO;
import co.edu.uniandes.csw.eTours.Servicio.logic.dto.ServicioPageDTO;
import co.edu.uniandes.csw.eTours.Servicio.logic.converter.ServicioConverter;
import co.edu.uniandes.csw.eTours.Servicio.logic.entity.ServicioEntity;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Default
@Stateless
@LocalBean
public class ServicioLogic implements IServicioLogic 
{

    @PersistenceContext(unitName = "eToursClassPU")
    protected EntityManager entityManager;

    public ServicioDTO createServicio(ServicioDTO servicio) 
    {
        ServicioEntity entity = ServicioConverter.persistenceDTO2Entity(servicio);
        entityManager.persist(entity);
        return ServicioConverter.entity2PersistenceDTO(entity);
    }

    public List<ServicioDTO> getServicios() 
    {
        Query q = entityManager.createQuery("select u from ServicioEntity u");
        return ServicioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ServicioPageDTO getServicios(Integer page, Integer maxRecords) 
    {
        Query count = entityManager.createQuery("select count(u) from ServicioEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ServicioEntity u");
        if (page != null && maxRecords != null) 
        {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ServicioPageDTO response = new ServicioPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ServicioConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }

    public ServicioDTO getServicio(Long id) 
    {
        return ServicioConverter.entity2PersistenceDTO(entityManager.find(ServicioEntity.class, id));
    }

    public void deleteServicio(Long id) 
    {
        ServicioEntity entity = entityManager.find(ServicioEntity.class, id);
        entityManager.remove(entity);
    }

    public void updateServicio(ServicioDTO servicio) 
    {
        ServicioEntity entity = entityManager.merge(ServicioConverter.persistenceDTO2Entity(servicio));
        ServicioConverter.entity2PersistenceDTO(entity);
    }

    

    public ServicioPageDTO getServiciosProveedor(Long id_Proveedor, Integer page, Integer maxRecords ) 
    {
        Query count = entityManager.createQuery("select count(u) from ServicioEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.idProveedor="+id_Proveedor);
        if (page != null && maxRecords != null) 
        {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ServicioPageDTO response = new ServicioPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ServicioConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }
    
    public List<ServicioDTO> getServiciosProveedor(Long id_Proveedor)
    {
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.idProveedor="+id_Proveedor);
        return ServicioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public ServicioPageDTO getServiciosCategoria(int idCategoria, Integer page, Integer maxRecords ) 
    {
        Query count = entityManager.createQuery("select count(u) from ServicioEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.categoria"+idCategoria);
        if (page != null && maxRecords != null) 
        {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ServicioPageDTO response = new ServicioPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ServicioConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
    }
    
    public List<ServicioDTO> getServiciosCategoria(int id_Categoria)
    {
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.categoria"+id_Categoria);
        return ServicioConverter.entity2PersistenceDTOList(q.getResultList());
    }

    public List<ServicioDTO> getServiciosProveedorCategoria(Long id_Proveedor, int idCategoria) 
    {
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.categoria"+idCategoria+" and  u.idProveedor="+id_Proveedor);
        return ServicioConverter.entity2PersistenceDTOList(q.getResultList());
    }
    
     public ServicioPageDTO getServiciosProveedorCategoria(Long id_Proveedor, int idCategoria, Integer page, Integer maxRecords) 
    {
        Query count = entityManager.createQuery("select count(u) from ServicioEntity u");
        Long regCount = 0L;
        regCount = Long.parseLong(count.getSingleResult().toString());
        Query q = entityManager.createQuery("select u from ServicioEntity u where u.categoria"+idCategoria+" and  u.idProveedor="+id_Proveedor);
        if (page != null && maxRecords != null) 
        {
            q.setFirstResult((page - 1) * maxRecords);
            q.setMaxResults(maxRecords);
        }
        ServicioPageDTO response = new ServicioPageDTO();
        response.setTotalRecords(regCount);
        response.setRecords(ServicioConverter.entity2PersistenceDTOList(q.getResultList()));
        return response;
        
        
    }

    
   
}
