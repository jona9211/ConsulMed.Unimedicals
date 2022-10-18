package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;


import com.ConsulMed.Unimedicals.model.entity.Formulacion;

public interface FormulacionService {
	public Iterable<Formulacion> findAll();
	public Optional<Formulacion> findById(Integer Id);
	public Formulacion Save (Formulacion form);
	public void deleteById(Integer Id);

}
