package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ConsulMed.Unimedicals.model.entity.Formulacion;

public class FormulacionImpl implements FormulacionService {
	
	@Autowired
	private FormulacionImpl formulacionRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Formulacion> findAll() {
		
		return formulacionRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Formulacion> findById(Integer Id) {
		
		return formulacionRepository.findById(Id);
	}

	@Override
	@Transactional
	public Formulacion Save(Formulacion form) {
		
		return formulacionRepository.Save(form);
	}

	@Override
	@Transactional
	public void deleteById(Integer Id) {
		formulacionRepository.deleteById(Id);
		
	}

}
