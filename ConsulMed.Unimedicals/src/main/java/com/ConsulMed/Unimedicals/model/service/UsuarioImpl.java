package com.ConsulMed.Unimedicals.model.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.ConsulMed.Unimedicals.model.entity.Usuario;


public class UsuarioImpl implements UsuarioService {
	
	@Autowired
	private UsuarioImpl usuarioRepository;
	

	@Override
	@Transactional(readOnly = true)
	public Iterable<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Usuario> findById(Integer Id) {
	
		return usuarioRepository.findById(Id);
	}

	@Override
	@Transactional
	public Usuario Save(Usuario usu) {
		// TODO Auto-generated method stub
		return usuarioRepository.Save(usu);
	}

	@Override
	@Transactional
	public void deleteById(Integer Id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(Id);
		
	}

}
