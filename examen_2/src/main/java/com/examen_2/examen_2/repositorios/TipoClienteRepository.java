package com.examen_2.examen_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen_2.examen_2.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
