package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/Habilidades")
public class Habilidadesgen {
	@GetMapping
	public String Habilidades() {
		return "Me aprofundar mais nas coisas novas que estamos aprendendo.";
	}
}
