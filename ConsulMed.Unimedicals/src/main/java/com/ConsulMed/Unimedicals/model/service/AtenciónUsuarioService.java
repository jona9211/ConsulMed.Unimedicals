package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import com.ConsulMed.Unimedicals.model.entity.AtenciónUsuario;


public interface AtenciónUsuarioService {
	
	public Iterable<AtenciónUsuario> findAll();
	public Optional<AtenciónUsuario> findById(Integer Id);
	public AtenciónUsuario Save (AtenciónUsuario ausu);
	public void deleteById(Integer Id);

}
