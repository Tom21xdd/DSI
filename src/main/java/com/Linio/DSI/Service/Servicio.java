/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linio.DSI.Service;
import com.Linio.DSI.Entidad.Persona;
import com.Linio.DSI.repositorio.Repositorio;
import com.Linio.Entidad.Persona;
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
        return repositorio.findById(documento).get();
        
    }
    @Override
    public Persona actualizar(Persona persona){
        return repositorio.save(persona);
        
    }
    
    @Override
    public void eliminar(Long documento){
        repositorio.deleteById(documento);
    }

    @Override
    public Object crear(Object persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object actualizar(Object persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
