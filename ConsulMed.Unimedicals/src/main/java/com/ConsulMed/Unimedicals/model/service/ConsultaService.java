package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import com.ConsulMed.Unimedicals.model.entity.Consulta;

public interface ConsultaService {
	
	public Iterable<Consulta> findAll();
	public Optional<Consulta> findById(Integer Id);
	public Consulta Save (Consulta con);
	public void deleteById(Integer Id);

}
