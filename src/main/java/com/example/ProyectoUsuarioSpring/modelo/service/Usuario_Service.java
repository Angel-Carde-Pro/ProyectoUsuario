package com.example.ProyectoUsuarioSpring.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoUsuarioSpring.modelo.dao.Usuario_Dao;
import com.example.ProyectoUsuarioSpring.modelo.entity.Usuario;

@Service
public class Usuario_Service {
	@Autowired
	Usuario_Dao repo;

	public Iterable<Usuario> findAll() {
		return repo.findAll();
	}

	public Optional<Usuario> getUser(Long id) {
		return repo.findById(id);
	}

	public void saveOrUpdate(Usuario usuario) {
		repo.save(usuario);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
}