package com.ConsulMed.Unimedicals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtenciónUsuarioRepository extends JpaRepository<AtenciónUsuarioRepository, Integer> {

}
