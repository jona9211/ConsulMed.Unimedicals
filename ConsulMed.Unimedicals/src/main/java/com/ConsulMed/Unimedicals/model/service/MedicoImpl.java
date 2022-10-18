package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ConsulMed.Unimedicals.model.entity.Medico;

public class MedicoImpl implements MedicoService{
	@Autowired
	private MedicoImpl medicoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Medico> findAll() {
		
		return medicoRepository.findAll() ;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Medico> findById(Integer Id) {
		// TODO Auto-generated method stub
		return medicoRepository.findById(Id);
	}

	@Override
	@Transactional
	public Medico Save(Medico med) {
		// TODO Auto-generated method stub
		return medicoRepository.Save(med);
	}

	@Override
	@Transactional
	public void deleteById(Integer Id) {
		// TODO Auto-generated method stub
		medicoRepository.deleteById(Id);
	}

}
