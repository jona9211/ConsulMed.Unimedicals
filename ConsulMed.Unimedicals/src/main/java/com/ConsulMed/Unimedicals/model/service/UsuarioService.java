package com.ConsulMed.Unimedicals.model.service;

import java.util.Optional;

import com.ConsulMed.Unimedicals.model.entity.Usuario;


public interface UsuarioService {
	
	public Iterable<Usuario> findAll();
	public Optional<Usuario> findById(Integer Id);
	public Usuario Save (Usuario usu);
	public void deleteById(Integer Id);

}
