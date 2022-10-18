package com.ConsulMed.Unimedicals.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Consulta")

public class Consulta {
	@Id
	@Column(name="idConsulta")
	@ManyToOne
	@JoinColumn(name="idConsulta")
	
	private Integer idConsulta;
	@Column(name="fecha_consulta")
	@ManyToOne
	@JoinColumn(name="fecha_consulta")
	private String fecha_consulta;

	public Consulta(Integer idConsulta, String fecha_consulta) {
		
		this.idConsulta = idConsulta;
		this.fecha_consulta = fecha_consulta;
	}

	public Consulta() {
		
	}

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public String getFecha_consulta() {
		return fecha_consulta;
	}

	public void setFecha_consulta(String fecha_consulta) {
		this.fecha_consulta = fecha_consulta;
	}

	@Override
	public String toString() {
		return "Consulta [idConsulta=" + idConsulta + ", fecha_consulta=" + fecha_consulta + "]";
	}
	
	
	

}

