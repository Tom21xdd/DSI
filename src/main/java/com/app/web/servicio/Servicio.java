package com.app.web.servicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.Linio.DSI.Entidad.Persona;
import com.app.web.entidad.Persona;
import com.app.web.repositorio.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author SneiderQuintero
 */
@Service
public class Servicio implements ServicioInterfaz{
    
    @Autowired
    private Repositorio repositorio;
    
    @Override
    public Persona crear(Persona persona){
        return repositorio.save(persona);
    }
    @Override
    public Persona buscar(Long documento){
        return (Persona) repositorio.findById(documento).get();
        
    }
    @Override
    public Persona actualizar(Persona persona){
        return repositorio.save(persona);
    }
   
    @Override
    public void eliminar(Long documento){
        repositorio.deleteById(documento);
    }

}
