package com.app.web.servicio;

import com.app.web.entidad.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//import com.Linio.DSI.Entidad.Persona;
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
