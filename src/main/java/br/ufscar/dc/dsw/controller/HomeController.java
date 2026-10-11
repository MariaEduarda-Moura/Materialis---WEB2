package br.ufscar.dc.dsw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	/**
	 * A página inicial é o próprio catálogo de materiais, servido por
	 * MaterialController#listar (mesma view, mesmos filtros). O forward mantém a
	 * URL "/" e evita duplicar a listagem em duas telas.
	 */
	@GetMapping("/")
	public String home() {
		return "forward:/materiais/listar";
	}
}
