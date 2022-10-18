package com.ConsulMed.Unimedicals.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AtenciónUsuario")

public class AtenciónUsuario {
	@Id
	@Column(name="idAtencionUsuario")
	private Integer idAtencionUsuario;
	@Column(name="dirección")
	private String dirección;
	@Column(name="teléfono")
	private String teléfono;
	
	public AtenciónUsuario(Integer idAtencionUsuario, String dirección, String teléfono) {
		
		this.idAtencionUsuario = idAtencionUsuario;
		this.dirección = dirección;
		this.teléfono = teléfono;

	}

	public AtenciónUsuario() {
		
	}

	public Integer getIdAtencionUsuario() {
		return idAtencionUsuario;
	}

	public void setIdAtencionUsuario(Integer idAtencionUsuario) {
		this.idAtencionUsuario = idAtencionUsuario;
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
		return "AtenciónUsuario [idAtencionUsuario=" + idAtencionUsuario + ", dirección=" + dirección + ", teléfono="
				+ teléfono + "]";
	}
	
	
	
	

}
