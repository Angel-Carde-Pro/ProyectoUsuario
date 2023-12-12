package com.example.ProyectoUsuarioSpring.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.type.descriptor.jdbc.TinyIntAsSmallIntJdbcType;
import org.hibernate.type.descriptor.jdbc.TinyIntJdbcType;

@Data
@Entity
@Table(name ="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    
    @Column(name="nombre")
    private String Nombre;
    @Column(name="clave")
    private String Clave;
    private String Email;
    private Boolean Estado;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Boolean getEstado() {
		return Estado;
	}
	public void setEstado(Boolean estado) {
		Estado = estado;
	}

    
}
