package com.example.ProyectoUsuarioSpring.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoUsuarioSpring.modelo.entity.Usuario;
import com.example.ProyectoUsuarioSpring.modelo.service.Usuario_Service;

@RestController
@RequestMapping(path = "api/v1/usuarios")
public class Controller_Usuario {
	@Autowired
	private Usuario_Service service;

	@GetMapping
	public Iterable<Usuario> getAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Optional<Usuario> getByID(@PathVariable Long id) {
		return service.getUser(id);
	}

	@PostMapping("/save")
	public void saveUpdate(@RequestBody Usuario usuario) {
		System.out.print("Hola" + usuario);
		service.saveOrUpdate(usuario);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}
}