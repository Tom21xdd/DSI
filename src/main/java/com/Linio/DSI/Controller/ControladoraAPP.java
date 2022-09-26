package com.Linio.DSI.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ControladoraAPP {

	@GetMapping({ "/", "/vista login" })
	public String index() {
		return "vista login";
	}

	@GetMapping("/vista cambio clave")
	public String vistaCambioClave() {
		return "vista cambio clave";
	}

	@GetMapping("/vista perfil")
	public String vistaPerfil() {
		return "vista perfil";
	}

}
