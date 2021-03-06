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
package co.edu.uniandes.csw.eTours.service;

import co.edu.uniandes.csw.eTours.Paquete.logic.api.IPaqueteLogic;
import co.edu.uniandes.csw.eTours.Paquete.logic.dto.PaqueteDTO;
import co.edu.uniandes.csw.eTours.Paquete.logic.dto.PaquetePageDTO;



import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Consumes(MediaType.APPLICATION_JSON)
@Stateless
@Produces(MediaType.APPLICATION_JSON)
@Path("/paquete")
public class PaqueteService {
    
    @Inject 
    protected IPaqueteLogic paqueteLogicService;

    @POST
    public PaqueteDTO createPaquete(PaqueteDTO paq) {
        return paqueteLogicService.createPaquete(paq);
    }

    @DELETE
    @Path("{id}")
    public void deletePaquete(@PathParam("id") Long id) {
        paqueteLogicService.deletePaquete(id);
    }

    @GET
    public PaquetePageDTO getPaquete(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords) {
        return paqueteLogicService.getPaquete(page, maxRecords);
    }

    @GET
    @Path("{id}")
    public PaqueteDTO getPaquete(@PathParam("id") Long id) {
        return paqueteLogicService.getPaquete(id);
    }

    @PUT
    @Path("{id}")
    public void updatePaquete(@PathParam("id") Long id, PaqueteDTO paq) {
        paqueteLogicService.updatePaquete(paq);
    }

}
