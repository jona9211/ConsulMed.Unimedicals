package com.ConsulMed.Unimedicals.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")

public class Usuario {
	
	@Id
	@Column(name="idUsuario")
	private Integer idUsuario;
	@Column(name="nombre")
	private String nombre;
	@Column(name="dirección")
	private String dirección;
	@Column(name="teléfono")
	private String teléfono;
	@Column(name="edad")
	private String edad;
	@Column(name="fecha_nac")
	private String fecha_nac;
	
	public Usuario(Integer idUsuario, String nombre, String dirección, String teléfono, String edad, String fecha_nac) {
	
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.dirección = dirección;
		this.teléfono = teléfono;
		this.edad = edad;
		this.fecha_nac = fecha_nac;
	}

	public Usuario() {
		
	}
	

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", dirección=" + dirección + ", teléfono="
				+ teléfono + ", edad=" + edad + ", fecha_nac=" + fecha_nac + "]";
	}
	
	
	

}
