package com.ConsulMed.Unimedicals.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medico")

public class Medico {
	
	@Id
	@Column(name="idMedico")
	private Integer idMedico;
	@Column(name="nombre")
	private String nombre;
	@Column(name="dirección")
	private String dirección;
	@Column(name="teléfono")
	private String teléfono;
	
	public Medico(Integer idMedico, String nombre, String dirección, String teléfono) {
		
		this.idMedico = idMedico;
		this.nombre = nombre;
		this.dirección = dirección;
		this.teléfono = teléfono;
	}

	public Medico() {
		
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
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

	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", nombre=" + nombre + ", dirección=" + dirección + ", teléfono="
				+ teléfono + "]";
	}
	
	

}
