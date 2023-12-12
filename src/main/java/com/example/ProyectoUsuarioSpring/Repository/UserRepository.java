package com.example.ProyectoUsuarioSpring.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ProyectoUsuarioSpring.Entity.Usuario;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long>{

}
