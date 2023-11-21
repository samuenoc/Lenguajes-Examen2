package com.examen_2.examen_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen_2.examen_2.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository<TipoVehiculo, Integer> {
    
}
