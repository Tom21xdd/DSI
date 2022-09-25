package com.app.web.controlador;

import com.app.web.entidad.Persona;
import com.app.web.servicio.Servicio;
import com.app.web.servicio.ServicioInterfaz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControladoraAPP {

    @Autowired
    private ServicioInterfaz servicio;

    @GetMapping({ "/", "/login" })
	public String index() {
		return "login";
	}

	@GetMapping("/cambioClave")
	public String hello() {
		return "cambioClave";
	}

	@GetMapping("/perfil")
	public String user() {
		return "perfil";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
    

////    @RequestMapping("/cambioClave")
////    public String cambioClave(@PathVariable Long documento) {
////        Persona personaE = servicio.buscar(documento);
////        personaE.se
////        return "redirect:/perfil";
////    }

    @PostMapping("/perfil/(documento)")
    public String actualizar_datos(@PathVariable Long documento, @ModelAttribute("persona") Persona persona, Model modelo) {
        Persona personaE = servicio.buscar(documento);
        personaE.setNombre(persona.getNombre());
        personaE.setApellido(persona.getApellido());
        personaE.setEmail(persona.getEmail());
        personaE.setFechaNacimiento(persona.getFechaNacimiento());

        servicio.actualizar(personaE);

        return "redirect:/perfil";
    }

    @GetMapping("/perfil/(documento)")
    public String eliminarUsuario(@PathVariable Long documento) {
        servicio.eliminar(documento);
        return "redirect:/login";
    }

}
