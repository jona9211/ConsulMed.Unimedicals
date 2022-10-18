package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ConsulMed.Unimedicals.model.entity.AtenciónUsuario;

public class AtenciónUsuarioImpl implements AtenciónUsuarioService{
	@Autowired
	private AtenciónUsuarioImpl atenciónusuarioRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<AtenciónUsuario> findAll() {
	
		return atenciónusuarioRepository.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<AtenciónUsuario> findById(Integer Id) {
		
		return atenciónusuarioRepository.findById(Id);
	}

	@Override
	@Transactional
	public AtenciónUsuario Save(AtenciónUsuario ausu) {
	
		return atenciónusuarioRepository.Save(ausu);
	}

	@Override
	@Transactional
	public void deleteById(Integer Id) {
		atenciónusuarioRepository.deleteById(Id);
		
	}

}
