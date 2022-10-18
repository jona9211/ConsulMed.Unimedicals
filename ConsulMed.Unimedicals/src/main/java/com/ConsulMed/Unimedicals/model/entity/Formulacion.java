package com.ConsulMed.Unimedicals.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="Formulacion")
public class Formulacion {
	@Id
	@Column(name="idFormulacion")
	@ManyToOne
	@JoinColumn(name="idFormulacion")
	private Integer idFormulacion;
	
	@Column(name="fecha_formulación")
	@ManyToOne
	@JoinColumn(name="fecha_formulación")
	private String fecha_formulación;
	
	public Formulacion(Integer idFormulacion, String fecha_formulación) {
		
		this.idFormulacion = idFormulacion;
		this.fecha_formulación = fecha_formulación;
	}

	public Formulacion() {
		
	}

	public Integer getIdFormulacion() {
		return idFormulacion;
	}

	public void setIdFormulacion(Integer idFormulacion) {
		this.idFormulacion = idFormulacion;
	}

	public String getFecha_formulación() {
		return fecha_formulación;
	}

	public void setFecha_formulación(String fecha_formulación) {
		this.fecha_formulación = fecha_formulación;
	}

	@Override
	public String toString() {
		return "Formulacion [idFormulacion=" + idFormulacion + ", fecha_formulación=" + fecha_formulación + "]";
	}
	
	
}
