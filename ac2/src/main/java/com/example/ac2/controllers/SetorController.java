package com.example.ac2.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.ac2.dtos.SetorDTO;
import com.example.ac2.dtos.DadosSetorDTO;
import com.example.ac2.services.SetorService;

@RestController
@RequestMapping("/setor")
public class SetorController {

	private final SetorService setorService;

	public SetorController(SetorService setorService) {
		this.setorService = setorService;
	}

	@PostMapping
	public void adicionar(@RequestBody SetorDTO setorDTO) {
		setorService.adicionar(setorDTO);
	}

	@GetMapping("/{id}")
	public DadosSetorDTO buscarSetorPorId(@PathVariable Integer id) {
		return setorService.buscarSetorPorId(id);
	}

}