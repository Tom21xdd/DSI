package com.Linio.DSI.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ControladoraAPP {

	@GetMapping({ "/", "/login" })
	public String index() {
		return "index";
	}

	@GetMapping("/menu")
	public String hello() {
		return "menu";
	}

	@GetMapping("/user")
	public String user() {
		return "user";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

}
