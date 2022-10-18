package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import com.ConsulMed.Unimedicals.model.entity.Medico;

public interface MedicoService {

	public Iterable<Medico> findAll();
	public Optional<Medico> findById(Integer Id);
	public Medico Save (Medico med);
	public void deleteById(Integer Id);

}
