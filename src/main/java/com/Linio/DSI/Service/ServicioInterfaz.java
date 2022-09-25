/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Linio.DSI.Service;
//import com.Linio.DSI.Entidad.Persona;
import com.Linio.Entidad.Persona;
/**
 *
 * @author SneiderQuintero
 */
public interface ServicioInterfaz {
    public Persona crear(Persona persona);
    public Persona buscar(Long documento);
    public Persona actualizar(Persona persona);
    public void eliminar(Long documento);
}
