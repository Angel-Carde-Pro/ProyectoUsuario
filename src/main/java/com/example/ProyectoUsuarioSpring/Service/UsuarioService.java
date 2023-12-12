package com.example.ProyectoUsuarioSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProyectoUsuarioSpring.Entity.Usuario;
import com.example.ProyectoUsuarioSpring.Repository.UserRepository;

@Service
public class UsuarioService {
	@Autowired
	UserRepository repo;
	
	public Iterable<Usuario> findAll(){
		return repo.findAll();
	}
	
	public Optional<Usuario> getUser(Long id){
		return repo.findById(id);
	}
	
	public void saveOrUpdate(Usuario usuario) {
		repo.save(usuario);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	
	
	
}
