package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ConsulMed.Unimedicals.model.entity.Consulta;

public class ConsultaImpl implements ConsultaService {
	
	@Autowired
	private ConsultaImpl consultaRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Consulta> findAll() {
		
		return consultaRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Consulta> findById(Integer Id) {
		
		return consultaRepository.findById(Id);
	}

	@Override
	@Transactional
	public Consulta Save(Consulta con) {
		
		return consultaRepository.Save(con);
	}

	@Override
	@Transactional
	public void deleteById(Integer Id) {
		consultaRepository.deleteById(Id);
		
	}

}
