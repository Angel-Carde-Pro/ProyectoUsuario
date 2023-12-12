package com.example.ProyectoUsuarioSpring.modelo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoUsuarioSpring.modelo.entity.Usuario;

@Repository
public interface Usuario_Dao extends CrudRepository<Usuario, Long> {

}
