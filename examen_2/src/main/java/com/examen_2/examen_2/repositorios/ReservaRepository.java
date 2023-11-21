package com.examen_2.examen_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen_2.examen_2.modelos.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    
}
