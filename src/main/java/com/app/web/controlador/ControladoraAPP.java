package com.app.web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ControladoraAPP {

	@RequestMapping("/")
	public String login() {
		return "login";
	}   
	@RequestMapping("/cambioClave")
	public String cambioClave() {
		return "cambioClave";
	}   
	@RequestMapping("/perfil")
	public String perfil() {
		return "perfil";
	}   

}
